
<html>
	<head>

		<script type="text/javascript">
function validateForm()
{
var x=document.forms["myForm"]["userId"].value;
if (x==null || x=="")
  {
  alert("UserId can not null");
  return false;
  }
  var y=document.forms["myForm"]["password"].value;
 if (y==null || y=="")
  {
  alert("password  can not null");
  return false;
  }
}
</script>

		<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>

		<script type="text/javascript" src="js/jquery.validate.js"></script>
		<script type="text/javascript">
		
		$(document).ready(function(){


$("#myForm").validate({

rules: {

userId: "required",

password: "required"



}

});

});
</script>

		<style type="">
.error {
	color: red;
	border: 1;
	font-family: cursive, serif, sans-serif;
	border: 50px;
}
</style>
	</head>
	<body>
		<%
			if (request.getAttribute("msg") != null) {
				String s = (String) request.getAttribute("msg");
		%>
		<h1>
			<font color="red"><%=s%></font>
		</h1>
		<%
			}
		%>

		<form  name="myForm"  action="LoginCtl" onsubmit="return validateForm()" method="get">
			<table border="5" bgcolor="skyblue">
				<tr>
					<td>
						UserId
					</td>
					<td>
						<input type="text" name="userId">
					</td>
				</tr>


				<tr>
					<td>
						Password
					</td>
					<td>
						<input type="password" name="password">
					</td>
				</tr>


				<tr>
					<td>
						<input type="submit" name="operation" value="Login">
					</td>
				</tr>
			</table>