package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
			pst.setString(3, t.getBook_price() + "");

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
		int kq = 0;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection c = Util.getConnecttion();

			String sql = "Update bookdata set Bookname = ?, Bookedition = ?, Bookprice = ? where id = ?";

			PreparedStatement pst = c.prepareStatement(sql);

			pst.setString(1, t.getBook_name());
			pst.setString(2, t.getBook_edition());
			pst.setDouble(3, t.getBook_price());
			pst.setInt(4, t.getId());
			

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
	public int Delete(BookModel t) {
		// TODO Auto-generated method stub
		int kq = 0;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection c = Util.getConnecttion();

			String sql = "Delete from bookdata where id = ?";

			PreparedStatement pst = c.prepareStatement(sql);

			pst.setInt(1, t.getId());
			

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
	public ArrayList<BookModel> SelectAll() {
		// TODO Auto-generated method stub
		ArrayList<BookModel> kq = new ArrayList<BookModel>();
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection c = Util.getConnecttion();

			String sql = "Select * from bookdata";

			PreparedStatement pst = c.prepareStatement(sql);

			System.out.println("Ban da thuc thi cau lenh");
			System.out.println(sql);

			// để chon tạo ra result set gồm nhiều dòng

			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("ID");
				String Bookname = rs.getString("Bookname");
				String Bookedition = rs.getString("Bookedition");
				double Bookprice = rs.getDouble("Bookprice");

				BookModel b = new BookModel(id, Bookname, Bookedition, Bookprice);

				kq.add(b);

			}

			Util.closeConnection(c);

			System.out.println(kq.size());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return kq;
	}

	@Override
	public BookModel selectByID(BookModel t) {
		// TODO Auto-generated method stub
		BookModel kq = new BookModel();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection c = Util.getConnecttion();
			
			String sql = "Select * from bookdata where id = ?";
			PreparedStatement pst = c.prepareStatement(sql);
			pst.setInt(1, t.getId());
			
			System.out.println("Ban da thuc thi cau lenh");
			System.out.println(sql);
			
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				int id = rs.getInt("ID");
				String Bookname = rs.getString("Bookname");
				String Bookedition = rs.getString("Bookedition");
				double Bookprice = rs.getDouble("Bookprice");

				kq= new BookModel(id, Bookname, Bookedition, Bookprice);
				
				
			}
			
			Util.closeConnection(c);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return kq;
	}

	@Override
	public ArrayList<BookModel> SelectbyCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
