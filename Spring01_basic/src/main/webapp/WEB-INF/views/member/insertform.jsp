<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>/views/member/insertform.jsp</title>
</head>
<body>
	<div class="container">
		<h1>ȸ���߰� ��</h1>
		<form action="${pageContext.request.contextPath }/member/insert" method="post">
			��ȣ <input type="text" name="num" />
			�̸� <input type="text" name="name" />
			�ּ� <input type="text" name="addr" />
			<button type="submit">�߰�</button>
		</form>
		
		<h1>ȸ���߰� ��2</h1>
		<form action="${pageContext.request.contextPath }/member/insert2" method="post">
			��ȣ <input type="text" name="num" />
			�̸� <input type="text" name="name" />
			�ּ� <input type="text" name="addr" />
			<button type="submit">�߰�</button>
		</form>
		
		<h1>ȸ���߰� ��3</h1>
		<form action="${pageContext.request.contextPath }/member/insert3" method="post">
			��ȣ <input type="text" name="num" />
			�̸� <input type="text" name="name" />
			�ּ� <input type="text" name="addr" />
			<button type="submit">�߰�</button>
		</form>
		
	</div>
</body>
</html>