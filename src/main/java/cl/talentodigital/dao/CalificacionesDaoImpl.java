package cl.talentodigital.dao;

import java.util.ArrayList;
import java.util.List;

import cl.talentodigital.idao.ICalificacionesDao;
import cl.talentodigital.modelo.Calificaciones;
import cl.talentodigital.modelo.Estudiante;
import cl.talentodigital.database.ConexionDatabase;
import cl.talentodigital.database.DataList;


public class CalificacionesDaoImpl implements ICalificacionesDao {

	@Override
	public List<Calificaciones> ObtenerCalificacionesPorEstudiante(int estudianteId) {
		DataList.listaCalificaciones = ConexionDatabase.obtenerCalificacionesPorEstudiante(estudianteId);
		return DataList.listaCalificaciones;
	}

	@Override
	public boolean agregarCalificacion(Calificaciones calificacion) {
		try {
			ConexionDatabase.guardarCalificacion(calificacion);
			return true;
		} catch (Exception e) {
			System.out.println(e + "No se guardo calificacion");
			return false;
		}
	}

}
