<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PAGE1</title>
</head>
<body>
<p>${a}</p>
<p>${param.a}</p>
<hr>
<p>${b}</p>
<hr>
<p>${c+d}</p>
<c:if test="${c+d==6}">
	<p>참</p>
</c:if>
<c:if test="${e}">
	<p>참2</p>
</c:if>
<hr>
<p>${list }</p>
<p>${list[2] }</p>
<c:forEach items="${list}" var="s"  >
	<p>${s}</p>
</c:forEach>
</body>
</html>