<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Home</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta name="author" content="" />
<!-- Facebook and Twitter integration -->
<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

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

<!-- Modernizr JS -->
<script src="js/modernizr-2.6.2.min.js"></script>
<!-- FOR IE9 below -->
<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

</head>

<script type="text/javascript">
	function register1() {
		var readerno = $("#no").val();
		var readername = $("#username").val();
		var readerpassword = $("#password").val();
		var phone = $("#phone").val();
		$
				.ajax({
					url : "${pageContext.request.contextPath }/register.action", //提交的action
					type : "post",
					data : {
						"readerno" : readerno,
						"readerpassword" : readerpassword,
						"readername" : readername,
						"phone" : phone,
						"readermajor" : "西安"
					},
					error : function(request) {
						alert("用户已存在！");
					},
					success : function(json) {

						if (json.success == false) {
							$("#toast").html(json.error);
							$("#toast").css("color", "red")
							$("#no").focus(function() {
								$("#toast").hide();
							});
							$("#password").focus(function() {
								$("#toast").hide();
							});
							$("#phone").focus(function() {
								$("#toast").hide();
							});
							$("#username").focus(function() {
								$("#toast").hide();
							});
							$("#toast").show();
						} else {
							location.href = "${pageContext.request.contextPath }/login.action";
						}
					}
				});
	}
	function userLogin1() {
		var readerno1 = $("#user").val();
		var readerpassword1 = $("#pass").val();
		$
				.ajax({
					url : "${pageContext.request.contextPath }/userLogin.action", //提交的action
					type : "post",
					data : {
						"readerno" : readerno1,
						"readerpassword" : readerpassword1,
					},

					success : function(json) {
						if (json.success == false) {
							$("#toastLogin").html(json.error);
							$("#toastLogin").css("color", "red")
							$("#user").focus(function() {
								$("#toastLogin").hide();
							});
							$("#pass").focus(function() {
								$("#toastLogintoastLogin").hide();
							});

							$("#toastLogin").show();
						} else {

							location.href = "${pageContext.request.contextPath }/bookAll.action";
						}
					},
					error : function(request) {
						alert("用户名或者密码错误！");
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
								<li class="active"><a
									href="${pageContext.request.contextPath }/bookAll.action"><span>主页</span></a></li>
								<li><a href="tour.html">预约借书</a></li>
								<li class="has-dropdown"><a href="#">我的图书</a></li>
								<li><a href="pricing.html">购买图书</a></li>
								<li class="btn-cta"><a href="#"><span>购物车</span></a></li>
							</ul>
						</div>
					</div>

				</div>
			</nav>

			<header id="gtco-header" class="gtco-cover" role="banner"
				style="background-image: url(images/g6.jpg)">
				<div class="overlay"></div>
				<div class="gtco-container">
					<div class="row">
						<div class="col-md-12 col-md-offset-0 text-left">


							<div class="row row-mt-15em">
								<div class="col-md-7 mt-text animate-box"
									data-animate-effect="fadeInUp">
									<span class="intro-text-small">Welcome to BookYou
										library</span>
									<h1 align="center">换个心情，读本好书</h1>
								</div>
								<div class="col-md-4 col-md-push-1 animate-box"
									data-animate-effect="fadeInRight">
									<div class="form-wrap">
										<div class="tab">
											<ul class="tab-menu">
												<li class="active gtco-first"><a href="#"
													data-tab="signup">登录</a></li>
												<li class="gtco-second"><a href="#" data-tab="login">注册</a></li>
											</ul>
											<div class="tab-content">


												<div class="tab-content-inner" data-content="login">
													<div id="toast" style="width: 60%" align="left"></div>
													<form name="register" id="register1" method="post">


														<div class="row form-group">
															<div class="col-md-12">
																<label for="username">学号</label> <input type="text"
																	class="form-control" id="no" name="readerno">
															</div>
														</div>
														<div class="row form-group">
															<div class="col-md-12">
																<label for="password">密码</label> <input type="password"
																	class="form-control" id="password"
																	name="readerpassword">
															</div>
														</div>


														<div class="row form-group">
															<div class="col-md-12">
																<label for="readername">姓名</label> <input type="text"
																	class="form-control" id="username" name="readername">
															</div>
														</div>
														<div class="row form-group">
															<div class="col-md-12">
																<label for="phone">手机号</label> <input type="text"
																	class="form-control" id="phone" name="phone">
															</div>
														</div>


														<div class="row form-group">
															<div class="col-md-12">
																<input type="button" class="btn btn-primary" value="注册"
																	onclick="register1()">
															</div>
														</div>
													</form>
												</div>







												<div class="tab-content-inner active" data-content="signup">
													<div id="toastLogin" style="width: 60%" align="left"></div>

													<form name="login22" id="login22">
														<div class="row form-group">
															<div class="col-md-12">
																<label for="username">学号</label> <input type="text"
																	class="form-control" id="user" name="readerno" />
															</div>
														</div>
														<div class="row form-group">
															<div class="col-md-12">
																<label for="password">密码</label> <input type="password"
																	class="form-control" id="pass" name="readerpassword" />
															</div>
														</div>

														<div class="row form-group">
															<div class="col-md-12">
																<input type="button" class="btn btn-primary" value="登录"
																	onclick="userLogin1()" />
															</div>
														</div>
													</form>


												</div>




											</div>
										</div>
									</div>
								</div>
							</div>


						</div>
					</div>
				</div>
			</header>

			<div id="gtco-counter" class="gtco-section">
				<div class="gtco-container">

					<div class="row">
						<div
							class="col-md-8 col-md-offset-2 text-center gtco-heading animate-box">
							<h2 style="margin-top: 50px;  margin-left:380px;"align="center">心情图书馆</h2>
							<p>
								<span style="margin-top: 50px; margin-left:380px;"align="center">BookYou</span>
							</p>
						</div>
					</div>

					<div class="row"></div>
				</div>
			</div>
		</div>
		<footer id="gtco-footer" role="contentinfo"style="margin-top: 50px">
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
	</div>

	</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
	</div>

	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
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

</body>
</html>

