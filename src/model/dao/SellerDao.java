package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	//metodo com parametro recebendo um objeto
	void update(Seller seller);
	void insert(Seller seller);
	void deleteById(Integer id);
	Seller findById(Integer id);
	//Definindo uma lista de seller -> selecionar todos os vendedores
	List<Seller> findAll();
	//Definindo uma lista de seller com parametro recebendo um objeto do tipo Department
	List<Seller> findByDepartment(Department deparment);

}
