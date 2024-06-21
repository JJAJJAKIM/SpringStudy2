<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://github.com/JosephBean/SpringStudy2/blob/main/src/main/webapp/resources/images/logo.png?raw=true" rel="icon" type="image/x-icon">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>DETAIL</title>
</head>
<body>
<%
	Object obj1 = request.getAttribute("title");
	Object obj2 = request.getAttribute("content");
	String title = obj1.toString();
	String content = obj2.toString();
%>
    <div class="container mt-3">
        <h1 class="text-center bg-success text-dark bg-opacity-50">DETAIL</h1>
        <form action="./detail" method="get">
            <div class="mb-3 mt-3">
              <label for="title" class="form-label">Title:</label>
              <input type="text" class="form-control" id="title" placeholder="Enter title" name="title"  value ='<%=title%>' required autocomplete="off">
            </div>
            <div class="mb-3">
              <label for="content" class="form-label">Content:</label>
              <input type="text" class="form-control" id="content" placeholder="Enter content" name="content" value='<%=content%>' autocomplete="off">
            </div>
            <div class="d-grid gap-2 d-md-flex justify-content-md-end">
                <button class="btn btn-primary me-md-2" type="submit">수정</button>
                <a class="btn btn-success" href="./list">승인</a>
                <a class="btn btn-warning" href="./list">미승인</a>
                <a class="btn btn-secondary" href="./list">취소</a>
            </div>
        </form>
    </div>
</body>
</html>