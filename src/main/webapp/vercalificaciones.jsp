<%@include file="includes/header.jsp" %>
<div class="container">


<%@page import="java.util.ArrayList"%>  
<%@page import="java.util.List"%>    
<%@page import="cl.talentodigital.dao.EstudianteDaoImpl"%>
<%@page import="cl.talentodigital.idao.IEstudianteDao"%>
<%@page import="cl.talentodigital.modelo.Estudiante"%>
<%@page import="cl.talentodigital.dao.CalificacionesDaoImpl"%>
<%@page import="cl.talentodigital.idao.ICalificacionesDao"%>
<%@page import="cl.talentodigital.modelo.Calificaciones"%>


<% IEstudianteDao estudianteDao = new EstudianteDaoImpl(); %>
<% ICalificacionesDao calificacionesDao = new CalificacionesDaoImpl(); %>
<% Estudiante estudiante = new Estudiante(); %>


<% String idStringEstudiante = request.getParameter("idEstudiante"); %>
<% int idEstudiante = Integer.parseInt(idStringEstudiante); %>    
<% List <Calificaciones> listaCalificaciones = calificacionesDao.ObtenerCalificacionesPorEstudiante(idEstudiante);  %> 
<% estudiante = estudianteDao.obtenerEstudiante(idEstudiante); %>

<h2 class="d-flex justify-content-center py-3">Calificaciones de <%= estudiante.getNombre() %>  <%= estudiante.getApellido()%>    </h2>

   	<%
		if (listaCalificaciones!= null ) { 	
	%>
    
		<table class="table table-striped table-hover shadow-sm" >
			
			<tr><th>ID</th><th>Ramo</th><th>Nota</th><th>Numero Evaluacion</th></tr>
			<%				
			for (int i = 0; i<listaCalificaciones.size(); i++){
				
				%>
				<tr><td><%= listaCalificaciones.get(i).getId()%></td>
					<td><%= listaCalificaciones.get(i).getRamo()%></td>
					<td><%= listaCalificaciones.get(i).getNota()%></td>
					<td><%= listaCalificaciones.get(i).getNumeroEvaluacion()%></td>
				
				</tr>
				<%
			}
				
			%>
			
		</table>

	<%
		} else {
	%>
	<p>No hay datos </p>
	<%
		}
	%>		

</div>


</body>
</html>