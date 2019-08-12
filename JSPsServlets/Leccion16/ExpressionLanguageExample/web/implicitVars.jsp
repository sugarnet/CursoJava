<%-- 
    Document   : implicitVars
    Created on : 27/09/2018, 06:38:45
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL and implicit vars</title>
    </head>
    <body>
        <h1>EL and implicit vars</h1>
        <ul>
            <li>Application name: ${pageContext.request.contextPath}</li>
            <li>Browser: ${header["User-Agent"]}</li>
            <li>Session ID: ${cookie.JSESSIONID.value}</li>
            <li>Web server: ${pageContext.servletContext.serverInfo}</li>
            <li>User value: ${param["user"]}</li>
        </ul>
        <br>
        <br>
        <a href="index.jsp">To index...</a>
    </body>
</html>
