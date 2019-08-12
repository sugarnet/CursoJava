<%-- 
    Document   : scopeVars
    Created on : 04/10/2018, 06:11:15
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Scope vars</title>
    </head>
    <body>
        <h1>Scope vars</h1>
        <br>
        Request vars:
        Base: ${rectangleRequest.base}
        Height: ${rectangleRequest.height}
        Area: ${rectangleRequest.area}
        <br>
        <br>
        Session vars:
        Base: ${rectangleSession.base}
        Height: ${rectangleSession.height}
        Area: ${rectangleSession.area}
        <br>
        <br>
        Application vars:
        Base: ${rectangleApp.base}
        Height: ${rectangleApp.height}
        Area: ${rectangleApp.area}
        <br>
        <br>
        <a href="${pageContext.request.contextPath}/index.jsp">To index...</a>
    </body>
</html>
