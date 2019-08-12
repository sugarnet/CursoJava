<%-- 
    Document   : expressions
    Created on : 12/09/2018, 07:46:09
    Author     : almis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Expressions</title>
    </head>
    <body>
        <h1>JSPs Expressions</h1>
        Concatenaci&oacute;n: <%= "Hola" + " Diego" %>
        <br>
        Operaci&oacute;n matem&aacute;tica: <%= 3 * 9 / 2 %>
        <br>
        SessionID: <%= session.getId() %>
        <br>
        <br>
        <a href="index.html">Regresar</a>
    </body>
</html>
