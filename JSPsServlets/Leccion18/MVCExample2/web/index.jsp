<%-- 
    Document   : index
    Created on : 03/10/2018, 08:05:07
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MVC Example 2</title>
    </head>
    <body>
        <h1>MVC Example 2</h1>
        <div style="color: red;">${message}</div>
        <br>
        <a href="${pageContext.request.contextPath}/ServletController">Link to servlet controller without params</a>
        <br>
        <br>
        <a href="${pageContext.request.contextPath}/ServletController?action=addVars">Link to servlet controller for add vars</a>
        <br>
        <br>
        <a href="${pageContext.request.contextPath}/ServletController?action=listVars">Link to servlet controller for list vars</a>
        
    </body>
</html>
