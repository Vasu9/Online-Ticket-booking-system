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

<title>login</title>
</head>
<body>
<div class="container">
  <div class="jumbotron">
	<form role="form" action="login" method="POST">
		<div class="form-group">
			<label for="username">Name:</label>
			<input type="username" class="form-control" id="username" name="username" placeholder="Enter Name">
		</div>
		<div class="form-group">
			<label for="password">Password:</label>
			<input type="password" class="form-control" id="password" name="password" placeholder="Enter password">
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
		<button type="submit" class="btn btn-default">Submit</button>
	
		<p>Still not connected?<a href="Register.jsp">Sign-up</a></p>
	
	</form>
</div>
</div>


</body>
</html>