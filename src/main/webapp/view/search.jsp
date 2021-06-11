<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/6/2021
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<html>
<head>
    <title>Search</title>
</head>
<body>
<form action="" method="post">
    <label>English</label>
    <br>
    <input type="text" name="english" value="${en}">
    <button type="submit" value="Search">submit</button>
    <br><br>
    <label>VietNam</label><br>
    <input name="vn" value="${vn}" disabled><br><br>
</form>
</body>
</html>
