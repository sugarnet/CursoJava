<%-- 
    Document   : resultado
    Created on : 16/11/2019, 09:52:02
    Author     : Almis
--%>

<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="validaLogin.do">
            <div style="color: red;">${message}</div>
            Usuario: <input type="text" name="usuario">
            Password: <input type="password" name="password">
            <input type="submit" value="Logins">
        </form>
    </body>
</html>
