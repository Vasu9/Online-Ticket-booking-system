<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Movie</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</head>
<body>
<%@include file="header1.jsp" %>

<br>
<br>
		

<%
        String movieName = (String)request.getServletContext().getAttribute("movieName");
		String releasedate = (String)request.getServletContext().getAttribute("releasedate");
		String duration = (String)request.getServletContext().getAttribute("duration");
		String director = (String)request.getServletContext().getAttribute("director");
		String cast = (String)request.getServletContext().getAttribute("cast");
		String synopsis = (String)request.getServletContext().getAttribute("synopsis");
		String genre = (String)request.getServletContext().getAttribute("genre");
		long mid = (long)request.getServletContext().getAttribute("mid"); 
%>
<div class="page-header row">
	<div class="col-sm-4 text-center">
	<h2><%=movieName %> </h2></div>
</div>
        
</div>
<div class = "container">
<div class = "jumbotron">
<h3>Description:</h3>
<p><%=synopsis %></p>
<h3>Release date : </h3>
<p><%=releasedate %></p>
<h3>Director : </h3>
<p><%=director %></p>
<h3>Cast : </h3>
<p><%=cast %></p>
<h3>Genre : </h3>
<p><%=genre %></p>
</div>
</div>

</body>
</html>