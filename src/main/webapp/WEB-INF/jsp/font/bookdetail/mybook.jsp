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
							<li><a href="tour.html">图书预约</a></li>
							<li class="has-dropdown"><a
								href="${pageContext.request.contextPath}/queryBorrowAllBook.action">我的图书</a></li>
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
						<div class="feature-center animate-box"
							data-animate-effect="fadeIn" align="center">
							<div class="hrpic"
								style="background-image: url(images/hr.png); width: 1100px;">

								<h3>您预约的图书如下：</h3>
								<p>
								<p>
							</div>

							<c:if test="${borrowList!=null}">
								<c:forEach items="${borrowList }" var="borrow">
									<div class="col-md-6">
										<div class="price-box">
											<div class="price">
												<div class="11"
													style="width: 300px;height: 300px; margin-left: 30px; background: url(images/${borrow.bookinfo.pic});">
												</div>
											</div>
											<p></p>
											<hr>
											<ul class="pricing-info">
												<li><h3>
														<img src="images/3.png" width="50px;" height="50px;" />书籍名称:${borrow.bookinfo.bookname }
														</h2></li>
												<li><h3>
														<img src="images/4.png" width="50px;" height="50px;" />类型:${borrow.bookinfo.bookobject }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
													</h3></li>
												<li><h3>
														<img src="images/5.png" width="50px;" height="50px;" />出版日期:${borrow.bookinfo.time }
													</h3></li>
												<li><h3>
														<img src="images/6.png" width="50px;" height="50px;" />预约时间:${borrow.intime }
													</h3></li>
												<p>
											</ul>
											<a href="#" class="btn btn-default btn-sm">取消预约此书</a>
										</div>
									</div>
								</c:forEach>
							</c:if>
							<ul align="right" class="pagination"  style="float: right; margin-right: 50px">
								<li><a
									href="${pageContext.request.contextPath}/queryBorrowAllBook.action?page=${page.firstPage}">首页</a></li>
								<li><a
									href="${pageContext.request.contextPath}/queryBorrowAllBook.action?page=${page.prePage}">上一页</a></li>
								<li><a
									href="${pageContext.request.contextPath}/queryBorrowAllBook.action?page=${page.nextPage}">下一页</a></li>

								<li><a
									href="${pageContext.request.contextPath}/queryBorrowAllBook.action?page=${page.lastPage}">尾页</a></li>
							</ul>
						</div>



					</div>

					<footer id="gtco-footer" role="contentinfo"
						style="margin-top: 50px">
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