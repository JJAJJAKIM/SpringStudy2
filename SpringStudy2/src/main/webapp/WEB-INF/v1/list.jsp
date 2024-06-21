<%@page import="app.dto.ExamDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://github.com/JosephBean/SpringStudy2/blob/main/src/main/webapp/resources/images/logo.png?raw=true" rel="icon" type="image/x-icon">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>LIST</title>
    <style>
        a.list-group-item:hover {cursor: pointer;font-weight:bold;color:#fff;background-color:#b2327d;box-shadow:5px 5px 10px 5px rgba(77, 71, 71, 0.2);}
    </style>
</head>
<body>
<%
	Object obj1 = request.getAttribute("list");
	List<ExamDTO> list = null;
	if(obj1 !=null){
		list = (List<ExamDTO>)obj1;
	}
	
%>
    <div class="container mt-3">
        <h1 class="text-center bg-success text-dark bg-opacity-50">LIST</h1>
        <div class="d-grid gap-2 d-md-flex justify-content-md-end">
            <a href="#" class="btn btn-secondary">전체</a>
            <a href="#" class="btn btn-success">승인</a>
            <a href="#" class="btn btn-warning">미승인</a>
            <a href="./new" class="btn btn-primary">추가</a>
        </div>
        <div class="list-group mt-2 text-center">
<% 
	for(ExamDTO dto : list) { 
%>        
            <a class="list-group-item m-1 bg-success display-6" href="./detail?title=<%=dto.getTitle()%>&content=<%=dto.getContent()%>">
                <%=dto.getTitle() %> 
            </a>
<!--             <a class="list-group-item m-1 bg-success display-6" href="./detail">
                제목2 정보    
            </a>
            <a class="list-group-item m-1 bg-info display-6" href="./detail">
                제목3 정보    
            </a>
            <a class="list-group-item m-1 bg-info display-6" href="./detail">
                제목4 정보    
            </a>
            <a class="list-group-item m-1 bg-success display-6" href="./detail">
                제목5 정보    
            </a>
            <a class="list-group-item m-1 bg-info display-6" href="./detail">
                제목6 정보    
            </a>
            <a class="list-group-item m-1 bg-success display-6" href="./detail">
                제목7 정보    
            </a>
            <a class="list-group-item m-1 bg-info display-6" href="./detail">
                제목8 정보    
            </a>
            <a class="list-group-item m-1 bg-info display-6" href="./detail">
                제목9 정보    
            </a> -->
<%
	}
%>
        </div>
    </div>
</body>
</html>