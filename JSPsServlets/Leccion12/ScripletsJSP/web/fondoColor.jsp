<%-- 
    Document   : fondoColor
    Created on : 18/09/2018, 06:07:00
    Author     : almis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    String background = request.getParameter("colorFondo");
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con cambio de color de fondo</title>
    </head>
    <body style="background: <%= background %>">
        <h1>Fondo de color alicado: <%= background %></h1>
        <br>
        <h3><a href="index.html">Regresar...</a></h3>
    </body>
</html>
