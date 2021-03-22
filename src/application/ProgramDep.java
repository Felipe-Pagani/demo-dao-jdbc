package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDep {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = new Department();
		
		System.out.println("\n ==== TEST 1: department insert ====");
		Department newDepartment = new Department(null, "Finances");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n ==== TEST 2: department findById  ====");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println("\n ==== TEST 3: department update  ====");
		department = departmentDao.findById(3);
		department.setName("Technology");
		departmentDao.update(department);
		System.out.println("Update Completed");
		
		System.out.println("\n  ==== TEST 4: department delete  ====");
		System.out.print("id delete? ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete Completed! " + id);
		
		System.out.println("\n  ==== TEST 5: department findAllId  ====");
		List<Department> obj = departmentDao.findAll();
		obj.forEach(System.out::println);
		
		sc.close();
		
		
//		
		
		
		
		                      
		
		
		
		
	}

}
