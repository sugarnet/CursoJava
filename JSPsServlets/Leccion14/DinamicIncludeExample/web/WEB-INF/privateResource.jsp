<%
    String backgroundColor = request.getParameter("backgroundColor");
    
    if(backgroundColor.isEmpty()) {
        backgroundColor = "white";
    }
%>

<body style="background: <%= backgroundColor %>">
    Despliegue de un recurso privado...
</body>