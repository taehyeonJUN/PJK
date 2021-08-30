<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 화면</title>

<!-- JS, Popper.js, and jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">

window.onload = function(){
	

	const btnMemChk = document.getElementById("btnMemChk");
	btnMemChk.addEventListener("click", memChk);

	
	/* 
	 * 바닐라 사용 AJAX
	 */	
	 
	 /*
	function memChk(){
		console.log("11111");
		var xhr = new XMLHttpRequest(); // 객체생성
		let param = document.getElementById("memId").value;
		
		if(param == null || param == ""){
			alert("아이디를 입력해 주세요");
			return false;
		}
		
		let data = {memId:param}
		
		xhr.open("POST", "/mem/memChk");
		xhr.setRequestHeader("Content-Type","application/json");
		xhr.send(JSON.stringify(data));
		console.log("2222");
		
		
		xhr.onreadystatechange = function(){
			if(xhr.readyState === xhr.DONE){
				
				console.log(xhr.respose);
				
				if(xhr.status === 200 || xhr.status === 201){
					console.log("333333");
					console.log(xhr.respose);
					var obj = JSON.parse(xhr.responseText);
					console.log(obj);
					//ajax 송수신은 되나 값을 못불러옴
					
				}else{
					console.log(xhr.resposeText);
				}
			}		
		};
		*/
		
		
		
/*
 * 제이쿼리 사용 AJAX
 */
	 function memChk(){
			
			var memId = $('#memId').val();
			
			if(memId == null || memId == ""){
				alert("아이디를 입력해 주세요");
				return false;
			}
			
			var data = {memId:memId};
			
			$.ajax({
				type : "POST",
				url : "/mem/memChk",
				data : JSON.stringify(data),
				dataType:"json",
				contentType : "application/json",
				success : function(data){
					
						console.log(data);
				
						if(data > 0){
							alert("아이디가 중복되었습니다");
							return false;
						}
						else {							
							alert("사용 가능한 아이디 입니다.");
						}
					
				}
				, error : function(error){
					alert("전송실패");
				}
			
				
				
			});
		}
		
		
		
	}
	



</script>

</head>
<body>
	<div><h1>회원가입 화면</h1></div>
	<form action="memJoin" method="post">
		<div>
			<label>아이디 : </label>
			<input id="memId" type="text" name="memId">
			<input id="btnMemChk" type="button" value="중복검사" src="javascript : memChk();" >
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