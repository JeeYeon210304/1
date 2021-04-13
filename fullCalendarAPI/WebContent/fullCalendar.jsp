<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8");%>
<%response.setContentType("text/html; charset=UTF-8");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>∴fullCalendar∵</title>
<link href='fullcalendar/main.css' rel='stylesheet' />
</head>
<body>


					<p><em>지도를 클릭해주세요!</em></p>
						약속장소	<br/>
						<div id="makerSpace" >
					 지번주소&emsp;<input type="text" name="postLongitude" value=""/>
					
						</div>
						<br>
						<input type="hidden" id="MapAddress" name="MapAddress" value="" /> 
						<div class="map_wrap">
						    <div id="map" style="width:100%;height:100%;position:relative;overflow:hidden;"></div>
						    <div class="hAddr">
						        <span class="title">지도중심기준 행정동 주소정보</span>
						        <span id="centerAddr"></span>
						    </div>
						</div> 
	
<script type="text/javascript" src="/fullCalendarAPI/resources/JavaScript/fullCallendar.js"></script>
<script src='/fullCalendarAPI/resources/API/fullcalendar-5.6.0/lib/main.js'></script>
<link href='/fullCalendarAPI/resources/API/fullcalendar-5.6.0/lib/main.css' rel='stylesheet' />
</body>
</html>