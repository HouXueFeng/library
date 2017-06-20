<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>具体书籍信息</title>
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
								href="${pageContext.request.contextPath}/selectAllBook.action ">图书预约</a></li>
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
				role="banner" style="background-image: url(images/g4.jpg)">
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
							</div>
							<p>&nbsp;</p>
						</div>
					</div>


					分类查询 |详细查询
					<form class="form-search"
						action="${pageContext.request.contextPath }/selectAlllikeBook.action"
						method="post">
						<input type="text" class="form-control" name="bookname"
							id="bookname"
							style="border-radius: 10px; width: 200px; display: inline">
						<button type="submit" class="btn btn-info">Search</button>
					</form>
				</div>
				<div class="row">

					<c:forEach items="${ bookList}" var="book">
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
				<ul align="right" class="pagination"
					style="float: right; margin-right: 50px; width: 1000px">
					<li><a
						href="${pageContext.request.contextPath}/selectAllBook.action?page=${page.firstPage}">首页</a></li>
					<li><a
						href="${pageContext.request.contextPath}/selectAllBook.action?page=${page.prePage}">上一页</a></li>
					<c:forEach items="${page.navigatepageNums}" var="navigatepageNum">

						<c:if test="${navigatepageNum==page.pageNum}">
							<li class="active"><a
								href="${pageContext.request.contextPath}/selectAllBook.action?page=${navigatepageNum}">${navigatepageNum}</a></li>
						</c:if>
						<c:if test="${navigatepageNum!=page.pageNum}">
							<li><a
								href="${pageContext.request.contextPath}/selectAllBook.action?page=${navigatepageNum}">${navigatepageNum}</a></li>
						</c:if>
					</c:forEach>



					<li><a
						href="${pageContext.request.contextPath}/selectAllBook.action?page=${page.nextPage}">下一页</a></li>
					<li><a
						href="${pageContext.request.contextPath}/selectAllBook.action?page=${page.lastPage}">尾页</a></li>
				</ul>
			</div>
</body>

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
</html>