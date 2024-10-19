<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="updateBook" method="post" class="align-items-center">
			<input type="hidden" name="id" value="${book.getId()}" placeholder="${book.getId()}">
			<table class="table-hover">
				<tr class="">
					<td>Book Name</td>
					<td><input type="text" name="Book_name" value="${book.getBook_name()}" placeholder="${book.getBook_name()}"></td>
				</tr>
				<tr>
					<td>Book Edition</td>
					<td><input type="text" name="Book_edition" value="${book.getBook_edition()}"></td>
				</tr>
				<tr>
					<td>Book Price</td>
					<td><input type="text" name="Book_price" value="${book.getBook_price()}"></td>
				</tr>
				<!-- <tr>
					<td><input type="submit" value="Register"></td>
					<td><input type="reset" value="Cancel"></td>
				</tr> -->

			</table>
			<div class="text-center">
				<button type="submit">Update</button>
			</div>
		</form>

<!-- 	<form action="updateBook"> -->
<%-- 		<input type="hidden" name="id" value="${book.getId()}" placeholder="${book.getId()}"> --%>
<%-- 		<input type="text" name="Book_name" value="${book.getBook_name()}" placeholder="${book.getBook_name()}"> --%>
<%-- 		<input type="text" name="Book_edition" value="${book.getBook_edition()}"> --%>
<%-- 		<input type="text" name="Book_price" value="${book.getBook_price()}"> --%>
<!-- 		<button type="submit">Update</button> -->
<!-- 	</form> -->
</body>
</html>