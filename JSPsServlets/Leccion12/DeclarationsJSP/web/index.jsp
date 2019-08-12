<%-- 
    Document   : index
    Created on : 18/09/2018, 06:46:07
    Author     : almis
--%>

<%!
    private String user = "Albert";

    private String getUser() {
        return this.user;
    }

    private int visitCount = 1;
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de declaraciones</title>
    </head>
    <body>
        <h1>Uso de declaraciones</h1>
        Usuario por medio del atributo: <%= this.user %>
        <br>
        Usuario por medio del método: <%= this.getUser() %>
        <br>
        
        Contador de visitas desde que se reinició el server: <%= visitCount++ %>
    </body>
</html>
