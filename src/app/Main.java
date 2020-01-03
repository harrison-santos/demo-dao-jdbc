package app;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		Department department = new Department(2, null);
		
		System.out.println("=== Seller FindById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("=== Seller FindByDepartment ===");
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller s : list) {
			System.out.println(s);
		}
		
		
		
	}

}
