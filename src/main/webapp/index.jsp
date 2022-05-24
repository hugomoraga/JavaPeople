<%@include file="includes/header.jsp"%>


<div class="container">

	<%@page import="java.util.ArrayList"%>
	<%@page import="java.util.List"%>
	<%@page import="cl.talentodigital.dao.EstudianteDaoImpl"%>
	<%@page import="cl.talentodigital.idao.IEstudianteDao"%>
	<%@page import="cl.talentodigital.modelo.Estudiante"%>

	<%
	IEstudianteDao estudianteDao = new EstudianteDaoImpl();
	%>
	<%
	List<Estudiante> listaEstudiante = estudianteDao.obtenerEstudiantes();
	%>

	<div class="py-3">
		<h1 class="py-2"> Listado de Estudiantes</h1>
		<%
	if (listaEstudiante != null) {
	%>

	<table class="table table-striped table-hover shadow-sm ">

		<tr>
			<th>ID</th>
			<th>Rut</th>
			<th>Nombre</th>
			<th>Apellido</th>
			<th width="30%">Acciones</th>
		</tr>
		<%
		for (int i = 0; i < listaEstudiante.size(); i++) {
		%>
		<tr>
			<td><%=listaEstudiante.get(i).getId()%></td>
			<td><%=listaEstudiante.get(i).getRut()%></td>
			<td><%=listaEstudiante.get(i).getNombre()%></td>
			<td><%=listaEstudiante.get(i).getApellido()%></td>
			<td>

				<div class="row d-flex-inline ">
					<div class="col">
						<form action="calificaciones.jsp" method="post">
							<input type="hidden" name="idEstudiante"
								value="<%=listaEstudiante.get(i).getId()%>" /> <input
								type="submit" name="accion" value="Agregar Calificacion"
								class="btn btn-success" />

						</form>


					</div>
					<div class="col">
						<form action="vercalificaciones.jsp" method="post">
							<input type="hidden" name="idEstudiante"
								value="<%=listaEstudiante.get(i).getId()%>" /> <input
								type="submit" name="accion" value="Ver Calificacion"
								class="btn btn-info" />

						</form>
					</div>
				</div>

			</td>
		</tr>
		<%
		}
		%>

	</table>

	<%
	} else {
	%>
	<p>No hay datos</p>
	<%
	}
	%>
	
	</div>
	<h3 class="p-3"> Agregar Nuevo Estudiante:</h3>
	<%@include file="includes/registroestudiante.jsp"%>

</div>


</body>
</html>