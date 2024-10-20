package com.mlv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.DAO.BookDAO;
import com.model.BookModel;

/**
 * Servlet implementation class Register
 */
public class Register1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String Bookname = request.getParameter("bookName");
		String Bookedition = request.getParameter("bookEdition");
		double Bookprice = Double.parseDouble(request.getParameter("bookPrice"));
		// tạo 1 model để lưu các giá trị ms vừa nhập
		BookModel b1 = new BookModel(Bookname, Bookedition, Bookprice);
		// biến kq lưu kq thêm vao jdbc
		int kq = 0;
		
		try {
			
			BookDAO dao = new BookDAO();
			kq = dao.Insert(b1);
			
			
			if (kq != 0) {
				request.setAttribute("Annoucement", "Add Successfully " + kq + "result");
				request.getRequestDispatcher("home.html").forward(request, response);

			} else {
				request.setAttribute("Annoucement", "Fail !!! Please Try Again");
				request.getRequestDispatcher("home.html").forward(request, response);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		

		
		
		
		
	}

}
