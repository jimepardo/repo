package servlets;

import classesDAO.DAOFactory;
import classesDAO.PaymentMethodDAO;
import models.PaymentMethod;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

@WebServlet("/deletePaymentMethod")
public class deletePaymentMethod extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public deletePaymentMethod() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if ( request.getSession(false) != null ) {

            PaymentMethodDAO pmDAO = DAOFactory.getPaymentMethodDAO("HibernateJPA");

            String nombre = request.getParameter("name");

            PaymentMethod pmPersistido = pmDAO.findByName(nombre);
            pmDAO.delete(pmPersistido.getId());
            System.out.println(" <<<< Metodo de pago Borrado >>>>");

        }

        response.sendRedirect("home.jsp");

    }

}
