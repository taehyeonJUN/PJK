<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>포스트 작성</title>
</head>

<body>

	<div>
		<form action="add" method="post">
		
			<div>
				<input type="text" name="postTitle"/>
			</div>

			<div>
				<textarea name="postTitle" placeholder="내용입력" rows="20" cols="30"></textarea>
			</div>
			
			<div>
				<input type="submit" value="작성">
			</div>		
		
		
		</form>
	</div>

</body>
</html>