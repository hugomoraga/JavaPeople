package cl.talentodigital.idao;

import java.util.List;
import cl.talentodigital.modelo.Estudiante;

public interface IEstudianteDao {
	
	public List<Estudiante> obtenerEstudiantes();
	
	public boolean agregarEstudiante(Estudiante estudiante);

	public Estudiante obtenerEstudiante(int id);
	
	public boolean actualizarEstudiante(Estudiante estudiante);
	
	public boolean eliminarEstudiante(Estudiante estudiante);


}
