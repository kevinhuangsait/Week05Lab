<%-- 
    Document   : login
    Created on : Oct 11, 2020, 4:55:43 PM
    Author     : 831719
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="home" method="post">
            Username: <input type="text" name="username" value="${username}"><br>
            Password: <input type="text" name="username" value="${username}"><br>
            <input type="submit" value="log">
    </body>
</html>
