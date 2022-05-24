package cl.talentodigital.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import cl.talentodigital.idao.IEstudianteDao;
import cl.talentodigital.modelo.Estudiante;
import cl.talentodigital.dao.EstudianteDaoImpl;


/**
 * Servlet implementation class Registro
 */
@WebServlet("/registro")
public class Registro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	     HttpSession session = request.getSession();
		 int id=1;
	     String rut = request.getParameter("rut");
		 String nombre = request.getParameter("nombre");
    	 String apellido = request.getParameter("apellido");
    	 String genero = request.getParameter("genero");
    	 int telefono = Integer.parseInt(request.getParameter("telefono"));
    	 
    	 Estudiante estudianteNuevo = new Estudiante(id,rut,nombre,apellido,genero,telefono);
 	     IEstudianteDao estudianteDao = new EstudianteDaoImpl();
 	     
 	     estudianteDao.agregarEstudiante(estudianteNuevo);
 	     
 	     
	}

}
