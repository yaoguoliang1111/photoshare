<%@ page language="java" contentType="text/html; utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<!--[if IE 8 ]> <html lang="en" class="ie8"> <![endif]-->
<!--[if IE 9 ]> <html lang="en" class="ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />

<title>个人信息</title>


<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<![endif]-->

<link href="css/normalize2.css" rel="stylesheet" />
<link href="css/jquery-ui.css" rel="stylesheet" />
<link href="css/jquery.idealforms.min.css" rel="stylesheet"
	media="screen" />
<link href="css/main.css" rel="stylesheet" type="text/css" />

<style type="text/css">
#my-form {
	width: 400px;
	margin: 0 auto;
	border: 1px solid #ccc;
	padding: 3em;
	border-radius: 3px;
	box-shadow: 0 0 2px rgba(0, 0, 0, .2);
}

#comments {
	width: 350px;
	height: 100px;
}
</style>

</head>
<body>
	<header id="header" class="header">
		<div class="wsmenucontent overlapblackbg"></div>
		<div class="wsmenuexpandermain slideRight">
			<a id="navToggle" class="animated-arrow slideLeft"> <span></span>
			</a>
		</div>
		<div class="header_down">
			<div class="container">
				<div class="wrapper clearfix bigmegamenu">
					<!--Main Menu HTML Code-->
					<nav class="wsmenu slideLeft clearfix">
						<ul class="mobile-sub wsmenu-list">

							<li class="active"><span class="wsmenu-click"></span> <a
								href="index.html">首页</a></li>
							<li><span class="wsmenu-click"></span> <a
								href="category.html">人像</a></li>
							<li><span class="wsmenu-click"></span> <a
								href="category.html">生活</a></li>
							<li><span class="wsmenu-click"></span> <a
								href="category.html">动物</a></li>
							<li><span class="wsmenu-click"></span> <a
								href="category.html">建筑</a></li>
							<li><span class="wsmenu-click"></span> <a
								href="category.html">风景</a></li>
							<li><span class="wsmenu-click"></span> <a
								href="category.html">运动</a></li>
							<li><span class="wsmenu-click"></span> <a href="">其它 <span
									class="arrow"></span>
							</a>
								<ul class="wsmenu-submenu">
									<li><a href="404.html">404 page</a></li>
									<li><a href="category.html">Category page</a></li>
									<li><a href="news.html">News page</a></li>
									<li><a href="search-result.html">Search result</a></li>
									<li><a href="full-width.html">Full width</a></li>
								</ul></li>


							<c:if test="${sessionScope.user.uName!=null}">

								<li><span class="wsmenu-click"></span> <a href="">${sessionScope.user.uName}
										<span class="arrow"></span>
								</a>
									<ul class="wsmenu-submenu">
										<li><a id="modal-546969" href="#modal-container-546969"
											role="button" class="btn update" data-toggle="modal">个人信息</a>
										</li>
										<li><a href="category.html">我的相册</a></li>
										<li><a href="us.do?op=outlogin">退出登录</a></li>
									</ul></li>

							</c:if>

							<c:if test="${sessionScope.user.uName==null}">

								<li><a href="login.jsp">登录</a></li>


							</c:if>


							<li class="hidden-xs" style="margin-left: 10px">
								<form class="navbar-form" role="search"
									action="Album.do?op=like" method="post">
									<div class="form-group">
										<input type="text" class="form-control" placeholder="搜索相册"
											name="photolike">
									</div>
									<button type="submit" class="btn btn-search">
										<i class="icon-search"></i> <br />搜索
									</button>
								</form>
							</li>
							<button type="button" class="btn btn-success ">
								<a href="#">发布相册</a>
							</button>


						</ul>

					</nav>

					<!--Menu HTML Code-->
				</div>
			</div>

		</div>

	</header>

	<div class="row" style="margin-top: 80px">

		<div class="eightcol last">

			<!-- Begin Form -->



			<form id="my-form" action="us.do" method="post">

				<h1>个 人 信 息</h1>
				<br>
				<input type="hidden" name = "op" value="updateUserInfo">
				<div>
					<label>昵称：</label><input class="form-control " id="uName"
						name="uName" type="text" value="${sessionScope.user.uName}"
						style="width: 200px" />
				</div>
				</br>
				<div>
					<label>手机号码:</label><input class="form-control " id="tel"
						name="tel" type="text" value="${sessionScope.user.uTel}"
						style="width: 200px" />
				</div>
				</br>
				<div>
					<label>出生日期:</label><input class="form-control " id="born"
						name="born" type="date" value="" style="width: 200px" />
				</div>
				</br>
				<div>
					<label style="margin-right: 10px">性别:</label> <input class=" "
						id="sex_b" name="sex" type="radio" value="男" />男 <input class=" "
						id="sex_g" name="sex" type="radio" value="女"
						style="margin-left: 15px" />女

				</div>
				<!-- <section name="修改密码">
          <div><label>原密码:</label><input id="pass" name="password" type="password"/></div>
          <div><label>新密码:</label><input id="pass" name="password" type="password"/></div>
          <div><label>确认密码:</label><input id="pass" name="password" type="password"/></div>
        </section> -->
				<div>
					<hr />
				</div>
				<div>
				
					<button id="" type="submit" class="btn btn-primary btn-sm">提交修改</button>
					
					<div style="color: red">
					<h5>个人信息修改后须重新登录!</h5>
					</div>
					<!-- <button id="reset" type="button">重置</button> -->
					<a  href="updatePwd.jsp" role="button"
						class="btn btn-primary btn-sm">修改密码</a>


				</div>

			</form>

			<!-- End Form -->

		</div>

	</div>


	<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
	<script type="text/javascript" src="js/jquery-ui.min.js"></script>
	<script type="text/javascript" src="js/jquery.idealforms.js"></script>
	<script type="text/javascript">
	var sex ='男';
	if(sex=='${sessionScope.user.uSex}'){
		  $("#sex_b").prop('checked','true');		
		
	}else{
		  $("#sex_g").prop('checked','true');		
		
	}
	
	
	
	</script>
	<div style="text-align: center;"></div>
</body>
</html>