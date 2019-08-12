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
        <title>People List</title>
    </head>
    <body>
        <h1>List of People!</h1>
        
        <a href="addPerson.jsp">
            Add person
        </a>
        <br/>
        <br/>
        <table border="1">
            <tr>
                <th>Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Action</th>
            </tr>
            <c:forEach items="${people}" var="person">
                <tr>
                    <td>${person.name}</td>
                    <td>${person.lastName}</td>
                    <td>${person.email}</td>
                    <td><a href="PersonServlet?action=edit&id=${person.id}">Edit</a></td>
                </tr>
            </c:forEach>
        </table>
        <br>
        <a href="index.html">Return...</a>
</html>
