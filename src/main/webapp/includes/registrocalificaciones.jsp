<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 		
	
     <form class="p-3 shadow-sm m-3 " action="regcalificacion" method="post">
 	  <div class="mb-3">
	    <label for="rut" class="form-label">Ramo</label>
	    <input type="text" class="form-control" name="ramo">
	  </div>
	  <div class="mb-3">
	    <label for="nombre" class="form-label">Nota</label>
	    <input type="text" class="form-control" name="nota">
	  </div>
	  <div class="mb-3">
	    <label for="apellido" class="form-label">Numero Evaluacion</label>
	    <input type="text" class="form-control" name="n_eva">
	  </div>
	
		<input type="hidden" value="${param.idEstudiante}" name="id_estudiante" />
	
	<button type="submit" class="btn btn-primary">Agregar</button>
	
	
	
	</form>
	 