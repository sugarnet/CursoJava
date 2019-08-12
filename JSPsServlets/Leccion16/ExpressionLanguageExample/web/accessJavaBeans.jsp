<%-- 
    Document   : accessJavaBeans
    Created on : 27/09/2018, 06:38:30
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Access to JavaBeans</title>
    </head>
    <body>
        <h1>Access to JavaBeans</h1>
        <jsp:useBean id="rectangle" class="beans.Rectangle" />
        
        <jsp:setProperty name="rectangle" property="*" />
        <br>
        Base value: ${rectangle.base}
        <br>
        Height value: ${rectangle.height}
        <br>
        Area value: ${rectangle.area}
        <br>
        Calculate Area: ${rectangle.base * rectangle.height}
        <br>
        <br>
        <a href="index.jsp">To index...</a>
        
    </body>
</html>
