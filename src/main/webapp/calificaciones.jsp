<%@include file="includes/header.jsp"%>


<%@page import="java.util.ArrayList"%>  
<%@page import="java.util.List"%>    
<%@page import="cl.talentodigital.dao.CalificacionesDaoImpl"%>
<%@page import="cl.talentodigital.dao.EstudianteDaoImpl"%>

<%@page import="cl.talentodigital.idao.ICalificacionesDao"%>
<%@page import="cl.talentodigital.idao.IEstudianteDao"%>

<%@page import="cl.talentodigital.modelo.Estudiante"%>
<%@page import="cl.talentodigital.modelo.Calificaciones"%>
<% ICalificacionesDao calificacionesDao = new CalificacionesDaoImpl(); %>
<% IEstudianteDao estudianteDao = new EstudianteDaoImpl(); %>

<% Estudiante estudiante = new Estudiante(); %>
<% String idStringEstudiante = request.getParameter("idEstudiante"); %>
<% int idEstudiante = Integer.parseInt(idStringEstudiante); %>

<% estudiante = estudianteDao.obtenerEstudiante(idEstudiante); %>

<div class="container">
<h2 class="p-3"> Agregar Nota a <%= estudiante.getNombre() %>  <%= estudiante.getApellido() %>   </h2>

<jsp:include page="includes/registrocalificaciones.jsp">
	<jsp:param name="idEstudiante" value="<%= idEstudiante %>" />

</jsp:include>



</div>

</body>
</html>