<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 		
	
 
 <form class="p-3 shadow-sm m-3 " action="registro" method="post">
 	  <div class="mb-3">
	    <label for="rut" class="form-label">Rut</label>
	    <input type="text" class="form-control" name="rut">
	  </div>
	  <div class="mb-3">
	    <label for="nombre" class="form-label">Nombre</label>
	    <input type="text" class="form-control" name="nombre">
	  </div>
	  <div class="mb-3">
	    <label for="apellido" class="form-label">Apellido</label>
	    <input type="text" class="form-control" name="apellido">
	  </div>
	  <div class="mb-3">
	    <label for="genero" class="form-label">Genero</label>
	    <input type="text" class="form-control" name="genero">
	  </div>
	  <div class="mb-3">
	    <label for="telefono" class="form-label">Telefono</label>
	    <input type="text" class="form-control" name="telefono">
	  </div>
	<button type="submit" class="btn btn-primary">Agregar</button>
	</form>
	 
		
			
		<% 
			Object mensaje = session.getAttribute("mensaje");
			
			if (mensaje != null) {
		
			out.print("<div class=' m-3 alert alert-warning alert-dismissible fade show' role='alert'>" 
						+ mensaje.toString() 
						+ "<button type='button' class='btn-close' data-bs-dismiss='alert' aria-label='Close'></button></div>");
			
			session.setAttribute("mensaje", null);
			}
			
		%>
			
		
