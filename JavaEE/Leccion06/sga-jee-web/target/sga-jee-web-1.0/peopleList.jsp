<%-- 
    Document   : peopleList
    Created on : 23/12/2018, 10:37:02
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
        <h1>List of People!</h1>
        <ul>
            <c:forEach items="${people}" var="person">
                <li>${person.name} ${person.lastName}</li>
            </c:forEach>
        </ul>
    </body>
</html>
