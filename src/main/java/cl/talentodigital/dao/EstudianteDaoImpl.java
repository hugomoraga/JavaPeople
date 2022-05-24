package cl.talentodigital.dao;

import java.util.ArrayList;
import java.util.List;

import cl.talentodigital.idao.IEstudianteDao;
import cl.talentodigital.modelo.Estudiante;
import cl.talentodigital.database.ConexionDatabase;
import cl.talentodigital.database.DataList;


public class EstudianteDaoImpl implements IEstudianteDao {
	
	
	@Override
	public List<Estudiante> obtenerEstudiantes() {
		// TODO Auto-generated method stub
		DataList.listaEstudiante = ConexionDatabase.listar();
		return DataList.listaEstudiante;
	}

	@Override
	public boolean agregarEstudiante(Estudiante estudiante) {
		try {
			//DataList.listaEstudiante.add(estudiante);
			ConexionDatabase.guardarEstudiante(estudiante);
			return true;
		} catch (Exception e) {
			System.out.println(e + "No se guardo estudiante");
			return false;
		}
		
	}

	@Override
	public Estudiante obtenerEstudiante(int id) {
		return ConexionDatabase.obtieneEstudiante(id);
	}

	@Override
	public boolean actualizarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return false;
	}

}
