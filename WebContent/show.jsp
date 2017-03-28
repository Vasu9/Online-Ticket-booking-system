<%-- 
    Document   : show
    Created on : Apr 20, 2016, 3:17:30 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Add Show</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="page-header">
            <h2>Add Show! </h2>
        </div>
        <form class="form-horizontal" role="form" action="ShowServlet" method="POST">
            <div class="form-group">
                <label for="movie" class="control-label col-sm-2">Movie Name:</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="movie" name="mname"></div>
            </div>
            <div class="form-group">
                <label for="theatre" class="control-label col-sm-2">Theatre Name:</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="theatre" name="tname"></div>
            </div>
            <div class="form-group">
                <label for="sdate" class="control-label col-sm-2">Start Date:</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="sdate" name="sdate"></div>
            </div>
             <div class="form-group">
                <label for="edate" class="control-label col-sm-2">End Date:</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="edate" name="edate"></div>
            </div>
             <div class="form-group">
                <label for="shows" class="control-label col-sm-2">Shows</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="shows" name="shows"></div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-success">Submit!</button></div>
            </div>

        </form>
    </body>
</html>
