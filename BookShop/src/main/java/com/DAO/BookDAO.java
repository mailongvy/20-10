package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.database.Util;
import com.model.BookModel;

public class BookDAO implements DAOinterface<BookModel> {
	
	public static BookDAO getInstance() {
		return new BookDAO();
	}

	@Override
	public int Insert(BookModel t) {
		// TODO Auto-generated method stub
		int kq = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection c = Util.getConnecttion();
			
			String sql = "Insert into bookdata(Bookname, Bookedition, Bookprice) values (?,?,?)";
			
			PreparedStatement pst = c.prepareStatement(sql);
			
			pst.setString(1, t.getBook_name());
			pst.setString(2, t.getBook_edition());
			pst.setString(3, t.getBook_price()+"");
			
			kq = pst.executeUpdate();
			
			System.out.println("Ban da thuc thi cau lenh: " + sql);
			System.out.println("Co: " + kq + " dong bi thay doi");
			
			Util.closeConnection(c);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		return kq;
	}

	@Override
	public int Update(BookModel t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Delete(BookModel t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<BookModel> SelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookModel selectByID(BookModel t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<BookModel> SelectbyCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
}
