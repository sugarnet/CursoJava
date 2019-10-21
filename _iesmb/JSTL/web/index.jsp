<%-- 
    Document   : index
    Created on : 11/10/2019, 06:10:40
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <br>
            <h1><c:out value="Hola Mundo con JSTL!"></c:out></h1>
            <br>
            <h2>forEach</h2>
            <%
                String nombres[] = {"Juan", "Pedro", "María"};
                request.setAttribute("nombres", nombres);
            %>
            <h4>Los nombres son:</h4>
            <ul>
                <c:forEach var="nombre" items="${nombres}">
                    <li>${nombre}</li>
                </c:forEach>
            </ul>
            <c:set scope="request" var="edad" value="${ 2 * 9 }"></c:set>
            <h2>set & if</h2>
            <c:if test="${ edad >= 18 }">
                <p>Es mayor de edad...</p>
            </c:if>
            <h2>choose</h2>
            <c:set scope="request" var="pais" value="${ 'Brasil' }"></c:set>
            <c:choose>
                <c:when test="${ pais == 'Argentina' }">
                    <p>Es de Argentina</p>
                </c:when>
                <c:when test="${ pais == 'Brasil' }">
                    <p>Es de Brasil</p>
                </c:when>
                <c:when test="${ pais == 'Chile' }">
                    <p>Es de Chile</p>
                </c:when>
            </c:choose>
        </div>
    </body>
</html>
