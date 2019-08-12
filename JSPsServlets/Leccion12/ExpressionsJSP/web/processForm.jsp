<%-- 
    Document   : processForm
    Created on : 12/09/2018, 07:46:24
    Author     : almis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos Formulario</title>
    </head>
    <body>
        <h1>Datos Formulario</h1>
        Usuario: <%= request.getParameter("user") %>
        <br>
        Password: <%= request.getParameter("psw") %>
        <br>
        <br>
        <a href="index.html">Regresar</a>
    </body>
</html>
