<html>
	<body>
		<table border="" width="100%" height="20%" bordercolor="red" bgcolor="pink" align="center">
			<tr>
				<td>
					<jsp:include page="Header.jsp" />
				</td>
			</tr>
			</table>
			
			
			
			<table border="" width="100%" height="60%" bordercolor="red" bgcolor="pink" >
			<tr>
				<td>
					<jsp:include page="Menu.jsp" />
				</td>
				<td>
				<%
				String body = request.getPaparameter("body");
				 %>
				 
				 <jsp:include page="<%=body%>"/>
				</td>
			</tr>
			</table>
			
			<table border="" width="100%" height="20%" bordercolor="red" bgcolor="pink">
			<tr>
				<td>
					<jsp:include page="Footer.jsp" />
				</td>
			</tr>
			</table>