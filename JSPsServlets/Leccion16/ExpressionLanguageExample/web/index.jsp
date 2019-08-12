<%-- 
    Document   : index
    Created on : 27/09/2018, 06:38:00
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Expression Language Example</title>
    </head>
    <body>
        <h1>Expression Language Example</h1>
        <br>
        <a href="implicitVars.jsp?user=david">Implicit objects with EL</a>
        <br>
        <br>
        
        <h3>HTML Form:</h3>
        <br>
        <form name="form1" action="accessJavaBeans.jsp">
            Base:<input type="text" name="base" />
            <br>
            Height:<input type="text" name="height" />
            <input type="submit" value="Send">
        </form>
    </body>
</html>
