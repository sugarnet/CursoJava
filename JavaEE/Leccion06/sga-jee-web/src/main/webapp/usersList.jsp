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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List of users!</h1>
        <ul>
            <c:forEach items="${users}" var="user">
                <li>${user.username} -> ${user.password}</li>
            </c:forEach>
        </ul>
    </body>
</html>
