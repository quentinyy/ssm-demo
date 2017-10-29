<%--
  Created by IntelliJ IDEA.
  User: 17734
  Date: 2017/10/29
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${user.pic!=null}">
    <img src="${pageContext.request.contextPath}/upload/${user.pic}">
</c:if>
<c:if test="${user.pic==null}">
    no img
</c:if>
</body>
</html>
