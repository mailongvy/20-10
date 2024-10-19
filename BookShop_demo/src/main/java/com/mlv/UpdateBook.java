package com.mlv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.DAO.BookDAO;
import com.model.BookModel;

/**
 * Servlet implementation class UpdateBook
 */
public class UpdateBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// Lấy các giá trị
		int id = Integer.parseInt(request.getParameter("id"));
		String BookName = request.getParameter("Book_name");
		String BookEdition = request.getParameter("Book_edition");
		double BookPrice = Double.parseDouble(request.getParameter("Book_price"));
		
		BookDAO dao = new BookDAO();
		BookModel b = new BookModel(id, BookName, BookEdition, BookPrice);
		int kq = dao.Update(b);
		
		if (kq != 0) {
			System.out.println("Update Successfully");
		}
		
		response.sendRedirect("bookList");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
