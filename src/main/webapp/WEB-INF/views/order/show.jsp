<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Order complete</title>
</head>
<body>
<h1>Order complete</h1>
<table border="1">
    <tr>
        <th scope="col">Product id</th>
        <th scope="col">Name</th>
        <th scope="col">Price</th>
    </tr>
    <c:forEach var="product" items="${products}">
        <tr>
            <td>
                <c:out value="${product.id}"/>
            </td>
            <td>
                <c:out value="${product.name}"/>
            </td>
            <td>
                <c:out value="${product.price}"/>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="${pageContext.request.contextPath}/order/allUser">
    <button type="button">Show my orders</button>
</a>
</body>
</html>
