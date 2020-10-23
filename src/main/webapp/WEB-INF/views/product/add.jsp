<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Add Product</title>
</head>
<body>
<h1>Add Product</h1>
<form method="post" action="${pageContext.request.contextPath}/product/add">
    Product name: <input type="text" name="name">
    <br>
    Product price: <input type="text" name="price">
    <br>
    <button type="submit">Add</button>
</form>
<br>
<a href="${pageContext.request.contextPath}/">Go to the main page</a>
<br>
<a href="${pageContext.request.contextPath}/product/allAdmin">Go to the all products page</a>
</body>
</html>
