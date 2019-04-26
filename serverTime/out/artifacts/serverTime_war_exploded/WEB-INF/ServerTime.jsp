<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Anh
  Date: 4/24/2019
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Server Time</title>
</head>
<body>
Server Time

<%
    Date today = new Date();
    out.println(today);
%>
</body>
</html>

