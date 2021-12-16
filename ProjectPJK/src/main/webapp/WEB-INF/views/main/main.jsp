<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인</title>
</head>
<!-- 부트스트랩 primary 버튼 - 내 위치정보버튼 -->


<!-- 부트스트랩 이용을 위한 jQuery와 CDN -->
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/fullcalendar@5.10.1/main.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/fullcalendar@5.10.1/locales-all.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/fullcalendar@5.10.1/main.min.css" />
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script type="text/javascript">

//FullCalender 라이브러리 초기화
document.addEventListener('DOMContentLoaded', function() {
    var calendarEl = document.getElementById('calendar');
    var calendar = new FullCalendar.Calendar(calendarEl, {
      initialView: 'dayGridMonth'
    });
    calendar.render();
  });


// 카카오 지도 라이브러리 초기화
// 화면 초기화(현재위치 설정.) 
	window.onload = function(){
	
	navigator.geolocation.getCurrentPosition(locationLoadSuccess,
				locationLoadError);
	

	}
	
	
	function calender() {
		var today = new Date();
		var year = today.getYear()+1;
		var month = today.getMonth()+1;
		var day = today.getDay()+1;
		
		var firstDay = new Date(year, month, 1);
		var fDay = firstDay.getDate();
		var lastDay = new Date(year, month, 0);
		var lDay = lastDay.getDate();
		console.log(fDay);
		console.log(lDay);
		
		var calender = document.getElementById('calenderType');
		for (var i = 0; i < 5; i++) {
			const newCell = calender.rows[i].insertRow(-1);
			newCell.innerText = 'new';
			
		}
		
	}

//내 위치정보를 가져오는 스크립트
	var mapContainer = document.getElementById('map'), // 지도를 표시할 div
	mapOption = {
		center : new kakao.maps.LatLng(37.56646, 126.98121), // 지도의 중심좌표
		level : 3, // 지도의 확대 레벨
		mapTypeId : kakao.maps.MapTypeId.ROADMAP
	// 지도종류
	};

	//지도를 생성한다
	var map = new kakao.maps.Map(mapContainer, mapOption);

	function locationLoadSuccess(pos) {
		// 현재 위치 받아오기
		var currentPos = new kakao.maps.LatLng(pos.coords.latitude,
				pos.coords.longitude);

		// 지도 이동(기존 위치와 가깝다면 부드럽게 이동)
		map.panTo(currentPos);

		// 마커 생성
		var marker = new kakao.maps.Marker({
			position : currentPos
		});

		// 기존에 마커가 있다면 제거
		marker.setMap(null);
		marker.setMap(map);
		
		navigator.geolocation.getCurrentPosition(locationLoadSuccess,
				locationLoadError);
	};

	function locationLoadError(pos) {
		alert('위치 정보를 가져오는데 실패했습니다.');
	};

	//위치 가져오기 버튼 클릭시 현재 위치 표시.

	function getCurrentPosBtn() {

		navigator.geolocation.getCurrentPosition(locationLoadSuccess,
				locationLoadError);
	};
	
	

	
</script>
<body>
	<div>

		<h1>여기가 메인화면!</h1>

		<div>
			<a href="/mem/logout">로그아웃</a>
		</div>
		<div>
			<a href="/mem/memList">회원목록</a>
		</div>
		<div>
			<a href="/mem/memEdit">회원정보</a>
		</div>

		<div>
			<a href="/post/postAdd">일정등록</a>
		</div>
		<div>
			<a href="/post/postList">일정확인</a>
		</div>



		<div>
			<div id="map" style="width: 500px; height: 400px;"></div>
			<script type="text/javascript"
				src="//dapi.kakao.com/v2/maps/sdk.js?appkey=b77dd4786dffdfd4c8565d9ee163efbd"></script>
			<script>
				var container = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스
				var options = { //지도를 생성할 때 필요한 기본 옵션
					center : new kakao.maps.LatLng(33.450701, 126.570667), //지도의 중심좌표.
					level : 3
				//지도의 레벨(확대, 축소 정도)
				};

				var map = new kakao.maps.Map(container, options); //지도 생성 및 객체 리턴
			</script>


		</div>
		
		<button type="button" class="btn btn-lg btn-primary" id="getMyPositionBtn" onclick="getCurrentPosBtn()">내 위치 가져오기</button>


	</div>

<!-- fullCalender 달력 화면이 출력되는 위치 -->
	<div id='calendar'></div>



</body>
</html>