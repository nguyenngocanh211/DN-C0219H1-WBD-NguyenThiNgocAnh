<%--
  Created by IntelliJ IDEA.
  User: Anh
  Date: 5/3/2019
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<html>
<head>
    <title>View customer</title>
</head>
<body>
<h1>Customer details</h1>
<p>
    <a href="/customers">Back to customer list</a>
</p>
<table>
    <tr>
        <td>Name: </td>
        <td>${customer.getName()}</td>
    </tr>
    <tr>
        <td>Email: </td>
        <td>${customer.getEmail()}</td>
    </tr>
    <tr>
        <td>Address: </td>
        <td>${customer.getAddress()}</td>
    </tr>
</table>
</body>
</html>