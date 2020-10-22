<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Main page</title>
</head>
<body>
<h1>Internet shop</h1>
<a href="${pageContext.request.contextPath}/injectData">Inject Data</a>
<br>
<br>
<h2>Users</h2>
<a href="${pageContext.request.contextPath}/user/all">All Users</a>
<br>
<a href="${pageContext.request.contextPath}/registration">Register User</a>

<br>
<h2>Products</h2>
<a href="${pageContext.request.contextPath}/product/all">All Products</a>
<br>
<a href="${pageContext.request.contextPath}/product/add">Add Product</a>

<br>
<h2>ShoppingCart</h2>
<a href="${pageContext.request.contextPath}/cart/show">Show shopping cart</a>
</body>
</html>
