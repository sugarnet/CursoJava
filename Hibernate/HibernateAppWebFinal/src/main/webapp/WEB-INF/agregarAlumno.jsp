<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Agregar Alumno</title>
    </head>
    <body>
        <h1>Agregar Alumno</h1>
        <form name="form1" action="${pageContext.request.contextPath}/ServletAgregar" method="post">
            Nombre: <input type="text" name="nombre"/>
            <br/>
            Apellido: <input type="text" name="apellido"/>
            <br/>
            <br/>
            Datos Domicilio:
            <br/>
            Calle: <input type="text" name="calle">
            <br/>
            No. Calle: <input type="text" name="noCalle"/>
            <br/>
            Pais: <input type="text" name="pais"/>
            <br/>
            <br/>
            Datos de Contacto:
            <br/>
            Email: <input type="email" name="email">
            <br/>
            Telefono: <input type="tel" name="telefono">
            <br/>
            <input type="submit" name="Agregar" value="Agregar">
        </form>
    </body>
</html>
