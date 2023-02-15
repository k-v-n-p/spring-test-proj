<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="webjars/bootstrap/4.6.0/css/bootstrap.miin.css" >

</head>
<body>
<h3>${error}</h3>
<div class="login-form">
	<form method="post">
		<input type="text" name="userid" placeholder="UserID" />
		<br>
		<input type="password" name="password" placeholder="Password" />
		<br><br>
		
		<button type="submit">Submit</button>
	</form>
	</div>
</body>
</html>