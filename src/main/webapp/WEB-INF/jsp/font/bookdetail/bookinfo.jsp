<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">


<link href="https://fonts.googleapis.com/css?family=Roboto:300,400,700"
	rel="stylesheet">

<!-- Animate.css -->
<link rel="stylesheet" href="css/animate.css">
<!-- Icomoon Icon Fonts-->
<link rel="stylesheet" href="css/icomoon.css">
<!-- Themify Icons-->
<link rel="stylesheet" href="css/themify-icons.css">
<!-- Bootstrap  -->
<link rel="stylesheet" href="css/bootstrap.css">

<!-- Magnific Popup -->
<link rel="stylesheet" href="css/magnific-popup.css">

<!-- Owl Carousel  -->
<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">

<!-- Theme style  -->
<link rel="stylesheet" href="css/style.css">
<style>
.error {
	width: 100%;
	margin-right: 200%;
	border-radius: 0 0 5px 5px;
	position: absolute;
	top: 0px;
	height: 40px;
	line-height: 40px;
	text-align: left;
	background-color: #CC0000;
	display: none;
	float: left;
}

cc {
	position: relative;
}
</style>
</head>
<script src="js/jquery.min.js"></script>

<script type="text/javascript">
	function yuyue() {
		$.ajax({
			url : "${pageContext.request.contextPath }/orderBook.action", //提交的action
			type : "post",
			data : {
				"orderbookno":${bookinfo.callno}
			},
			error : function(request) {
				alert("未知錯誤");
			},
			success : function(json) {
				if (json.success==false) {
					$(".error").css("background-color","red");
					$(".fail").html(json.error);
					$(".error").slideDown(); //下拉
					 setTimeout(function() { //设置指定时间后的动作
						$(".error").slideUp(); //上拉
					}, 4000); //时间
				}if(json.success==true){
					$(".error").css("background-color","green");
					$(".fail").html(json.error);
					$(".error").slideDown(); //下拉
					 setTimeout(function() { //设置指定时间后的动作
						$(".error").slideUp(); //上拉
					}, 4000); //时间
					
				}
			}
		});
	}
