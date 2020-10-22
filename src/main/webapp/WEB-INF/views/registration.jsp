<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Registration</title>
</head>
<body>
<h1>Registration. Please provide your user details:</h1>

<h4 style="color: crimson">${message}</h4>

<form method="post" action="${pageContext.request.contextPath}/registration">
    Please provide your name: <input type="text" name="name">
    <br>
    Please provide your login: <input type="text" name="login">
    <br>
    Please provide your password: <input type="password" name="pwd">
    <br>
    Please repeat your password: <input type="password" name="pwd-repeat">
    <br>
    <button type="submit">Register</button>
    <br>
    <a href="${pageContext.request.contextPath}/">Go to the main page</a>
</form>
</body>
</html>
