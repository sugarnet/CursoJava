<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>Add Person</title>
    </head>
    <body>
        <h1>Add Person</h1>
        <form action="PersonServlet" method="post">
            <input type="hidden" name="action" value="add"/>
            <label for="name">Name:</label>
            <input type="text" name="name" style="display: block;" />
            <label for="lastname">Last Name:</label>
            <input type="text" name="lastname" style="display: block;"/>
            <label for="email">eMail:</label>
            <input type="text" name="email" style="display: block;"/>
            <label for="phone">Phone:</label>
            <input type="text" name="phone" style="display: block;"/>
            <input type="submit" value="Save" />
        </form>
        <a href="index.html">return</a>
    </body>
</html>