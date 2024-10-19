<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Book ID
				<th>Book Name
				<th>Book Edition
				<th>Book Price
			</tr>
		</thead>
		
		<c:forEach var="book" items="Booklist"></c:forEach>
		<tbody>
			<tr>
				<td>${book.getId()}
				<td>${book.getBook_name()}
				<td>${book.getBook_edition}
				<td>${book.getBook_price()}
			</tr>
		</tbody>
	</table>
</body>
</html>