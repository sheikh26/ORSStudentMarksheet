
<%@page import="Marksheet.Vo.MarksheetVo"%>

<html>
	<head>
		<script type="text/javascript" src="cal/calendar.js"></script>
	</head>
	<body>
		<%
			MarksheetVo vo = (MarksheetVo) request.getAttribute("get");
			if (vo == null) {
				vo = new MarksheetVo();

			}
		%>

		<h2>
			Marksheet Form
		</h2>
		<form action="MarksheetCtl" method="get">
			<table border="5" bgcolor="green">
				<%
					String str = (String) session.getAttribute("user");
					if (str != null) {
				%>
				<%=str%>
				<%
					}
				%>



				<tr>
					<td>

						Name
					</td>
					<td>
						<input type="text" name="name" value=<%=vo.getName()%>>
					</td>
				</tr>

				<tr>
					<td>
						RollNo
					</td>
					<td>
						<input type="text" name="rollNo" value=<%=vo.getRollNo()%>>
					</td>
				</tr>


				<tr>
					<td>
						Physics
					</td>
					<td>
						<input type="text" name="physics" value=<%=vo.getPhysics()%>>
					</td>
				</tr>

				<tr>
					<td>
						Maths
					</td>
					<td>
						<input type="text" name="maths" value=<%=vo.getMaths()%>>
					</td>
				</tr>

				<tr>
					<td>
						Chemistry
					</td>
					<td>
						<input type="text" name="chemistry" value=<%=vo.getChemistry()%>>
					</td>
				</tr>
				<tr>
					<td>
						Hindi
					</td>
					<td>
						<input type="text" name="hindi" value=<%=vo.getHindi()%>>
					</td>
				</tr>

				<tr>
					<td>
						English
					</td>
					<td>
						<input type="text" name="english" value=<%=vo.getEnglish()%>>
					</td>
				</tr>

				<tr>
					<td>
						<input type="submit" name="operation" value="save">
						<input type="submit" name="operation" value="Delete">
						<input type="submit" name="operation" value="Update">
						<input type="submit" name="operation" value="get">
						<input type="submit" name="operation" value="List">

					</td>
				</tr>
			</table>
		</form>
	</body>
</html>