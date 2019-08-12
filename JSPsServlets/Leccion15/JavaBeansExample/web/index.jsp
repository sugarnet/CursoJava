<%-- 
    Document   : index
    Created on : 25/09/2018, 06:45:29
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Ejemplo JabaBeans</title>
    </head>
    <body>
        <h1>Ejemplo de JavaBeans</h1>
        <a href="setterJsp.jsp">Modificar valores del Java Beans</a>
        <br>
        <a href="getterJsp.jsp">Obtener valores del Java Beans</a>
        <br>
        <br>
        Formulario 1:
        <br>
        <form name="Form1" action="setterParamJsp.jsp">
            Base: <input type="text" name="baseParam">
            <br>
            Height: <input type="text" name="heightParam">
            <input type="submit" value="Enviar">
        </form>
        <br>
        Formulario 2:
        <br>
        <form name="Form2" action="setterAllParamsJsp.jsp">
            Base: <input type="text" name="baseParam">
            <br>
            Height: <input type="text" name="heightParam">
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
