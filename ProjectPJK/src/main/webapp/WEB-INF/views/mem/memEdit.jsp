<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
			<table border="1">
				<thead>
					<tr>
						<th>회원번호</th>
						<th>아이디</th>
						<th>이름</th>
						<th>가입일</th>
					</tr>
				</thead>
				<tbody>
						<tr>
							<td>${edit.memNo}</td>
							<td>${edit.memId}</td>
							<td>${edit.memName}</td>
							<td><fmt:formatDate value="${edit.memJoinDate}" pattern="YYYY-MM-dd" /></td>
						</tr>
				</tbody>

			</table>
		</div>
	</div>
</body>
</html>