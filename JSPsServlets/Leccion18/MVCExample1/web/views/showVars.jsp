<%-- 
    Document   : showVars
    Created on : 03/10/2018, 08:05:21
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show vars</title>
    </head>
    <body>
        <h1>Show vars</h1>
        
        Var in request scope:
        ${message}
        
        <br>
        <br>
        
        Var in session scope
        <br>
        Rectangle:
        Base: ${rectangle.base}
        Height: ${rectangle.height}
        Area: ${rectangle.area}
        
        <br>
        <br>
        
        <a href="${pageContext.request.contextPath}/index.jsp">To index...</a>
        
    </body>
</html>
