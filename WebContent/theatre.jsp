


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Add Theatre</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="page-header">
            <h2>Add Theatre! </h2>
        </div>
        <form class="form-horizontal" role="form" action="theaterServlet" method="POST">
            <div class="form-group">
                <label for="theatre" class="control-label col-sm-2">Theatre Name:</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="theatre" name="tname"></div>
            </div>
            <div class="form-group">
                <label for="loc" class="control-label col-sm-2">Location</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="loc" name="location"></div>
            </div>
            <div class="form-group">
                <label for="city" class="control-label col-sm-2">City</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="city" name="city"></div>
            </div>
            <div class="form-group">
                <label for="seat" class="control-label col-sm-2">Seats</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="seat" name="seat"></div>
            </div>
             <div class="form-group">
                <label for="cost" class="control-label col-sm-2">Cost</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="cost" name="cost"></div>
            </div>
             <div class="form-group">
                <label for="phn" class="control-label col-sm-2">Phone Number:</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="phn" name="phn"></div>
            </div>
                           
		<%
			String error = (String)pageContext.getServletContext().getAttribute("error");
			if(error!=null) {
			out.println(error);
			pageContext.getServletContext().removeAttribute("error");
			}
		%>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-success">Submit!</button></div>
            </div>

        </form>
    </body>
</html>
