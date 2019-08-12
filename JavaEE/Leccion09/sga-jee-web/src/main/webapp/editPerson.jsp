<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>Edit Person</title>
        
        <script type='text/javascript'>
            function setAction(action) {
                document.getElementById("action").value = action;
                document.getElementById("entityForm").submit();
            }
        </script>
    </head>
    <body>
        <h1>Edit Person</h1>
        <form action="PersonServlet" id="entityForm" method="post">
            <input type="hidden" id="action" name="action" value=""/>
            <input type="hidden" name="id" value="${person.id}"/>
            <label for="nombre">Name:</label>
            <input type="text" name="name" value="${person.name}" style="display: block;" />
            <label for="apePaterno">Last Name:</label>
            <input type="text" name="lastname" value="${person.lastName}" style="display: block;"/>
            <label for="email">eMail:</label>
            <input type="text" name="email" value="${person.email}" style="display: block;"/>
            <label for="telefono">Phone:</label>
            <input type="text" name="phone" value="${person.phone}" style="display: block;"/>
            <button name="save" onclick="setAction('update');">Save</button> 
            <button name="delete" onclick="setAction('delete');">Delete</button> 
        </form>
    </body>
</html>