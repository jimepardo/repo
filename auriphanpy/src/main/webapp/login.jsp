
<%@ page import="classesDAO.*, models.*, java.util.* " %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
</head>
<body>
<h1>Loguearse</h1>
<% if (session.getAttribute("usuario") == null ) {

    out.print( "<form action='LoginServlet' method='post'>" );
    out.print( "<p> Usuario: <input type='text' name='email' ></p> " );
    out.print( "<p> Password: <input type='password' name='password' ></p> " );
    out.print( "<p> <input type='submit' value='Ingresar'> </p> " );
    out.print( "</form> " );

    out.print("<a href='register.jsp'> Registrarse </a>");
} %>
</body>
</html>
