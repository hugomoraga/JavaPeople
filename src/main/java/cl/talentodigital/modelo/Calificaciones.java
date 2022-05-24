package cl.talentodigital.modelo;

public class Calificaciones {
	private int id;
	private String ramo;
	private String nota;
	private int numeroEvaluacion;
	private int idEstudiante;
	
	public Calificaciones() {
		
	}

	public Calificaciones(int id, String ramo, String nota, int numeroEvaluacion, int idEstudiante) {
		super();
		this.id = id;
		this.ramo = ramo;
		this.nota = nota;
		this.numeroEvaluacion = numeroEvaluacion;
		this.idEstudiante = idEstudiante;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public int getNumeroEvaluacion() {
		return numeroEvaluacion;
	}

	public void setNumeroEvaluacion(int numeroEvaluacion) {
		this.numeroEvaluacion = numeroEvaluacion;
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}
	
	
	
    

}
