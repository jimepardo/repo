package servlets;

import classesDAO.DAOFactory;
import classesDAO.RejectedReasonDAO;
import models.RejectedReason;
import models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@WebServlet("/createRejectedReason")
public class createRejectedReason extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public createRejectedReason() {
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

            String nombre = request.getParameter("name");

            RejectedReasonDAO rrDAO = DAOFactory.getRejectedReasonDAO("HibernateJPA");

            List<RejectedReason> listResult = rrDAO.getAll();
            Iterator<RejectedReason> it = listResult.iterator();
            List<RejectedReason> reasons = new ArrayList<>();

            while( it.hasNext() ) {
                RejectedReason newReason = it.next();
                if ( request.getParameter( newReason.getName() ) != null ) {
                    RejectedReason reason = rrDAO.findByName( newReason.getName() );
                    if( reason != null) {
                        System.out.println(" <<<< Cargado la razon de rechazo: " + reason.getName() + "(ID = " + reason.getId() + ") >>>>");
                        reasons.add(reason);
                    }
                }
            }

            RejectedReason rrNew = new RejectedReason(nombre);

            /* Guardar la nueva razon de rechazo*/

            rrDAO.save(rrNew);

            response.sendRedirect("home.jsp");

        }

        doGet(request, response);
    }
}
