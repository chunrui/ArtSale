<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${user}" var="user">
uid:<c:out value="uid"></c:out>
username:<c:out value="${user.username}"></c:out>
password:<c:out value="${user.password}"></c:out>
logintime:<c:out value="${user.logintime}"></c:out>
loginouttime:<c:out value="${user.loginouttime}"></c:out>
power:<c:out value="power"></c:out>
</c:forEach>
</body>
</html>