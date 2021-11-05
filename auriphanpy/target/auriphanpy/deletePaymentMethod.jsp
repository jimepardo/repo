<%@ page import="classesDAO.PaymentMethodDAO" %>
<%@ page import="classesDAO.DAOFactory" %>
<%@ page import="models.PaymentMethod" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Borrar un método de pago</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>

</head>
<body>
<h2>Borrar método de pago</h2>
<br>

<%
    PaymentMethodDAO pmDAO = DAOFactory.getPaymentMethodDAO("HibernateJPA");
    out.println("<h5> Listado metodos de pago: </h5> ");
    List<PaymentMethod> listResult = pmDAO.getAll();
    Iterator<PaymentMethod> it = listResult.iterator();


    while(it.hasNext()) {
        PaymentMethod payment = it.next();
        out.println("<form action='deletePaymentMethod' method='post'> ");
        out.println("<input type='text' name='name' value='"+ payment.getName() +"' disabled>");
        out.print(" <input type='submit' value='Borrar'> ");
        out.println("");
        out.print(" </form> ");
    }


%>
</body>
</html>
