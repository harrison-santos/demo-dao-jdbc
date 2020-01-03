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
		
		System.out.println("=== TEST 1 Seller FindById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2 Seller FindByDepartment ===");
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n=== TEST 3 Seller FindAll ===");
		list = sellerDao.findAll();
		
		for (Seller s : list) {
			System.out.println(s);
		}

		System.out.println("\n=== TEST 4 Seller FindAll ===");
		Seller newSeller = new Seller(0, "Rodolfo", "rodolfo@gmail.com", new Date(), 2500.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserido! Novo Id = " + newSeller.getId());
		
		
	}

}
