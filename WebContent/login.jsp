<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<meta name="viewport" content="width=device-width" ,initial-scale="1">

<link rel="stylesheet" href="css/bootstrap.css">
<link rel = "stylesheet" href="css/loginstyle.css">
<link
	href="https://fonts.googleapis.com/css?family=Poor+Story&display=swap"
	rel="stylesheet">


<title>Login.jsp</title>


<style type="text/css">

</style>

<script type="text/javascript" src="js/httpRequest.js"></script>

<script type="text/javascript">
	function send(f) {
		var userID = f.userID.value.trim();
		var userPassword = f.userPassword.value.trim();

		if (userID == '') {
			alert("아이디를 입력하세요.");
			return;
		}

		if (userPassword == '') {
			alert("비밀번호를 입력하세요.");
			return;
		}

		var url = "login.do";
		var param = "userID=" + encodeURIComponent(userID) + "&userPassword="
				+ encodeURIComponent(userPassword);
		alert("얘다 :" + url + param);
		//userID=123&userPassword=123
		sendRequest(url, param, resultFn, "POST");
	}

	function resultFn() {
		if (xhr.readyState == 4 && xhr.status == 200) {
			var data = xhr.responseText;

			//[{'param':'clear'}]
			var json = eval(data);

			if (json[0].param == 'no_id') {
				alert("존재하지 않는 아이디 입니다.");

			} else if (json[0].param == 'no_pwd') {
				alert("비밀번호가 일치하지 않습니다.");

			} else {
				location.href = "clear.do";

			}
		}
	}
</script>

</head>
<body>
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
				<li><a href="main.jsp">메인</a></li>
				<li><a href="bbs.jsp">게시판</a></li>
			</ul>

			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="ture"
					aria-expanded="false">접속하기<span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li class="active"><a href="login.jsp">로그인</a></li>
						<li><a href="join.jsp">회원가입</a></li>
					</ul></li>
			</ul>
		</div>
	</nav>

	<!-- Page Header -->
  <header class="masthead" style="background-image: url('images/pattern.png')">
    <div class="container">
      <div class="row">
        <div class="col-lg-8 col-md-10 mx-auto">
          <div class="site-heading">
            <h1>For Restaurant</h1>
            <span class="subheading">Please join</span>
          </div>
        </div>
      </div>
    </div>
  </header>

	<!-- 로그인 폼 -->
	<div class="container login-form">
		<div class="col-lg-4"></div>
		<div class="col-lg-4" >
			<div class="jumbotron" style="padding-top: 20px; margin-top:50px;" > 
				<form method="get" name="f">
					<!-- action="login.do" value="로그인"-->
					<h3 style="text-align: center;">로그인 화면</h3>
					<div class="form-group">
						<input type="text" class="form-control" placeholder="아이디"
							name="userID" maxlength="20">
					</div>
					<div class="form-group">
						<input type="password" class="form-control" placeholder="비밀번호"
							name="userPassword" maxlength="20">
					</div>
					<input type="button" value="로그인"
						class="btn btn-primary form-control" onclick="send( this.form );">
				</form>
			</div>
		</div>
		<div class="col-lg-4"></div>
	</div>

	<div>

		<table class="table tlist">
			<tr class="success">
				<td>PARK NEUNGSIK</td>
				<td>010 9264 7083</td>
				<td>ks1466@naver.com</td>
			<tr>
			<tr class="danger">
				<td>Mary</td>
				<td>Moe</td>
				<td>mary@example.com</td>
			</tr>
			<tr class="info">
				<td>July</td>
				<td>Dooley</td>
				<td>july@example.com</td>
			</tr>
			<table>
	</div>

	
  <!-- Footer -->
  <footer>
    <div class="container">
          <p class="copyright text-muted">Copyright &copy; NeungSik Website 2019</p>
    </div>
  </footer>

	<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.3.1.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
				<!--
	<script type="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
	-->
</body>
</html>



































