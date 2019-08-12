<%-- 
    Document   : setterAllParamsJsp
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
        <jsp:setProperty name="rectangle" property="*" />
        
        All properties were modified:
        <br>
        <br>
        New base value: <%=request.getParameter("baseParam") %>
        <br>
        New height value: <%=request.getParameter("heightParam") %>
        
        <br>
        <br>
        <a href="index.jsp">To index...</a>
    </body>
</html>
