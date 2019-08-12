<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
  <head>
    <meta charset="UTF-8">
    <title>Detalle Usuario</title>
  </head>
  <body>
    <div id="wrap">
      <div id="header">
        <jsp:include page="/WEB-INF/pages/commons/header.jsp"/>
      </div>

      <div id="nav">
        <jsp:include page="/WEB-INF/pages/commons/menu.jsp"/>
      </div>

      <div id="msg">
        <jsp:include page="/WEB-INF/pages/commons/messages.jsp"/>
      </div>

      <div id="main">

        <div class="subtitulo">
          Detalle Usuario
        </div>

        <div class="formulario">
          <!--Es importante definir el id de la forma, ya que se validara con JavaScript -->
          <form id="form1" name="form1" action="${pageContext.request.contextPath}/ServletControlador" method="post" >

            <!-- Esta accion se va modificar por JavaScript según la opción seleccionada -->
            <input type="hidden" name="accion"  id="accion" value="guardarUsuario"/>

            <!--nos va a servir para que javascript tome el valor dinamicamente
            del nombre de la aplicacion-->
            <input type="hidden" name="contexto"  id="contexto" value="${pageContext.request.contextPath}"/>


            <!--Id persona. Si estamos editando, reenviamos el id_persona al servidor
            Esto nos permitirá distinguir si estamos Agregando(insert) o
            modificando (update) -->
            <input type="hidden" name="idUsuario" value="${usuario.idUsuario}" />

            <table align="center" class="elemento">
              <tr>
                <td>Username:</td>
                <td><input type="text" name="username" value="${usuario.username}" /></td>
              </tr>
              <tr>
                <td>Password:</td>
                <td><input type="text" name="password" value="${usuario.password}" /></td>
              </tr>
              <tr>
                <td>Persona:</td>
                <td>
                    <select name="persona">
                        <option value="">Seleccione</option>
                        <c:forEach var="persona" items="${personas}" varStatus="row">
                            <option value="${persona.idPersona}" ${persona.idPersona == usuario.idPersona ? 'selected' : ''}>
                                ${persona.apellido}, ${persona.nombre}
                            </option>
                        </c:forEach>
                    </select>
                </td>
              </tr>
            </table>

            <input type="submit" value="Guardar" />
            <input type="button" value="Cancelar"  onclick="cancelar('listarUsuarios');" />
          </form>
        </div>
      </div>
      <div id="footer">
        <jsp:include page="/WEB-INF/pages/commons/footer.jsp"/>
      </div>
    </div>
  </body>
</html>
