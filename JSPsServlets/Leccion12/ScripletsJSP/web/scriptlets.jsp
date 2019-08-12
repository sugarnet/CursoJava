<%-- 
    Document   : scriptlets
    Created on : 18/09/2018, 06:07:48
    Author     : almis
--%>

<%@page import="java.util.Objects"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>JSP con Scriptlets</h1>
        <br>
        <%
            out.println("Saludos desde un scriptlets...");
        %>
        <br>
        <% 
            String applicationName = request.getContextPath();
            out.println("Application Name: " + applicationName);
        %>
        <br>
        <%
            if(Objects.nonNull(session) && session.isNew()) {
        %>
                La session es NUEVA...
        <%
            } else {
        %>
                La session en ANTIGUA...
        <%
            }
        %>
        <br>
        <br>
        <h3><a href="index.html">Regresar...</a></h3>
    </body>
</html>
