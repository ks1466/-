<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:if test="${ empty sessionScope.user }">

	<script>
		alert("로그인 후 이용하세요");
		location.href = "login.jsp";
	</script>

</c:if>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<meta name="viewport" content="width=device-width" ,initial-scale="1">

<link href="https://fonts.googleapis.com/css?family=Poor+Story&display=swap" rel="stylesheet">
<link rel="stylesheet" href="css/bootstrap.css">

<style type="text/css">

	body {
		font-family: 'Poor Story', cursive;
		font-size : 32px;
	}
</style>


<title>Insert title here</title>
</head>
<body>
	<div>
		<nav class="navbar navbar-default">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="main.jsp">RESERVATION SYSTEM</a>
			</div>

			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="main.jsp">예약 추가</a></li>
					<li><a href="main.jsp">예약 삭제</a></li>
					<li><a href="bbs.jsp">테이블 수정</a></li>
				</ul>

				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="ture"
						aria-expanded="false">접속하기<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li class="active"><a href="login.jsp">로그인</a></li>
							<li><a href="logout.do">로그아웃</a></li>
							<li><a href="join.jsp">회원가입</a></li>
						</ul></li>
				</ul>
			</div>
		</nav>

		${ sessionScope.user.userName }님 환영합니다.<br>
	</div>



	<script
		src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.3.1.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>
</html>