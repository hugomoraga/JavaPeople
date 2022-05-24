package cl.talentodigital.idao;

import java.util.List;

import cl.talentodigital.modelo.Calificaciones;
import cl.talentodigital.modelo.Estudiante;

public interface ICalificacionesDao {
	
	public List<Calificaciones> ObtenerCalificacionesPorEstudiante(int estudianteId);
	
	public boolean agregarCalificacion(Calificaciones calificacion);

}
