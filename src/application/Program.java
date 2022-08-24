package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {
	
	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		
		
		
		/*
		Connection conn = null; 
		Statement st = null; 
		ResultSet rt = null;
		
		try {
			if(conn == null) {
				conn = DB.getConnection();
				
				st = conn.createStatement();
				rt = st.executeQuery("Select * from seller");
				while(rt.next()) {
					System.out.println(rt.getString("Name"));
				}
			}
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		
		*/
	}
}
