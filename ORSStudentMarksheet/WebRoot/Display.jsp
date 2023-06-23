
<%@page import="Marksheet.Vo.MarksheetVo"%>
<html>
	<body>
		<form action="RollNoCtl1" method="get">
			<table border="7" bgcolor="red">
								<tr>
					<th>
						RollNo
					</th>
					<th>
						Name
					</th>
					<th>
						Physics
					</th>
					<th>
						Maths
					</th>
					<th>
						Chemistry
					</th>
					<th>
						Hindi
					</th>
					<th>
						English
					</th>
				</tr>
				<%
				
				
					MarksheetVo vo = (MarksheetVo) request.getAttribute("getData");
			if (vo == null) {
				vo = new MarksheetVo();

					}
				
				%>
				
				<tr>
					<td>
						<%=
							vo.getRollNo()
						%>
					</td>

					<td>
						<%=
							vo.getName()
						%>
					</td>
					<td>
						<%=vo.getPhysics()
						%>
					</td>
					<td>
					<%=
						vo.getMaths()
					%>
					</td>
					<td>
						<%=
							vo.getChemistry()
						%>
					</td>
					<td>
						<%=
							vo.getHindi()
						%>
					</td>
					<td>
						<%=
							vo.getEnglish()
						%>
					</td>

				</tr>
				<% %>
			</table>

		</form>
	</body>