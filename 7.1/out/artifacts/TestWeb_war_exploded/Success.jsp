<%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2020/7/2
  Time: 2:53 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*" contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Title</title>
</head>
<body>
<%=request.getAttribute("error") %>
登陆成功:<%= request.getParameter("username")%>
</body>
</html>
