<%--
  Created by IntelliJ IDEA.
  User: Anh
  Date: 5/7/2019
  Time: 10:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Currency Conversion</h1>
  <form action="/exchangeMoney" method="get">
    <fieldset>
      <legend>Currency Conversion</legend>
      <table>
        <tr>
          <td>USD:</td>
          <td><input name="usd" type="text" placeholder="Enter USD" ></td>
        </tr>
        <tr>
          <td>Rate:</td>
          <td><input name="rate" type="text" placeholder="Enter rate" ></td>
        </tr>
        <tr>
          <td></td>
          <td><input type="submit" id="submit" value="Exchange"></td>
        </tr>
      </table>
    </fieldset>
  </form>
  </body>
</html>
