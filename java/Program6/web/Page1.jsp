<%-- 
    Document   : Page1
    Created on : 26 Dec, 2022, 2:37:14 PM
    Author     : mcacnj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page1JSP Page</title>
    </head>
    <body>
        <h1>Jsp Include</h1>
        First Name:<%= request.getParameter("Fname") %><br>
        Last Name:<%= request.getParameter("Lname") %><br>
        Address: <%= request.getParameter("Address") %><br>
    </body>
</html>
