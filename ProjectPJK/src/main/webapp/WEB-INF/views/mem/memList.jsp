<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록</title>
</head>
<body>
		<div>
			<h1>회원목록</h1>
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
							<c:forEach var="mem" items="${list}">							
						<tr>
							<td>${mem.memNo}</td>
							<td>${mem.memId}</td>
							<td>${mem.memName}</td>
							<td><fmt:formatDate value="${mem.memJoinDate}" pattern="YYYY-MM-dd"/></td>
						</tr>
							</c:forEach>
					</tbody>
				
				</table>
			</div>
		
		</div>
		
		
</body>
</html>