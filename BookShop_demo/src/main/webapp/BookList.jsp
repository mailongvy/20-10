<%@page import="com.DAO.BookDAO"%>
<%@page import="com.model.BookModel"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/BookList.css">
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Book ID
				<th>Book Name
				<th>Book Edition
				<th>Book Price
				<th>Edit
				<th>Delete
			</tr>
		</thead>
		<%
			
			
		%>
		<c:forEach var="book" items="${Booklist}">
			<tbody>
			<tr>
				<td>${book.getId()}
				<td>${book.getBook_name()}
				<td>${book.getBook_edition()}
				<td>${book.getBook_price()}
				<td><a href="edit_book?id=${book.getId()}">Edit</a>
				<td><a href="delete_book?id=${book.getId()}">Delete</a>
			</tr>
		</tbody>
		</c:forEach>
		
	</table>
	
	
	
	<a href="Home.jsp">Home</a>
</body>
</html>