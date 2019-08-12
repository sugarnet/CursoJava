<%-- 
    Document   : setterParamJsp
    Created on : 25/09/2018, 06:46:19
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP wich update a JavaBeans by parameters</title>
    </head>
    <body>
        <h1>JSP wich update a JavaBeans by parameters</h1>
        <jsp:useBean id="rectangle" class="beans.Rectangle" scope="session" />
        
        Update properties:
        <br>
        <br>
        <jsp:setProperty name="rectangle" property="base" param="baseParam" />
        New base value: <%=request.getParameter("baseParam") %>
        <br>
        <jsp:setProperty name="rectangle" property="height" param="heightParam" />
        New height value: <%=request.getParameter("heightParam") %>
        
        <br>
        <br>
        <a href="index.jsp">To index...</a>
    </body>
</html>
