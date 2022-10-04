<%-- 
    Document   : home
    Created on : Oct 4, 2022, 8:46:21 AM
    Author     : OS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <h2>Hello ${username}</h2>
            
        <a href="home?action=logout">Log out</a>
    </body>
</html>
