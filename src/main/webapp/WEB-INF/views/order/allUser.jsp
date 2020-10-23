<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>All my orders</title>
</head>
<body>
<h1>All my orders</h1>
<table border="1">
    <tr>
        <th scope="col">Id</th>
        <th scope="col">Time</th>
    </tr>
    <c:forEach var="order" items="${orders}">
        <tr>
            <td>
                <c:out value="${order.id}"/>
            </td>
            <td>
                <c:out value="${order.orderTime}"/>
            </td>
            <td>
                <a href="${pageContext.request.contextPath}/order/show?id=${order.id}">Show</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
