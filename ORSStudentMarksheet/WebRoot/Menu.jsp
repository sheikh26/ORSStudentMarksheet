<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>Left Tree Menu</title>
		<link type="text/css" rel="stylesheet" media="all"
			href="css/style.css" />
		<script type="text/javascript" src="js/jquery.js"></script>
		<script type="text/javascript">
<!--//--><![CDATA[//><!--
	$(document).ready(function() {
		$("#root ul").each(function() {$(this).css("display", "none");});
		$("#root .category").click(function() {
			var childid = "#" + $(this).attr("childid");
			if ($(childid).css("display") == "none") {$(childid).css("display", "block");}
			else {$(childid).css("display", "none");}
			if ($(this).hasClass("cat_close")) {$(this).removeClass("cat_close").addClass("cat_open");}
			else{$(this).removeClass("cat_open").addClass("cat_close");}
		});
	});
//--><!]]>
</script>
	</head>
	<body>
		<h2>
			Category list
		</h2>
		<div class="content">
			<ul id="root" class="menu">
				<%
					String str = (String) session.getAttribute("user");
					if (str != null) {
				%>
				<%
					}
				%>
				<li>
					<a href='Layout.jsp?body=Ragistration.jsp'>Registration</a>
				</li>
				<li>
					<a href='Layout.jsp?body=Login.jsp'>Login</a>
				</li>
				<li>
					<a href='Layout.jsp?body=RollNo.jsp'>Result</a>
				</li>
				<li>
					<a href='Layout.jsp?body=Marksheet.jsp'>MarksheetEntry</a>
				</li>
		</div>
	</body>
</html>
