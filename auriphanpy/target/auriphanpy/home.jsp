<%@ page import="models.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
</head>
<body>
<h1> AURIPHANPY </h1>
<br><br>

<% if (session.getAttribute("user") != null ) {

    out.print ("<h2> Bienvenido " + ( (User) session.getAttribute("user") ).getEmail() + "</h2>");
    out.print ("<form action='LogoutServlet' method='post'> <input type='submit' value='Cerrar Sesion' > </from>");
    out.println("<br>");
    out.print ("<table style='width:90%'> <tr>");
    out.print ("<td> <h4> Usuarios </h4> <a href='updateUser.jsp'> Editar Usuario </td>");
    out.print ("<td> <h4> Metodo de pago </h4> <a href='deletePaymentMethod.jsp'> Borrar Metodo de pago </td>");
    out.print ("<td> <h4> Crear una razon de rechazo </h4><a href='createRejectedReason.jsp'> Crear razon de rechazo</td>");

    out.print ("</tr> </table>");

} else { out.print ("No estas logueado"); }

%>

</body>
</html>
