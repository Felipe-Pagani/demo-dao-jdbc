package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;
//Fabrica de Dao
public class DaoFactory {
	
	//metodo para retornar a Interface SellerDao
	public static SellerDao createSellerDao() {
		//internamente vai instanciar uma implementação
		return new SellerDaoJDBC(DB.getConnection());
		
	}
	//metodo para retornar a Interface DepartmentDao
	public static DepartmentDao createDepartmentDao() {
		//internamente vai instanciar uma implementação
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}


