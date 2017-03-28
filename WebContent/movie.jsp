
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Add Movie</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="page-header">
            <h2>Add Movie! </h2>
        </div>
        <form class="form-horizontal" role="form" action="movieServlet" method="post">
            <div class="form-group">
                <label for="movie" class="control-label col-sm-2">Movie Name:</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="movie" name="movie"></div>
            </div>
            <div class="form-group">
                <label for="rdate" class="control-label col-sm-2">Release Date</label>
                <div class="col-sm-8">
                    <input type="date" class="form-control" id="rdate" name="rdate"></div>
            </div>
            <div class="form-group">
                <label for="genre"class="control-label col-sm-2">Movie Genre</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="genre" name="genre"></div>
            </div>
            <div class="form-group">
                <label for="dir"class="control-label col-sm-2">Director</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="dir" name="dir"></div>
            </div>
            <div class="form-group">
                <label for="dur"class="control-label col-sm-2">Duration</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="dur" name="dur"></div>
            </div>
            <div class="form-group">
                <label for="cast"class="control-label col-sm-2">cast</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="cast" name="cast"></div>
            </div>
            
            <div class="form-group">
                <label for="disc"class="control-label col-sm-2">Movie description</label>
                <div class="col-sm-8">
                    <textarea class="form-control" rows="5" id="disc" name="disc"></textarea></div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">REGISTER</button>
            </div>

        </form>
    </body>
</html>
