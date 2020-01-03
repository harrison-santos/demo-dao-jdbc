package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {//macete para n expor a implementa��o
		return new SellerDaoJDBC(DB.getConnection());
	}
}
