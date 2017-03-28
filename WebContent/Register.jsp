<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<title>Register</title>
</head>
<body>
<div class="container">
  <div class="jumbotron">
	<form role="form" action="Register" method="POST">
		<div class="form-group">
			<label for="name">Name:</label>
			<input type="name" class="form-control" id="name" name="name" placeholder="Enter Name">
		</div>
		
		<div class="form-group">
			<label for="email">Email ID:</label>
			<input type="email" class="form-control" id="email" name="email" placeholder="Enter Email ID">
		</div>
			<div class="form-group">
			<label for="password">Password:</label>
		<input type="password" class="form-control" id="password" name="password" placeholder="Enter password">
		</div>
		<div class="form-group">
			<label for="phone">Phone No.:</label>
			<input type="phone" class="form-control" id="phone" name="phone" placeholder="Enter phone no.">
		</div>
		<span>
		<%
			String error = (String)pageContext.getServletContext().getAttribute("error");
			if(error!=null) {
			out.println(error);
			pageContext.getServletContext().removeAttribute("error");
			}
		%>
		</span>
		<br>
		<button type="submit" class="btn btn-default">REGISTER</button>
	</form>
	</div>
	</div>
</body>
</html>