<%-- 
    Document   : index
    Created on : 12/09/2018, 06:54:37
    Author     : almis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola Mundo JSP</title>
    </head>
    <body>
        <h1>Hola Mundo con JSP</h1>
        <ul>
            <li>Hola mundo con HTML</li>
            <li><% out.print("Hola mundo con Scriptlets"); %></li>
            <li>${"Hola mundo con Expression Language (EL)"}</li>
            <li><c:out value="Hola mundo con JSTL" /></li>
        </ul>
        <ul>
            <li>Hola <%= new java.util.Date() %></li>
            <li>Contexto de la aplicaci&oacute;n <%= request.getContextPath() %></li>
            <li>Valor del par&aacute;metro x: <%= request.getParameter("x") %></li>
        </ul>
    </body>
</html>
