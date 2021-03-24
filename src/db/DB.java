package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


//Classe do db -> definindo as config
public class DB {

	//definindo um objeto de conexao de dados do JDBC.
	//inicinando com um valor nulo
	private static Connection conn = null;
	
	//Metodo que faz a conexão com o db
	public static Connection getConnection() {
		//se conn for igual a nulo -> ele faz a conexao com o db
		//caso essa condição falhe -> ele pula a condição e retorna uma conexão existente
		if (conn == null) {
			//Tratamento de possíveis erros 
			try {
				//definindo propriedades de conexão
				//pegando as propriedaes do db com o método loadProperties
				Properties props = loadProperties();
				//String url do db -> acessando o objeto props e chamando a função getProperty e 
				//passando a url do db;
				String url = props.getProperty("dburl");
				//Passando url do db e as propriedades de conexao do db
				conn = DriverManager.getConnection(url, props);
				//Caso aconteça alguma Exception -> faz a captura e lança uma Exception personalizada
			} catch (SQLException e) {
				//lançando uma Exception personalizada
				throw new DbException(e.getMessage());
			}
		}
		//retorna o objeto conn
		return conn;
	}
	//metodo para fechar a conexao do db
	public static void closeConnection() {
		//se conn é diferente de nulo a conexão fecha
		if (conn != null) {
			//Tratamento de possíveis erros 
			try {
				//fechamento da conexao
				conn.close();
				//caso aconteça alguma Exception -> faz a captura e lança uma Exception personalizada
			} catch (SQLException e) {
				//lançando uma Exception personalizada
				throw new DbException(e.getMessage());
			}
		}
	}
	
	//metodo que retorna o objeto Properties
	//metodo para carregar as propriedades que estão definidas no arquivo db.properties
	private static Properties loadProperties() {
		//Tratamento de possíveis erros 
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			//instanciando um objeto do tipo Properties
			Properties props = new Properties();
			//faz a leitura do arquivo db.properties apontando para o
			//fs e guarda os dados dentro do objeto props
			props.load(fs);
			//Retorna o props
			return props;
			//Caso aconteça alguma Exception -> faz a captura e lança uma Exception personalizada
		} catch (IOException e) {
			//lançando uma Exception personalizada
			throw new DbException(e.getMessage());
		}
	}
	
	//metodo auxliar para fechar um objeto do tipo Statement
	public static void closeStatement(Statement st) {
		//se st for diferente de nulo ele chama o st.close()
		if (st != null) {
			//Tratando possíveis erros 
			try {
				//fechamento do Statement
				st.close();
				//Caso aconteça alguma Exception -> faz a captura e lança uma Exception Personalizada
			} catch (SQLException e) {
				//lançando uma Exception Personalizada
				throw new DbException(e.getMessage());
			}
		}
	}
	//metodo auxliar para fechar um objeto do tipo ResultSet
	public static void closeResultSet(ResultSet rs) {
		//se rs for diferente de nulo ele chama o rs.close()
		if (rs != null) {
			//Tratando possíveis erros 
			try {
				//fechamento do ResultSet
				rs.close();
				//Caso aconteça alguma Exception -> faz a captura e lança uma Exception personalizada
			} catch (SQLException e) {
				//lançando uma Exception personalizada
				throw new DbException(e.getMessage());
			}
		}
	}
}
