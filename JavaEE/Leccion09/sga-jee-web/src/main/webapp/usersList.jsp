<%-- 
    Document   : usersList
    Created on : 24/12/2018, 07:09:18
    Author     : Diego
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User List</title>
    </head>
    <body>
        <h1>List of users!</h1>
        <table border="1">
            <tr>
                <th>Username</th>
                <th>Password</th>
                <th>Name</th>
                <th>Last Name</th>
            </tr>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.username}</td>
                    <td>${user.password}</td>
                    <td>${user.person.name}</td>
                    <td>${user.person.lastName}</td>
                </tr>
            </c:forEach>
        </table>
        <br>
        <a href="index.html">Return...</a>
    </body>
</html>
