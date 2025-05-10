<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date, java.text.SimpleDateFormat" %>
<%
Date date = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
String today = sdf.format(date);
%>
<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <title>Homepage</title>
    </head>
    <body>
        <h2>Hello Servlet!</h2>
        <p>Date: <%= today %></p>
        <a href="http://localhost:8080/jsp-servlet-project/form.jsp">Form Page</a>
    </body>
</html>
