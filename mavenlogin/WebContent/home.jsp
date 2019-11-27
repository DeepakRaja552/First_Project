<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action = "LoginServlet" method="post">
		<p>To contact us Enter your email address below! we will shortly get back to you.</p>
		
		Email Address:<input type = "text" name= "emailaddress"></input><br/>
		
		Password: <input type = "password" name= "password"></input><br/>
		
		<button type="submit" name="submit">submit</button>
	</form>
</body>
</html>