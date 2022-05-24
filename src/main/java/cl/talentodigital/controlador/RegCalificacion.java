package cl.talentodigital.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.talentodigital.dao.CalificacionesDaoImpl;
import cl.talentodigital.idao.ICalificacionesDao;
import cl.talentodigital.modelo.Calificaciones;

/**
 * Servlet implementation class RegCalificacion
 */
@WebServlet("/regcalificacion")
public class RegCalificacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegCalificacion() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
	    int id=1;
		String ramo = request.getParameter("ramo");
		String nota = request.getParameter("nota");
		String numeroEvaluacionString = request.getParameter("n_eva");
		int numeroEvaluacion = Integer.parseInt(numeroEvaluacionString);
		String idEstudianteString = request.getParameter("id_estudiante");
		int idEstudiante = Integer.parseInt(idEstudianteString);
		
		Calificaciones calificacionNueva = new Calificaciones(id,ramo,nota,numeroEvaluacion,idEstudiante);
		ICalificacionesDao calificacionDao = new CalificacionesDaoImpl();
		calificacionDao.agregarCalificacion(calificacionNueva);
	}

}
