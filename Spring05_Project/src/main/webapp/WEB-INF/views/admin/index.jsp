<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>kubg Admin</title>
</head>
<body>
<div id="root">
	<header id="header">
		<div id="header_box">
			<%@ include file = "include/header.jsp" %>
		</div>
	</header>
	
	<nav id="nav">
		<div id="div_box">
			<%@ include file="include/nav.jsp" %>
		</div>
	</nav>
	
	<section id=container>
		<aside>
			<ul>
				<li>상품등록</li>
				<li>상품목록</li>
				<li>상품후기</li>
				<li>유저목록</li>
			</ul>
		</aside>
		<div id="container_box">
			본문영역
		</div>
	</section>
	
	<footer id="footer">
		<div id="footer_box">
			<%@ include file = "include/footer.jsp" %>
		</div>
	</footer>
</div>
</body>
</html>