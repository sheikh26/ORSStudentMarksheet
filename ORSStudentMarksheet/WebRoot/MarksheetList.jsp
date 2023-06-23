
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="Marksheet.Vo.MarksheetVo"%>
<html>
	<head>
		<script type="text/javascript">
function show_alert()
{
alert("Hello! I am an alert box!");
}
</script>

	</head>

	<body>
		<h2>
			MarksheetList Form
		</h2>
		<form name="myForm" action="MarksheetListCtl" onsubmit="show_alert()"
			method="get">
			<table border="5" bgcolor="pink">

				<tr>
					<td>
						<input type="text" name="search">
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" name="operation" value="Search">

					</td>
				</tr>
				<tr>
					<th>
						Select
					</th>
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
						Chemistry
					</th>
					<th>
						Maths
					</th>
					<th>
						Hindi
					</th>
					<th>
						English
					</th>
					<th>
						Edit
					</th>

				</tr>

				<%
					ArrayList list = (ArrayList) request.getAttribute("list");

					if (list == null) {
						list = new ArrayList();
					}

					Iterator it = list.iterator();
					while (it.hasNext()) {
						MarksheetVo vo = new MarksheetVo();
						vo = (MarksheetVo) it.next();
				%>



				<tr>
					<td>
						<input type="checkbox" name="checkbox" value="<%=vo.getRollNo()%>">
					</td>

					<td>
						<%=vo.getRollNo()%>
					</td>

					<td>
						<%=vo.getName()%>
					</td>
					<td>
						<%=vo.getPhysics()%>
					</td>

					<td>
						<%=vo.getChemistry()%>
					</td>

					<td>
						<%=vo.getMaths()%>
					</td>

					<td>
						<%=vo.getHindi()%>
					</td>
					<td>
						<%=vo.getEnglish()%>
					</td>
					<td>
						<a href="MarksheetCtl?operation=get&rollNo=<%=vo.getRollNo() %>">edit</a>
					</td>

				</tr>

				<%
					}
				%>
				<tr>
					<td>
						<input type="submit" name="operation" value="Delete">


					</td>
				</tr>

			</table>
			<input type="text" name="first">
		</form>
	</body>
</html>
