<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- 구글차트 GoogleChart -->
	<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
    
    google.charts.load('current', {'packages':['corechart']});
    google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
    	  var jsonData = $.ajax({
    		  
    		  url: "chartData.do",
    		  data: "chartId=admin",
    		  dataType:"json",
    		  async: false
    		}).responseText;

    	  var stringJson = JSON.parse(jsonData);
    	  
    	  console.log(jsonData);
    	  console.log(typeof(jsonData));
    	  console.log(stringJson.map[0].chartMdate);
    	  console.log(typeof(stringJson));
    	  console.log(stringJson.map[0].chartreadingtime);
    	  
    	  
    	  var data = new google.visualization.DataTable();
    	  data.addColumn('string', 'chartMdate');
    	  data.addColumn('number', 'chartreadingtime');
    	  
    	  var dataArray = [];
    	  for(var i = 0; i < stringJson.map.length; i++){
				dataArray.push([stringJson.map[i].chartMdate, Number(stringJson.map[i].chartreadingtime)]);
			};
			
			data.addRows(dataArray);
    	  
        var options = {
          title: '독서량(분)',
          curveType: 'function',
          legend: { position: 'bottom' }
        };

        var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));

        chart.draw(data, options);
      }
    
    </script>
    
</head>
<body>

<!-- 구글차트 위치-->
	<div id="curve_chart" method="post" style="width:900px; height:500px"></div>
	
<!-- 독서량 전달 -->
	<p>독서량추가</p>
	<form action="readingTimeInsert.do" method="post">
		<!-- 날짜 -->
		<input type="date" name="chartMdate" style="width:30%" />
		<br/>
		<!-- 독서한 시간(분) -->
		<input type="range" min="1" max="600" style="width:30%" id="chartreadingtime" name="chartreadingtime" oninput="document.getElementById('CRTime').innerHTML=this.value;">
		<br/>
		<span id="CRTime" ></span>분
		<input type="submit" value="등록" />
	</form>
	
	<input type="hidden" id="id" value="admin" name="chartid" />
	
<!-- 
	구글 API 샘플
	
	google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Year', 'Sales', 'Expenses'],
          ['2004',  1000,      400],
          ['2005',  1170,      460],
          ['2006',  660,       1120],
          ['2007',  1030,      540]
        ]);

        var options = {
          title: 'Company Performance',
          curveType: 'function',
          legend: { position: 'bottom' }
        };

        var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));

        chart.draw(data, options);
      }

 -->	
</body>
</html>












