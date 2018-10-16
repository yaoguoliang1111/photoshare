<%@ page language="java" pageEncoding="UTF-8"%>


<!DOCTYPE html>

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>登录界面</title>

<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->


<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/animate.css">
<link rel="stylesheet" href="css/style.css">




</head>
<body class="style-2">

<%
		String username = "";
		String password = "";
		Cookie[] c = request.getCookies();
		if (c != null) {
			for (int i = 0; i < c.length; i++) {
				if ("username".equals(c[i].getName())) {
					username = c[i].getValue();
				} else if ("password".equals(c[i].getName())) {
					password = c[i].getValue();
				}
			}
		} else {
			username = " ";
			password = " ";
		}
	%>



	<div class="container">

		<div class="row">
			<div class="col-md-4">


				<!-- 登录表单开始 -->
				<form action="us.do" class="fh5co-form animate-box"
					data-animate-effect="fadeInLeft" method="post">
					<h2>登录</h2>
					<input type="hidden" name="op" value="login">
					<div class="form-group">
						<label for="username" class="sr-only">Username</label> <input
							type="text" class="form-control" id="username" name="username"
							placeholder="昵称" autocomplete="off" value="<%=username%>">
					</div>

					<div class="form-group">
						<label for="password" class="sr-only">Password</label> <input
							type="password" class="form-control" id="password"
							name="password" placeholder="密码" autocomplete="off" value="<%=password%>" >
					</div>

					<div class="form-group">
						<div class="formControls">
							<!-- <input class="input-text size-L" type="text" placeholder="验证码"  value="" style="width:150px;">
								<img src="images/VerifyCode.aspx.png">
								<a id="kanbuq" href="javascript:;">看不清，换一张</a> -->
							<input type="text" name="verifyCode" class="form-control"
								placeholder="验证码"><br>                <img id="img"
								src="/photoshare/VerifyCodeServlet"> <a
								href="javascript:_change()">换一张</a>                    
						</div>
					</div>

					<div class="form-group">
						<label for="remember"><input type="checkbox" id="remember"
							name="remember" value="remember"> 记住密码</label>
					</div>
					<div class="form-group">
						<p>
							还没注册? <a href="reg.jsp">注册</a>
						</p>
					</div>
					<div class="form-group text-center">
						<input type="submit" value="登录" class="btn btn-primary">
					</div>
				</form>
				<!-- 登录表单结束 -->

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
		            function _change() {
			/**
			               *1.得到image图片
			               *2.修改其src为/test/VerifyCodeServlet 
			               */
			var imgEle = document.getElementById("img");
			imgEle.src = "/photoshare/VerifyCodeServlet?a="
					+ new Date().getTime();

		}
	</script>

</body>
</html>

