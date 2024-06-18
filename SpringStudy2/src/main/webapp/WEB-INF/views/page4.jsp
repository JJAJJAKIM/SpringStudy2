<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>구구단</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body {background-color: #2d2521;}
  </style>
</head>
<body>

	<div class="container mt-3">
	  <h1 class="text-white text-center">구구단</h1>
		<form action="" method="get">
			<div class="input-group mb-3">
        <select class="form-select" name="dan" id="dan">
          <option value="A">전체</option>
          <option value="1">1단</option>
          <option value="2">2단</option>
          <option value="3">3단</option>
          <option value="4">4단</option>
          <option value="5">5단</option>
          <option value="6">6단</option>
          <option value="7">7단</option>
          <option value="8">8단</option>
          <option value="9">9단</option>
        </select>
				<button class="btn btn-success" type="submit">
          <svg xmlns="http://www.w3.org/2000/svg" width="30" height="30" fill="currentColor" class="bi bi-view-list" viewBox="0 0 16 16">
            <path d="M3 4.5h10a2 2 0 0 1 2 2v3a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2v-3a2 2 0 0 1 2-2m0 1a1 1 0 0 0-1 1v3a1 1 0 0 0 1 1h10a1 1 0 0 0 1-1v-3a1 1 0 0 0-1-1zM1 2a.5.5 0 0 1 .5-.5h13a.5.5 0 0 1 0 1h-13A.5.5 0 0 1 1 2m0 12a.5.5 0 0 1 .5-.5h13a.5.5 0 0 1 0 1h-13A.5.5 0 0 1 1 14"/>
          </svg>
				</button>
			</div>
	  </form>
  </div>
<!-- 반복 시작 -->
<%
	Object obj1 = request.getAttribute("list");
	Object dan = request.getAttribute("dan");

	if(obj1 !=null){
		List list = (List)obj1;
		int num_dan = Integer.parseInt(dan.toString());
		for(int i = 0; i < list.size(); i++ ){
			Object obj2 = list.get(i);
			List list2 = (List)obj2; 
%>
  <div class="container mt-3">
    <h2 class="text-white text-center"><%=num_dan+i %>단</h2>
    <div class="row text-center mt-3 fs-3">
<%			
			for(int j = 0; j < 9; j ++){
				Object obj3 = list2.get(j);
				String str = obj3.toString();
%>				
      <div class="col-sm-4">
        <p class="text-bg-light"><%=str %></p>
      </div>
<%			
			}
		}
		
	}		
%>
   
    </div>
  </div>

<!-- 반복 끝 -->
</body>
</html>