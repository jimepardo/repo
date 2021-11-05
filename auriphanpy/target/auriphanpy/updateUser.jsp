<%@ page import="models.User, java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Actualizar usuario</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>

</head>
<body>
<h2>Actualizar usuario</h2>
<br>

<% if (session.getAttribute("user") != null ) {
    User u = (User) session.getAttribute("user");
    out.println("<form action='updateUser' method='post'> ");
    out.println(" <p> Nombre: <input type='text' name='firstName' value='"+ u.getFirstName() +"'> </p> ");
    out.println(" <p> Apellido: <input type='text' name='lastName' value='"+ u.getLastName() +"'> </p> ");
    out.println(" <p> Email: <input type='text' name='email' value='"+ u.getEmail() +"'> </p> ");
    out.println(" <p> Password: <input type='text' name='password' value='"+ u.getPassword() +"'> </p>");
    out.println(" <p> Telefono: <input type='text' name='phone' value='"+ u.getPhone() +"'> </p>");
    out.print(" <input type='submit' value='Guardar cambios'> ");
    out.print(" </form> ");
} %>

</body>
</html>
