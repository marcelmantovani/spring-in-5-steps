<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action="/login" method="post">
<p>${errorMessage }</p>
Enter your name <input type="text" name="name"/> <br>
Enter your password <input type="password" name="password"/> <br>
<input type="submit" value="Login">
</form>
</body>
</html>