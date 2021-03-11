<%--
  Created by IntelliJ IDEA.
  User: 83540
  Date: 2021/3/8
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>

<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <h3>查询所有用户信息</h3>
        <c:forEach items="${list}" var="user">
            ${user.username}
        </c:forEach>
    </body>
</html>
