<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js" ></script>
<style>
	th{
		text-align:center
	}
</style>
<script type="text/javascript">
	$(function(){
		var ta=$("table:first");
		$.ajax({
			url:"getAll",
			type:"post",
			dataType:"json",
			success:function(data){
				console.log(data);
				var str="<tr><th>编号</th><th>线路名称</th><th>团购价</th><th>最大优惠</th><th>天数</th><th>主图</th><th>副图1</th><th>副图2</th><th>副图3</th><th>简介副图2</th><th>出游方式</th><th>线路类型</th></tr>";
				$(data).each(function(i,s){
					str+"<tr>";
					str+="<td>"+s.lineId+"</td>";
					str+="<td>"+s.lineName+"</td>";
					str+="<td>"+s.teamPrice+"</td>";
					str+="<td>"+s.maxYh+"</td>";
					str+="<td>"+s.days+"</td>";
					str+="<td>"+s.mainPic+"</td>";
					str+="<td>"+s.picOne+"</td>";
					str+="<td>"+s.picTwo+"</td>";
					str+="<td>"+s.picThree+"</td>";
					str+="<td>"+s.introduce+"</td>";
					str+="<td>"+s.vehicle+"</td>";
					str+="<td>"+s.lineTypeName+"</td>";
					str+="</tr>";
				})
				ta.html(str);
			}
		})
	})
</script>
</head>
<body>
	<div class="container" style="width:1500px">
		<table class="table table-striped table-bordered table-hover">
			
		</table>
	</div>
</body>
</html>