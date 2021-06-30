<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 화면</title>
</head>
<body>
	<div><h1>회원가입 화면</h1></div>
	<form action="memJoin" method="post">
		<div>
			<label>아이디 : </label>
			<input type="text" name="memId">
			<input type="button" value="중복검사">
		</div>
		<div>
			<label>비밀번호 : </label>
			<input type="text" name="memPass">
		</div>
		<div>
			<label>이름 : </label>
			<input type="text" name="memName">
		</div>
		
		<div><input type="submit" value="회원가입"></div>
	
	
	</form>

</body>
</html>