</script>
<body>



	<div class="gtco-loader"></div>

	<div id="page">


		<div class="page-inner">
			<nav class="gtco-nav" role="navigation">
			<div class="gtco-container">

				<div class="row">
					<div class="col-sm-4 col-xs-12">
						<div id="gtco-logo">
							<a href="index.html">BookYou <em>.</em></a>
						</div>
					</div>
					<div class="col-xs-8 text-right menu-1">
						<ul>
							<li class="active"><a href="${pageContext.request.contextPath }/bookAll.action">主页</a></li>
							<li><a href="${pageContext.request.contextPath }/queryBorrowAllBook.action">我的预约</a></li>
							<li class="has-dropdown"><a href="#">图书资料</a></li>
							<li><a href="pricing.html">购买图书</a></li>
							<li><a href="contact.html">借书</a></li>
							<c:if test="${empty userNo }">
								<li class="btn-cta"><a
									href="${pageContext.request.contextPath }/login.action"><span>请登录</span></a></li>

							</c:if>
							<c:if test="${not empty userNo }">
								<li class="btn-cta"><a
									href="${pageContext.request.contextPath }/login.action"><span>${userNo.readerno }&nbsp;欢迎您</span></a></li>
							</c:if>
						</ul>
					</div>
				</div>
			</div>
			</nav>
			<header id="gtco-header" class="gtco-cover gtco-cover-sm"
				role="banner" style="background-image: url(images/${bookinfo.pic})">
			<div class="overlay"></div>
			<div class="gtco-container">
				<div class="row">
					<div class="col-md-12 col-md-offset-0 text-left">
						<div class="row row-mt-15em">
							<div class="col-md-7 mt-text animate-box"
								data-animate-effect="fadeInUp">
								<span class="intro-text-small"><font color="white"
									size="20sp">书名</font></span>
								<h2>${bookinfo.bookname}&nbsp;&nbsp;${bookinfo.bookobject }</h2>
							</div>
						</div>
					</div>
				</div>
			</div>
			</header>

			<div id="gtco-subscribe">


				<div id="111"
					style="float: right; margin-top: 50px; margin-right: 100px">
					<font color="white" size="20">￥：售价${bookinfo.bookprice  }</font>
					<div>
						<h2 style="float: right">
							<font color="white">作者->${bookinfo.bookauther}</font>
						</h2>
					</div>
					<div>
						<h2 style="float: right">
							<font color="white">出版时间->${bookinfo.time}！</font>
						</h2>

					</div>
				</div>



				<div class="gtco-container">

					<div class="row animate-box">
						<div class="col-md-8 col-md-offset-2 text-center gtco-heading">

							<div id="222"
								style="float: left; margin-right: 100px; margin-top: 50px; width: 600px; height: 200px">
								${bookinfo.description }</div>
						</div>
						<c:if test="${ not empty userNo }">

							<div id="yuyuebutton" onclick="yuyue()"
								style="float: left; margin-left: 40px; margin-top: -10px; width: 96px; height: 44px; background: url('images/p0.png');">
								<div class="error">
									<div class="fail" style="float: left; color: #dad4d4;">这里是错误信息</div>
								</div>
							</div>
						</c:if>
						<font color="white" style="float: right; margin-right: 50px">剩余数量：${bookinfo.number}/100本</font>


					</div>
					<div class="row animate-box"></div>

				</div>

			</div>

			<footer id="gtco-footer" role="contentinfo" style="margin-top:50px;">
			<div class="gtco-container">
				<div class="row row-p	b-md">

					<div class="col-md-4">
						<div class="gtco-widget">
							<h3>
								About <span class="footer-logo">书情<span>.<span></span>
							</h3>
							<p>八月的新书已经上架了，敬请期待</p>
							<p>----------By 书情图书馆</p>

						</div>
					</div>

					<div class="col-md-4 col-md-push-1">
						<div class="gtco-widget">
							<h3>Links</h3>
							<ul class="gtco-footer-links">
								<li><a href="#">关于我们</a></li>
								<li><a href="#">留言</a></li>
								<li><a href="#">点击返回顶部</a></li>
								<li><a href="#">服务咨询</a></li>
								<li><a href="#">意见</a></li>
							</ul>
						</div>
					</div>

					<div class="col-md-4">
						<div class="gtco-widget">
							<h3>Get In Touch</h3>
							<ul class="gtco-quick-contact">
								<li><a href="#"><i class="icon-phone"></i> 联系我们+1 234
										567 890</a></li>
								<li><a href="#"><i class="icon-mail2"></i> 图书馆论坛</a></li>
								<li><a href="#"><i class="icon-chat"></i> 在线聊天</a></li>
							</ul>
						</div>
					</div>

				</div>

				<div class="row copyright">
					<div class="col-md-12">
						<p class="pull-left">
							<small class="block">Copyright &copy; 2016.Company name
								All rights reserved.@by Hou</small>
						</p>
						<p class="pull-right">
						<ul class="gtco-social-icons pull-right">
							<li><a href="#"><i class="icon-twitter"></i></a></li>
							<li><a href="#"><i class="icon-facebook"></i></a></li>
							<li><a href="#"><i class="icon-linkedin"></i></a></li>
							<li><a href="#"><i class="icon-dribbble"></i></a></li>
						</ul>
						</p>
					</div>
				</div>

			</div>
			</footer>
</body>

<!-- jQuery -->
<!-- jQuery Easing -->
<script src="js/jquery.easing.1.3.js"></script>
<!-- Bootstrap -->
<script src="js/bootstrap.min.js"></script>
<!-- Waypoints -->
<script src="js/jquery.waypoints.min.js"></script>
<!-- Carousel -->
<script src="js/owl.carousel.min.js"></script>
<!-- countTo -->
<script src="js/jquery.countTo.js"></script>
<!-- Magnific Popup -->
<script src="js/jquery.magnific-popup.min.js"></script>
<script src="js/magnific-popup-options.js"></script>
<!-- Main -->
<script src="js/main.js"></script>

</html>