<%-- 
    Document   : coreJSTL
    Created on : 03/10/2018, 06:34:21
    Author     : Diego
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Core</title>
    </head>
    <body>
        <h1>JSTL Core</h1>
        <c:set var="name" value="Willy" />
        Name: <c:out value="${name}" />
        
        <br>
        <br>
        
        Var with code html:
        <c:out value="<h1>Hola</h1>" escapeXml="true" />
        
        <br>
        <br>
        
        <c:set var="flag" value="true" />
        
        <c:if test="${flag}">
            The flag is true
        </c:if>
            
        <br>
        
        <c:if test="${param.option != null}">
            <c:choose>
                <c:when test="${param.option == 1}">
                    <br>Option 1 selected<br>
                </c:when>
                <c:when test="${param.option == 2}">
                    <br>Option 2 selected<br>
                </c:when>
                <c:otherwise>
                    <br>Option ${param.option} selected<br>
                </c:otherwise>
            </c:choose>
        </c:if>
                    
        <%
            String names[] = {"Alma", "Sol", "Diego"};
            request.setAttribute("names", names);
        %>
        
        <br>
        
        List names of array
        
        <br>
        <ul>
            <c:forEach varStatus="status" var="person" items="${names}">
                <li>${status.count} - Name: ${person}</li>
            </c:forEach>
        </ul>
        <br>
        
        <a href="index.jsp">To index...</a>
    </body>
</html>
