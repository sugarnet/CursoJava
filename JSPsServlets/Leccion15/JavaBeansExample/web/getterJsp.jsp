<%-- 
    Document   : getterJsp
    Created on : 25/09/2018, 06:45:43
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP wich read values from JavaBeans</title>
    </head>
    <body>
        <h1>JSP wich read values from JavaBeans</h1>
        <jsp:useBean id="rectangle" class="beans.Rectangle" scope="session" />
        
        <br>
        Base value: <jsp:getProperty name="rectangle" property="base" />
        <br>
        Height value: <jsp:getProperty name="rectangle" property="height" />
        <br>
        Area Value: <jsp:getProperty name="rectangle" property="area" />
        <br>
        <br>
        <a href="index.jsp">To index...</a>
    </body>
</html>
