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

@WebServlet("/updateUser")
public class updateUser extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateUser() {
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

        UserDAO uDAO = DAOFactory.getUserDAO("HibernateJPA");
        User u = uDAO.getPerson( ( (User) request.getSession(false).getAttribute("user")).getEmail() );

        u.setFirstName( request.getParameter("firstName") );
        u.setLastName( request.getParameter("lastName") );
        u.setEmail(request.getParameter("email") );
        u.setPassword(request.getParameter("password") );
        u.setPhone(request.getParameter("phone"));

        uDAO.update(u);
        request.getSession(true).setAttribute("user", u);
        response.sendRedirect("home.jsp");

    }
}
