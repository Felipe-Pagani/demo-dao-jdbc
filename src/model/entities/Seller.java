package model.entities;

import java.io.Serializable;
import java.util.Date;

//Classe seller
public class Seller implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String email;
	private Date birthDate;
	private Double baseSalary;
	
	private Department department;
	
	//Construtor padrao - vazio
	public Seller() {

	}
	//Construtor com parametro e seus tipos de dados
	public Seller(Integer id, String name, String email, Date birthDate, Double baseSalary,
			Department department) {
		//Referenciando o proprio objeto da classe.
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.baseSalary = baseSalary;
		this.department = department;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	} 
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
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
		Seller other = (Seller) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	//metodo toString -> transforma todos os atributos da classe em String.
	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + 
				email + ", birthDate=" + birthDate + ", baseSalary=" + baseSalary + "]";
	}
}
