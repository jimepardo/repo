<%@ page import="classesDAO.DAOFactory" %>
<%@ page import="models.RejectedReason" %>
<%@ page import="classesDAO.RejectedReasonDAO" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Crear una razon de rechazo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>

</head>
<body>
<h2>Crear una razon de rechazo</h2>
<br>
<%

    RejectedReasonDAO rrDAO = DAOFactory.getRejectedReasonDAO("HibernateJPA");
    out.println("<h5> Listado de razones: </h5> ");
    List<RejectedReason> listResult = rrDAO.getAll();
    Iterator<RejectedReason> it = listResult.iterator();
    while(it.hasNext()){
        RejectedReason reason = it.next();
        out.println("<p>Razon: "+ reason.getName()+" </p> " );
    }
    out.println("");
    out.println("<form action='createRejectedReason' method='post'> ");
    out.println(" <p> Nombre la razon de rechazo: <input type='text' name='name'> </p> ");
    out.print(" <input type='submit' value='Cargar'> ");
    out.print(" </form> ");

%>
</body>
</html>
