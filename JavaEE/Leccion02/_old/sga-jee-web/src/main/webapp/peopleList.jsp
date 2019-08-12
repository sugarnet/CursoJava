<%-- 
    Document   : peopleList
    Created on : 26/11/2018, 06:24:28
    Author     : Diego
--%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>People List</title>
    </head>
    <body>
        <h1>People List</h1>
        <ul>
            <c:forEach items="${people}" var="person">
                <li>${person.name} ${person.lastName}</li>
            </c:forEach>
        </ul>
    </body>
</html>
