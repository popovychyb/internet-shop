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

<h2>Users</h2>
<a href="${pageContext.request.contextPath}/user/all">All Users</a>
<br>
<a href="${pageContext.request.contextPath}/registration">Register User</a>

<br>
<h2>Products</h2>
<a href="${pageContext.request.contextPath}/product/allUser">All Products for User</a>
<br>
<a href="${pageContext.request.contextPath}/product/allAdmin">All Products for Admin</a>
<br>
<a href="${pageContext.request.contextPath}/product/add">Add Product</a>

<br>
<h2>ShoppingCart</h2>
<a href="${pageContext.request.contextPath}/cart/show">Show shopping cart</a>

<br>
<h2>Order</h2>
<a href="${pageContext.request.contextPath}/order/allUser">All orders of user 1</a>
<br>
<a href="${pageContext.request.contextPath}/order/allAdmin">All orders. Admin panel.</a>
</body>
</html>
