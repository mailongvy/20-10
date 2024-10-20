package com.mlv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.awt.print.Book;
import java.io.IOException;
import java.util.ArrayList;

import com.DAO.BookDAO;
import com.model.BookModel;

/**
 * Servlet implementation class BookListServlet
 */
public class BookListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<BookModel> Booklist = new ArrayList<BookModel>();
		try {
			BookDAO dao = new BookDAO();
			Booklist = dao.SelectAll();
			
			System.out.println(Booklist.get(0).getId());
			
			request.setAttribute("Booklist", Booklist);
//			System.out.println(list.size());
			
			request.getRequestDispatcher("BookList.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();	
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
