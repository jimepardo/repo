package servlets;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classesDAO.*;
import models.*;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request.getSession(false).invalidate();
        if( !request.getParameter("email").isEmpty() && !request.getParameter("password").isEmpty() ) {
            UserDAO uDAO = DAOFactory.getUserDAO("HibernateJPA");
            User user = uDAO.getPerson(request.getParameter("email") );
            if (user != null) {
                if (request.getParameter("password").equals(user.getPassword() ) ) {
                    request.getSession(true).setAttribute("user", user);
                    System.out.println(" La sesion fue iniciada  ");
                    System.out.println("____________________________");
                    response.sendRedirect("home.jsp");
                }
                else {  System.out.println("____________________________");
                    System.out.println(" <<<< Contraseña incorrecta >>>> ");
                System.out.println("____________________________");
                    response.sendRedirect("errorPage.jsp"); }
            } else {  System.out.println("____________________________");
                System.out.println(" <<<< Usuario incorrecto >>>>");
            System.out.println("____________________________");
                response.sendRedirect("errorPage.jsp"); }
        }
    }

}