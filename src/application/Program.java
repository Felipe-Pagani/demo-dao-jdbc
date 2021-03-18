package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program{
	
	public static void main(String[] args) {
		Department department = new Department(1, "Finance");
		Seller seller = new Seller(2, "Felipe Pagani", "feh@gmail.com", new Date(), 5000.00,
				department);
		System.out.println(seller);
		
		
	}

}
