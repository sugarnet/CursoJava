<%-- 
    Document   : setterJsp
    Created on : 25/09/2018, 06:45:58
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP wich update a JavaBeans</title>
    </head>
    <body>
        <h1>JSP wich update a JavaBeans</h1>
        <jsp:useBean id="rectangle" class="beans.Rectangle" scope="session" />
        
        Update properties:
        <br>
        <br>
        
        <%
            int baseValue = 5;
            int heightValue = 10;
        %>
        
        <jsp:setProperty name="rectangle" property="base" value="<%=baseValue %>" />
        
        New base value: <%=baseValue %>
        <br>
        <jsp:setProperty name="rectangle" property="height" value="<%=heightValue %>" />
        
        New base value: <%=heightValue %>
        
        <br>
        <br>
        <a href="index.jsp">To index...</a>
    </body>
</html>
