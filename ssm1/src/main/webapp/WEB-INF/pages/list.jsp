<%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2020/7/17
  Time: 4:53 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
<c:forEach items="${requestScope.userList}" var="user">
    <tr>
        <td>${user.loginName}</td>
        <td>
            <c:if test="${user.sex == 1}">男</c:if>
            <c:if test="${user.sex == 0}">女</c:if>
        </td>
        <td>
            ${user.email}
        </td>
    </tr>
</c:forEach>
</table>
 </body>
</html>
