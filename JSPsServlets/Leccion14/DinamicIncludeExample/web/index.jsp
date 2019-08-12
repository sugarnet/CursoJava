<%-- 
    Document   : privateResource
    Created on : 22/09/2018, 08:49:10
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo de inclusi&oacute;n din&aacute;mica</title>
    </head>
    <body>
        <br>
        <jsp:include page="WEB-INF/privateResource.jsp">
            <jsp:param name="backgroundColor" value="yellow"></jsp:param>
        </jsp:include>
        <br>
        <jsp:include page="publicResource.jsp"></jsp:include>
    </body>
</html>
