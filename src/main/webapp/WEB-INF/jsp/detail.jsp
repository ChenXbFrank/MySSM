<%@ page contentType="text/html; charset=UTF-8"%>
<%--这句话要加 不然不会显示真正的数据库值  只显示${book.bookId} 字符串--%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Book详情页面</title>
</head>
<body>
    <p>Book详情页面</p>
    <p>${book.bookId}</p><br>
    <p>${book.name}</p><br>
    <p>${book.number}</p><br>
</body>
</html>