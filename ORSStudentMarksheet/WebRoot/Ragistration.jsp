<html>
	<head>
		<title>Test1.html</title>
		<script type="text/javascript" src="cal/calendar.js"></script>
		<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>

		<script type="text/javascript" src="js/jquery.validate.js"></script>
		<script type="text/javascript">
		
		$(document).ready(function(){


$("#myForm").validate({

rules: {

firstname: "required",

lastname: "required",

fathername: "required",

emailid:{
required: true,
email: true
},

cAdd:"required",

pAdd: {
required: true
},

dob:{
required: true,
date: true
},
city: "required",

phoneNo:{
required: true,
digits: true
},
gender: "required",
catagary: "required",
course: "required",
state:"required"
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
		
		<form action="RagistrationCtl" method="get" id="myForm">
			<table border="5" bgcolor="gray">

				<tr>
					<td>

						FirstName
					</td>
					<td>
						<input type="text" name="firstname">
					</td>
				</tr>


				<tr>
					<td>

						LastName
					</td>
					<td>
						<input type="text" name="lastname">
					</td>
				</tr>

				<tr>
					<td>

						Father's Name
					</td>
					<td>
						<input type="text" name="fathername">
					</td>
				</tr>
				<tr>
					<td>
						EmailID
					</td>
					<td>
						<input type="text" name="emailid">
					</td>
				</tr>
				<tr>
					<td>

						Current Address
					</td>
					<td>
						<input type="text" name="cAdd">
					</td>
				</tr>
				<tr>
					<td>

						Permanent Address
					</td>
					<td>
						<input type="text" name="pAdd">

					</td>
				</tr>
				<tr>
					<td>
						Date of Birth
					</td>
					<td>
						<input type="text" name="dob" readonly="readonly">
						<a href="javascript:getCalendar(document.forms[0].dob);"> <img
								src="cal.jpg" width="16" height="15" border="0" alt="Calender">
						</a>
					</td>
				</tr>

				<tr>
					<td>
						City
					</td>
					<td>
						<input type="text" name="city">
					</td>
				</tr>

				<tr>
					<td>
						PhoneNo
					</td>
					<td>
						<input type="text" name="phoneNo">
					</td>
				</tr>

				<tr>
					<td>
						Gender
					</td>
					<td>
						<select name="gender">
							<option value="1">
								Select
							<option value="2">
								Male
							</option>
							<option value="3">
								Female
							</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>

						Catagary
					</td>
					<td>
						<input type="radio" name="catagary" value="st">
						ST
						<input type="radio" name="catagary" value="sc">
						SC
						<input type="radio" name="catagary" value="obc">
						OBC
						<input type="radio" name="catagary" value="genral">
						General
					</td>
				</tr>
				<tr>
					<td>
						Course
					</td>
					<td>
						<select name="course">
							<option value="1">
								Select
							<option value="2">
								CoreJava
							</option>
							<option value="3">
								Advance Java
							</option>
							<option value="4">
								Corporate Java
							</option>

						</select>
					</td>
				</tr>
				<tr>
					<td>
						State
					</td>
					<td>
						<select name="state">
							<option value="1">
								Select
							<option value="2">
								MP
							</option>
							<option value="3">
								UP
							</option>
							<option value="4">
								Maharastra
							</option>
							<option value="5">
								Chhattisgade
							</option>
							<option value="6">
								Gujrat
							</option>
							<option value="7">
								Rajasthan
							</option>

						</select>
					</td>
				</tr>

				<tr>
					<td>
						<u><input type="submit" name="operation" value="Submit">
						</u>
					</td>
				</tr>
			</table>
		</form>

	</body>
</html>