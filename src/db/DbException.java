package db;


//Classe DbException -> Exception personalizada
//a classe possui uma propriedade com a classe RunTimeException
public class DbException extends RuntimeException {
	// serialVersionUID = 1L | primeira versão da classe
	private static final long serialVersionUID = 1L;
	// Construtor recebendo um parametro do tipo String
	public DbException(String msg) {
		// super classe RunTimeException
		super(msg);
	}
}
