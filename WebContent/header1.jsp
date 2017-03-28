<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
    String userid = (String)session.getAttribute("userid");
//  if (userid == null) {
  //      response.sendRedirect("index.jsp");
    //}
    
    String name = (String)pageContext.getServletContext().getAttribute("name");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<header>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>                       
			</button>
			<a class="navbar-brand" href="index.jsp">Logo</a>
		</div>
	<div class="collapse navbar-collapse" id="myNavbar">
		<ul class="nav navbar-nav">
		<li class="active"><a href="index.jsp">Home</a></li>
		<li><a href="allmovies.jsp">Movies</a></li>
		<li><a href="#">Book</a></li>
		<li><a href="#">Contact</a></li>
		</ul>
		<%if (userid==null){ %>
		<ul class="nav navbar-nav navbar-right">
		<li><a href="login.jsp"><button type="button" class="glyphicon glyphicon-log-in" >Login</button></a></li>
		</ul>
                 
		<%} %>
		<%if(userid!=null) { %>
		<ul class="nav navbar-nav navbar-right">
		<li><%=name %></li>
		<li><form action="Logout" >
		<input type="submit"  value="Logout"/>
		</form></li></ul>
		<%} %>
		</div>
	</div>
     
</div>
</nav>
</header>