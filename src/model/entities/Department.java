package model.entities;

import java.io.Serializable;

//Classe Department
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;

	//Construtor vazio
	public Department() {

	}

	//Construtor com parametros e seus tipos de dados
	public Department(Integer id, String name) {
		//Referenciando o proprio objeto da classe.
		this.id = id;
		this.name = name;
		
	}
	
	
	//getters e setters
	//metodo para retornar um atributo/variavel -> acessores ou consultores de acesso
	public int getId() {
		return id;
	}
	
	//metodo para definir um atributo/variavel -> modificadores de acesso
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//hashCode e equals -> compara um id com outro
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (id != other.id)
			return false;
		return true;
	}

	//metodo toString -> transforma todos os atributos da classe em String.
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	

}
