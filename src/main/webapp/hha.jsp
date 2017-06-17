<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
	width: 80%;
	margin-left: 10%;
	border-radius: 0 0 5px 5px;
	position: absolute;
	top: 0px;
	height: 40px;
	line-height: 40px;
	text-align: center;
	background-color: #CC0000;
	display: none;
}

body {
	position: relative;
}
</style>


</head>
<script src="js/jquery.min.js"></script>

<script type="text/javascript">
$(function(){
	$("body").click(function(){    //点击body区域后触发下拉显示框
		$(".error").slideDown();    //下拉
		setTimeout(function(){    //设置指定时间后的动作
			$(".error").slideUp();    //上拉
		},2000);    //时间
	});
})
</script>
<body>
<div class="error"><span>这里是错误信息</span></div>
hha 
</body>
</html>