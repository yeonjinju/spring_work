<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/views/member/insertform.jsp</title>
</head>
<body>
	<div class="container">
		<h1>알림</h1>
		<p>
			<strong>${param.name }</strong> 님의 정보를 추가 했습니다.
			<a href="${pageContext.request.contextPath }/member/list">확인</a>
		</p>
	</div>
</body>
</html>