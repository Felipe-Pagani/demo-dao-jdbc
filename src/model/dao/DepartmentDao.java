package model.dao;

import java.util.List;

import model.entities.Department;

//Inferface DepartmentDao
public interface DepartmentDao {
	//metodo com parametro recebendo um objeto
	void insert(Department departament);
	void update(Department department);
	void deleteById(Integer id);
	Department findById(Integer id);
	//Lista de Department -> seleciona todos os departamentos
	List<Department> findAll();
		
	
	

}
