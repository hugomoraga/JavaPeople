package cl.talentodigital.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import cl.talentodigital.modelo.Calificaciones;
import cl.talentodigital.modelo.Estudiante;


public class ConexionDatabase {
    public static Connection ConexionDatabase(){
    	Connection conn = null;
    	try {
    		Class.forName("com.mysql.cj.jdbc.Driver");
    	    conn = DriverManager.getConnection("jdbc:mysql://localhost/javapeople?" +
    	                                   "user=root&password=password");

    	} catch (SQLException ex) {
    		System.out.println("SQLException: " + ex.getMessage());
    	    System.out.println("SQLState: " + ex.getSQLState());
    	    System.out.println("VendorError: " + ex.getErrorCode());
    	} catch (ClassNotFoundException ex) {
    	    System.out.println("Class not Found " + ex);
    	}
	    return conn;	
    }
    
    public static void guardarEstudiante(Estudiante estudiante) {
    	String rut = estudiante.getRut();
    	String nombre = estudiante.getNombre();
    	String apellido = estudiante.getApellido();
    	String genero = estudiante.getGenero();
    	int telefono = estudiante.getTelefono();
    	
    	String sqlQuery = "insert into estudiantes(rut, nombre, apellido, genero, telefono)values('" 
				    	+ rut + "','"
				    	+ nombre + "','"
				    	+ apellido + "','"
				    	+ genero + "','"
				    	+ telefono + "')";
    	try { 
    	Connection con = ConexionDatabase();
    	PreparedStatement ps =con.prepareStatement(sqlQuery);
    	ps.executeUpdate();
    	con.close();
    	}catch (Exception e) {
    		System.out.println("Registro no guardado " + e);
    	}
    }
    
    public static List<Estudiante> listar(){
    	List<Estudiante> listaEstudiantes = new ArrayList<>();
     	String sqlQuery = "select * from estudiantes";
		try {
	    	Connection con = ConexionDatabase();
	    	PreparedStatement ps =con.prepareStatement(sqlQuery);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				Estudiante e = new Estudiante();
				e.setId(rs.getInt("id"));
				e.setRut(rs.getString("rut"));
				e.setNombre(rs.getString("nombre"));
				e.setApellido(rs.getString("apellido"));
				e.setGenero(rs.getString("genero"));
				e.setTelefono(rs.getInt("telefono"));
				listaEstudiantes.add(e);
			}
			
			
		} catch (Exception e) {
		}
		System.out.println(listaEstudiantes.get(0).getNombre());
		return listaEstudiantes;
    } 
    public static Estudiante obtieneEstudiante(int id) {
    	Estudiante estudiante = new Estudiante();
    	String sqlQuery = "SELECT id, rut, nombre, apellido, genero, telefono "
	    		+ "FROM estudiantes where id=" + id + "";		
	    try {
	    	Connection con = ConexionDatabase();
			PreparedStatement ps=con.prepareStatement(sqlQuery);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				estudiante.setId(rs.getInt("id"));
				estudiante.setRut(rs.getString("rut"));
				estudiante.setNombre(rs.getString("nombre"));
				estudiante.setApellido(rs.getString("apellido"));
				estudiante.setGenero(rs.getString("genero"));
				estudiante.setTelefono(rs.getInt("telefono"));
			}
		
			
		} catch (Exception e) {
			System.out.println("No se encontro Estudiante");
		}
    	return estudiante;
    }
    
    public static void guardarCalificacion(Calificaciones calificacion) {
    	String ramo = calificacion.getRamo();
    	String nota = calificacion.getNota();
    	int numeroEvaluacion = calificacion.getNumeroEvaluacion();
    	int idEstudiante = calificacion.getIdEstudiante();
    	
    	String sqlQuery = "insert into calificaciones(ramo, nota, n_eva, id_estudiante)values('" 
				    	+ ramo + "','"
				    	+ nota + "','"
				    	+ numeroEvaluacion + "','"
				    	+ idEstudiante + "')";
    	try { 
    	Connection con = ConexionDatabase();
    	PreparedStatement ps =con.prepareStatement(sqlQuery);
    	ps.executeUpdate();
    	con.close();
    	}catch (Exception e) {
    		System.out.println("Registro no guardado " + e);
    	}
    }
    
    public static List<Calificaciones> obtenerCalificacionesPorEstudiante(int id) {
    	List <Calificaciones> calificacionesEstudiante = new ArrayList<>();
    	
    	String sqlQuery = "SELECT * "
	    		+ "FROM calificaciones where id_estudiante=" + id + "";		
    	try {
	    	Connection con = ConexionDatabase();
	    	PreparedStatement ps =con.prepareStatement(sqlQuery);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				Calificaciones c = new Calificaciones();
				c.setId(rs.getInt("id"));
				c.setRamo(rs.getString("ramo"));
				c.setNota(rs.getString("nota"));
				c.setNumeroEvaluacion(rs.getInt("n_eva"));
				c.setIdEstudiante(rs.getInt("id_estudiante"));
				calificacionesEstudiante.add(c);
			}
			
			
		} catch (Exception e) {
		}
    	return calificacionesEstudiante;
    }
    
    
   
}
