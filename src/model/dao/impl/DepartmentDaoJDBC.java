package model.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import java.sql.PreparedStatement;

import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class DepartmentDaoJDBC implements DepartmentDao {

	private Connection conn = null;
	
	public DepartmentDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void insert(Department obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Department obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Department findById(Integer id) {
		
		
		return null;
	}

	private Seller InstantiateSeller(ResultSet rs, Department dep) {
		// TODO Auto-generated method stub
		return null;
	}

	private Department InstantiateDepartment(ResultSet rs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
