<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>购物车</title>
<link href="css/layout.css" rel="stylesheet" type="text/css" />
<link href="css/nf.lightbox.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
<script type="text/javascript" src="js/NFLightBox.js"></script>
<script type="text/javascript" src="js/shop2.js"></script>
<style type="text/css">
.mask { /*遮罩层*/
    background-color:gray;
    left:0;
    position:absolute;
    top:0;
    z-index:100;
    filter:alpha(opacity=30);
   opacity:0.3;
}

div.dialog {
	width: 296px;
	height:173px;
	position: absolute;
	z-index: 101;
	display: none;
    background-image:url(images/dialog.png)
}

div.title {
	padding-top: 5px;
	padding-left:270px;
}
div.dialog div.content {

	height: 90px;
	text-align:center;

	font:bold 15px/90px Verdana, Geneva, sans-serif;
}

div.dialog div.bottom {
	text-align: right;
	padding: 10px 10px 10px 0px;
	border-top:1px dashed #999999;

}
div.bottom .btn1 {
	border:none;
	width: 63px;
	height: 29px;
	cursor:pointer;
	
}
div.bottom #btnSure{
	background-image:url(images/delSure.jpg);
}
div.bottom #btnCancel{
	background-image:url(images/delCancel.jpg);
}
</style>



</head>

<body>
<!--头部-->
<div id="top-cont">
  <div id="top-min">
    <div id="min-left"></div>
    <div id="min-right"></div>
  </div>
</div>
<div id="menu">
  <div id="menu-m">
    <ul>
      <li><a href="index.jsp">首页</a></li>
      <li style="width:8px;"><img src="images/t1.jpg" width="8" height="42" /></li>
      <li><a href="type.html">境内游</a></li>
      <li style="width:8px;"><img src="images/t1.jpg" width="8" height="42" /></li>
      <li><a href="#">境外游</a></li>
      <li style="width:8px;"><img src="images/t1.jpg" width="8" height="42" /></li>
      <li><a href="#">热门游</a></li>
      <li style="width:8px;"><img src="images/t1.jpg" width="8" height="42" /></li>
      <li><a href="group.html">团购</a></li>
      <li><a href="cart.html"><img src="images/che.jpg" width="176" height="42" /></a></li>
    </ul>
  </div>
</div>
<!--广告位图片-->


<!--注册版块-->
<div id="shop">
  <div id="shop-t">
    <div id="shop-l"><img src="images/sh.jpg" width="74" height="67" /></div>
    <div id="shop-r">我的购物车</div>
  </div>
  <div id="shop-inf">
    <ul>
      <li class="xh">序号</li>
      <li class="lx">路线名称</li>
      <li class="rs">单价</li>
      <li class="dj"><a href="#">下单</a></li>
      <li class="cz">操作</li>
    </ul>
  </div>
  <div id="shop-xx">
	  <c:forEach var="c" items="${ls}" varStatus="vs" >
	  	<ul id="shop${vs.index+1 }" name="${c.cartId }">
	      <li class="xh">${vs.index+1 }</li>
	      <li class="lx">
	        <div id="luxian">
	          <ul>
	            <li><a href="javascript:void(0)" title="${c.lineName }"><img src="${c.mainPic }" width="87" height="58"  /></a></li>
	            <li><a href="#">产品编号：${c.lineId }线路名：${c.lineName }【交通工具+${c.vehicle}】</a></li>
	          </ul>
	        </div>
	      </li>
	      <li class="rs">￥${c.teamprice }</li>
	      <li class="dj"><a href="order.html">下单</a></li>
	      <li class="cz"><a href="#" class="btnDel" ><span style="color:#F60; text-decoration:underline;">删除</span></a></li>
	    </ul>
	  </c:forEach>
</div>
<div id="fanye"><a href="getCart?page=1">首页</a>
	<c:choose>
		<c:when test="${pageNo>1}">
			<a href="getCart?page=${pageNo-1}">上一页</a>
		</c:when>
		<c:otherwise>
			<a href="javascript:void(0)">上一页</a>
		</c:otherwise>
	</c:choose>
	<c:choose>
		<c:when test="${pageNo<pageNum}">
			<a href="getCart?page=${pageNo+1}">下一页</a>
		</c:when>
		<c:otherwise>
			<a href="javascript:void(0)">下一页</a>
		</c:otherwise>
	</c:choose>
  <a href="getCart?page=${pageNum}">尾页</a></div>
<div id="jine">应付金额：<span style="color:#F00;"></span>元</div>
<div id="js">
  <input name="button" type="image" id="button" value="提交" src="images/js.jpg" />
</div>
</div>

<!--底部-->
<div id="foot">
  <div id="foot-t">
    <p>许可证编号：WE125482154 鄂ICP备125478966</p>
    <p><a href="#">隐私保护</a> | <a href="#">诚聘英才</a> | <a href="#">关于我们</a> | <a href="#">网站地图</a> | <a href="#">友情链接</a> | <a href="#">商务合作</a></p>
  </div>
</div>
<div class="mask"></div>


<div class="dialog">
  <div class="title">
    <img src="images/del.png" id="closePic" title="关闭"/> </div>
  <div class="content"> <p>您真的要删除这条记录吗？</p></div>
  <div class="bottom">
    <input type="button" value="" class="btn1"  id="btnSure"/>
    <input type="button" value="" class="btn1" id="btnCancel" />
  </div>
</div>
</body>
</html>
