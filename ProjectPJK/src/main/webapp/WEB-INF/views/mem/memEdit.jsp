<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정</title>
</head>
<body>

	<div>
		<h1>회원정보수정</h1>
		<div>
		<form action="memEdit" method="post">
			<div><input type="text" name="memNo" value="${edit.memNo}" readonly="readonly" /> </div>
			<div><input type="text" name="memId" value="${edit.memId}" readonly="readonly" /> </div>
			<div><input type="text" name="memName" value="${edit.memName}" /> </div>
			<div><input type="password" name="memPass" value="${edit.memPass}" /> </div>
			<div> <fmt:formatDate value="${edit.memJoinDate}" pattern="yyyy/MM/dd"/></div>
			<div><input type="submit"/ value="수정"></div>
		</form>
		
		<div>
			<button><a href="/mem/memDel">회원 탈퇴</a></button>
		</div>
	 
	
		</div>
	</div>
</body>
</html>