<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Book Shop</title>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.6.0/css/all.min.css">
	<!-- Bootstrap CSS -->
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">

	<!-- Optional Bootstrap JavaScript and jQuery -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

	<!-- CSS link -->
	<link rel="stylesheet" href="CSS/Home.css">

</head>

<body class="container-fluid">
	<div class="container Home">
		<h2 class="text-primary text-center">Book Registration</h2>

		<form action="register" method="post" class="align-items-center">
			<table class="table-hover">
				<tr class="">
					<td>Book Name</td>
					<td><input type="text" name="bookName" required></td>
				</tr>
				<tr>
					<td>Book Edition</td>
					<td><input type="text" name="bookEdition" required></td>
				</tr>
				<tr>
					<td>Book Price</td>
					<td><input type="text" name="bookPrice" ></td>
				</tr>
				<!-- <tr>
					<td><input type="submit" value="Register"></td>
					<td><input type="reset" value="Cancel"></td>
				</tr> -->

			</table>
			<div class="text-center">
				<button type="submit" class="btn btn-primary register">Register</button>
				<button type="reset" class="btn btn-danger cancel">Cancel</button>
			</div>
		</form>
		
		<p>
			${Annoucement != null ? Annoucement : ""} 
		</p>


	</div>

	<div>
		<a href="bookList">BookList</a>
	</div>
</body>

</html>