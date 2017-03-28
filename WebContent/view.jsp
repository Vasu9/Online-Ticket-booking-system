<%-- 
    Document   : view
    Created on : Apr 21, 2016, 9:56:02 AM
    Author     : hp
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="onlineTicket.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    ArrayList<show> list = (ArrayList<show>) request.getServletContext().getAttribute("showsList");
    System.out.println("List is null " +(list == null));
    request.getServletContext().removeAttribute("showsList");

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>view details</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </head>
    <body>
        <%@include file="header.jsp" %>
        
        <div class="container">

            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>Movie</th>
                        <th>Theatre</th>
                        <th>Start Date</th>
                        <th>End Date</th>
                        <th>Shows</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        for (show s : list) {
                    %>
                    <tr>
                        <td><%=s.getMoviename()%> </td>
                        <td><%=s.getTheatrename()%></td>
                        <td><%=s.getStart()%></td>
                        <td><%=s.getEnd()%></td>
                        <td><%=s.getTimings()%></td>
                    </tr>
                    <%
                        }
                    %>
                   
                </tbody>
            </table>
        </div>
    </body>
</html>
