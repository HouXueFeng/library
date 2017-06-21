<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title></title>
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

<!-- Modernizr JS -->
<script src="js/modernizr-2.6.2.min.js"></script>
<!-- FOR IE9 below -->
<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->
<style type="text/css">
td {
	margin-left: 20px;
}
</style>
</head>
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
									href="${pageContext.request.contextPath }/bookAll.action">主页</a></li>
								<li><a
									href="${pageContext.request.contextPath}/selectAllBook.action">图书预约</a></li>
								<c:if test="${not empty userNo}">
									<li class="has-dropdown"><a
										href="${pageContext.request.contextPath }/queryBorrowAllBook.action">我的图书</a></li>
								</c:if>
								<li><a href="#">购买图书</a></li>
								<li><a href="#">借书</a></li>
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
				role="banner" style="background-image: url(images/g1.jpg)">
				<div class="overlay"></div>
				<div class="gtco-container">
					<div class="row">
						<div class="col-md-12 col-md-offset-0 text-left">
							<div class="row row-mt-15em">
								<div class="col-md-7 mt-text animate-box"
									data-animate-effect="fadeInUp">
									<span class="intro-text-small">See Our</span>
									<h2>BookYou图书馆</h2>
								</div>
							</div>
						</div>
					</div>
				</div>
			</header>


			<div id="gtco-features" class="border-bottom">
				<div class="gtco-container">
					<div class="row">
						<div
							class="col-md-8 col-md-offset-2 text-center gtco-heading animate-box"
							style="margin-left: 250px">
							<div
								class="col-md-8 col-md-offset-2 text-center gtco-heading animate-box">
								<h2 style="margin-top: 50px" align="center">八月畅销书籍</h2>
								<p>一本好书，一杯可乐，一场人生</p>
							</div>
							<p>&nbsp;</p>
						</div>
					</div>

					<div class="hrpic" style="background-image: url(images/hr.png);">

						读书资讯
						<div class="1" style="float: right;"><a href="${pageContext.request.contextPath }/selectAllBook.action">更多</a></div>
						<p>
						<p>
					</div>
					<div class="row">

						<c:forEach items="${ bookList}" var="book" begin="0" end="7">
							<div class="col-md-3 col-sm-6">
								<div class="feature-center animate-box"
									data-animate-effect="fadeIn" align="center">
									<div class="11"
										style="width: 200px;height: 200px; margin-left: 30px; background: url(images/${book.pic});">
									</div>
									<h3 align="center">书名：${book.bookname}</h3>
									<p align="center" style="color: green">￥：剩余数量${ book.number}/100</p>
									<p align="center">
										￥：${ book.bookprice}元&nbsp;&nbsp;&nbsp;&nbsp;<span><a
											href="${pageContext.request.contextPath }/bookdetail.action?callno=${book.callno}">查看详情</a></span>
									</p>
								</div>
							</div>
						</c:forEach>


					</div>
				</div>

				<div id="gtco-subscribe" style="margin-top: 50px;">
					<div class="gtco-container" style="margin-top: 50px;">
						<div class="row animate-box" style="margin-top: 50px;">
							<div class="col-md-8 col-md-offset-2 text-center gtco-heading"
								style="margin-top: 50px;">
								<h2>可以留下你的邮箱</h2>
								<p>有什么好书想看可以联系我们，我们将很感谢！！</p>
							</div>
						</div>
						<div class="row animate-box">
							<div class="col-md-8 col-md-offset-2">
								<form class="form-inline">
									<div class="col-md-6 col-sm-6">
										<div class="form-group">
											<label for="email" class="sr-only">Email</label> <input
												type="email" class="form-control" id="email"
												placeholder="Your Email">
										</div>
									</div>
									<div class="col-md-6 col-sm-6">
										<button type="submit" class="btn btn-default btn-block">Subscribe</button>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>

				<footer id="gtco-footer" role="contentinfo" style="margin-top: 50px">
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

