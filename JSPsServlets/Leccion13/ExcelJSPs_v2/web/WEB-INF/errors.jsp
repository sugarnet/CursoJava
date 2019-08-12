<%-- 
    Document   : errors
    Created on : 19/09/2018, 07:13:24
    Author     : almis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<%@page import="java.io.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manejo de errores</title>
        <script src="<%= request.getContextPath() %>/resources/functions.js"></script>
    </head>
    <body>
        <h1>Manejo de errores</h1>
        <br>
        <br>
        Ocurri&oacute; un error:
        <%= exception.getMessage() %>
        <br>
        <br>
        <a href="<%= request.getContextPath() %>/index.html">A inicio...</a>
        <br>
        <br>
        <a href="#" onclick="change('message')">Ver detalles</a>
        <div id="message" style="position: relative; visibility: hidden;">
            <pre>
                <% exception.printStackTrace(new PrintWriter(out)); %>
            </pre>
        </div>
    </body>
</html>
