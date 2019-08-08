<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
%>
    <!-- page errorpage = "a.jsp"
    page iserrorpage = "true/false"
    
    %> page directive tag -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int a=4; %>  <!-- declaration tag-->
<%="a value is "+a+"  req = "+request.getParameter("user_name") %> <!--  print /expression tag -->
<%out.println("Hello world a = " +a);
response.sendRedirect("http://www.gmail.com");

%>  <!--  code /scriplet tag -->
</body>
</html>

<% page import="java.sql.*";  %>