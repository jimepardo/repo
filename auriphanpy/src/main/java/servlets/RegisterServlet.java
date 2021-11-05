package servlets;

import classesDAO.DAOFactory;
import classesDAO.UserDAO;
import models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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

        if ( ( request.getParameter("firstName") != null) && ( request.getParameter("lastName") != null) && ( request.getParameter("email") != null) && ( request.getParameter("password") != null) && ( request.getParameter("phone") != null) ) {

            String nombre = request.getParameter("firstName");
            String apellido = request.getParameter("lastName");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String phone = request.getParameter("phone");

            User u = new User(nombre, apellido, email, password, phone);
            UserDAO uDAO = DAOFactory.getUserDAO("HibernateJPA");

            uDAO.save(u);

        }

        response.sendRedirect("login.jsp");
    }

}
