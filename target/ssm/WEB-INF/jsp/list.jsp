<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>Book List集合</title>
</head>
<body>
<p>遍历List集合的全部元素：</p>
<c:forEach items="${list}" var="book" varStatus="vs">
    <tr>
        <td>
            <s:property value="#vs.index+1"/>
        </td><br>
        <td align = "center">${book.bookId}</td><br>
        <td align = "center">${book.name}</td><br>
        <td align = "center">${book.number}</td><br>
    </tr>
</c:forEach>
</body>
</html>