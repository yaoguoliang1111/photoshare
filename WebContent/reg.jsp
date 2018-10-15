<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>注册界面</title>

<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->

<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/animate.css">
<link rel="stylesheet" href="css/style.css">

<!-- Modernizr JS -->


</head>

<body class="style-2">

	<div class="container">
		<div class="row">
			<div class="col-md-4">


				<!-- 注册表单开始 -->
				<form action="us.do" class="fh5co-form animate-box"
					data-animate-effect="fadeInLeft">
					<h2>注册</h2>

					<input type="hidden" name="op" value="reg">

					<div class="form-group">
						<label for="name" class="sr-only">Name</label> <input type="text"
							class="form-control" id="username" name="username"
							placeholder="昵称" value="" autocomplete="off" required="required">

					</div>

					<div id="msg" style="color: red"></div>

					<div class="form-group">
						<label for="password" class="sr-only">Password</label> <input
							type="password" class="form-control" id="password"
							name="password" placeholder="密码" value="" autocomplete="off" required="required">
					</div>

					<div id="msg1" style="color: red"></div>

					<div class="form-group">
						<label for="re-password" class="sr-only">Re-type Password</label>
						<input type="password" class="form-control" id="re-password"
							name="re-password" placeholder="再次确认密码" value=""
							autocomplete="off" required="required">
					</div>

					<div id="msg2" style="color: red"></div>


					<div class="form-group">
						<label for="Tel" class="sr-only">Tel</label> <input type="text"
							class="form-control" id="tel" name="tel" value=""
							placeholder="手机号码" autocomplete="off" required="required">
					</div>

					<div id="msg3" style="color: red"></div>

					<div class="form-group">
						性别: <input type="radio" name="sex" value="男"
							style="margin-left: 20px">男 <input type="radio"
							name="sex" value="女" style="margin-left: 50px">女
					</div>
					
					<div class="form-group">
						<p>
							已有账号？去 <a href="login.jsp">登录</a>
						</p>
					</div>
					<div class="form-group text-center">
						<input type="submit" value="注册" class="btn btn-primary " >
					</div>
				</form>
				<!-- END Sign In Form -->


			</div>
		</div>

	</div>

	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Placeholder -->
	<script src="js/jquery.placeholder.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Main JS -->
	<script src="js/main.js"></script>

	<script type="text/javascript">
	
	
		
		$(function() {

			//用户名文本框失去焦点时
			$("#username").blur(
					function() {

						// Ajax请求
						$.get("regs.do?op=username", "username="
								+ $(this).val() + "&random=" + Math.random(),
								function(data, status) {

									//如果状态为成功，则打印出信息
									if (status == "success") {

										$("#msg").html(data);
										//console.log(data);		
									}
								});

					});

			// 密码文本框失去焦点时
			$("#password").blur(
					function() {

						// Ajax请求
						$.get("regs.do?op=password", "password="
								+ $(this).val() + "&random=" + Math.random(),
								function(data, status) {

									if (status == "success") {

										$("#msg1").html(data);

									}
								});

					});

			// 再次输入密码文本框失去焦点时
			$("#re-password").blur(
					function() {

						// Ajax请求

						$.get("regs.do?op=re-password", "re-password="
								+ $(this).val() + "&random=" + Math.random()
								+ "&password=" + $("#password").val(),
								function(data, status) {

									if (status == "success") {

										$("#msg2").html(data);
									}

								});

					});

			// 输入手机号码文本框失去焦点时
			$("#tel").blur(
					function() {
						
						// Ajax请求
						
						$.get("regs.do?op=tel", "tel=" + $(this).val()
								+ "&random=" + Math.random(), function(data,
								status) {

							if (status == "success") {

								$("#msg3").html(data);
							}
						});

					});
		});
		
	
	</script>

</body>
</html>

