<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.etc.service.impl.AlbumServiceImpl"%>
<%@page import="com.etc.service.AlbumService"%>
<%@page import="com.etc.entity.AlbumComment"%>
<%@page import="com.etc.entity.Album"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<meta content="" name="description">
<meta content="" name="keywords">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="HandheldFriendly" content="true">
<meta content="telephone=no" name="format-detection">
<!-- favicon -->
<!-- <link rel="shortcut icon" type="image/png" href="favicon.png" /> -->
<!--[if (gt IE 9)|!(IE)]><!-->
<!-- custom CSS -->
<link href="css/main.css" rel="stylesheet" type="text/css" />
<!-- END custom CSS -->
<!--<![endif]-->
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
            <script src="http://cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
            <script src="http://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
<title>相册</title>
<style>
/* jssor slider arrow navigator skin 05 css */
/*
    .jssora05l                  (normal)
    .jssora05r                  (normal)
    .jssora05l:hover            (normal mouseover)
    .jssora05r:hover            (normal mouseover)
    .jssora05l.jssora05ldn      (mousedown)
    .jssora05r.jssora05rdn      (mousedown)
    .jssora05l.jssora05lds      (disabled)
    .jssora05r.jssora05rds      (disabled)
    */
.jssora05l, .jssora05r {
	display: block;
	position: absolute;
	/* size of arrow element */
	width: 40px;
	height: 40px;
	cursor: pointer;
	background: url('img/a17.png') no-repeat;
	overflow: hidden;
}

.jssora05l {
	background-position: -10px -40px;
}

.jssora05r {
	background-position: -70px -40px;
}

.jssora05l:hover {
	background-position: -130px -40px;
}

.jssora05r:hover {
	background-position: -190px -40px;
}

.jssora05l.jssora05ldn {
	background-position: -250px -40px;
}

.jssora05r.jssora05rdn {
	background-position: -310px -40px;
}

.jssora05l.jssora05lds {
	background-position: -10px -40px;
	opacity: .3;
	pointer-events: none;
}

.jssora05r.jssora05rds {
	background-position: -70px -40px;
	opacity: .3;
	pointer-events: none;
}
/* jssor slider thumbnail navigator skin 01 css */
/*.jssort01 .p            (normal).jssort01 .p:hover      (normal mouseover).jssort01 .p.pav        (active).jssort01 .p.pdn        (mousedown)*/
.jssort01 .p {
	position: absolute;
	top: 0;
	left: 0;
	width: 72px;
	height: 72px;
}

.jssort01 .t {
	position: absolute;
	top: 0;
	left: 0;
	width: 100%;
	height: 100%;
	border: none;
}

.jssort01 .w {
	position: absolute;
	top: 0px;
	left: 0px;
	width: 100%;
	height: 100%;
}

.jssort01 .c {
	position: absolute;
	top: 0px;
	left: 0px;
	width: 68px;
	height: 68px;
	border: #000 2px solid;
	box-sizing: content-box;
	background: url('img/t01.png') -800px -800px no-repeat;
	_background: none;
}

.jssort01 .pav .c {
	top: 2px;
	_top: 0px;
	left: 2px;
	_left: 0px;
	width: 68px;
	height: 68px;
	border: #000 0px solid;
	_border: #fff 2px solid;
	background-position: 50% 50%;
}

.jssort01 .p:hover .c {
	top: 0px;
	left: 0px;
	width: 70px;
	height: 70px;
	border: #fff 1px solid;
	background-position: 50% 50%;
}

.jssort01 .p.pdn .c {
	background-position: 50% 50%;
	width: 68px;
	height: 68px;
	border: #000 2px solid;
}

* html .jssort01 .c, * html .jssort01 .pdn .c, * html .jssort01 .pav .c
	{ /* ie quirks mode adjust */
	width /**/: 72px;
	height /**/: 72px;
}
</style>
</head>
<body>
<!-- Header -->
        <header id="header" class="header">
            <div class="wsmenucontent overlapblackbg"></div>
            <div class="wsmenuexpandermain slideRight">
                <a id="navToggle" class="animated-arrow slideLeft">
                    <span></span>
                </a>
            </div>
            <div class="header_down">
                <div class="container">
                    <div class="wrapper clearfix bigmegamenu">
                        <!--Main Menu HTML Code-->
                        <nav class="wsmenu slideLeft clearfix">
                            <ul class="mobile-sub wsmenu-list">
                                
                                <li class="active">
                                    <span class="wsmenu-click"></span>
                                    <a href="index.jsp" >首页</a>
                                </li>
                                <li>
                                    <span class="wsmenu-click"></span>
                                    <a href="Album.do?op=altype&tId=1">人像</a>
                                </li>
                                <li>
                                    <span class="wsmenu-click"></span>
                                    <a href="Album.do?op=altype&tId=2">生活</a>
                                </li>
                                <li>
                                    <span class="wsmenu-click"></span>
                                    <a href="Album.do?op=altype&tId=3">动物</a>
                                </li>
                                <li>
                                    <span class="wsmenu-click"></span>
                                    <a href="Album.do?op=altype&tId=4">建筑</a>
                                </li>
                                <li>
                                    <span class="wsmenu-click"></span>
                                    <a href="Album.do?op=altype&tId=5">风景</a>
                                </li>
                                <li>
                                    <span class="wsmenu-click"></span>
                                    <a href="Album.do?op=altype&tId=6">运动</a>
                                </li>
                                <li>
                                    <span class="wsmenu-click"></span>
                                    <a href="">全部
        							<span class="arrow"></span>
                                </a>
                                    <ul class="wsmenu-submenu" id="albumstyle">
                                        
                                    </ul>
                                </li>
                                
                                
                               
                                
                                <c:if test="${sessionScope.user.uName==null}">
                                
                                 	<li>
                                       <a href="login.jsp">登录</a>
                                 	</li>
                                
								</c:if>


                                <li class="hidden-xs" style="margin-left: 10px">
                                    <form class="navbar-form" role="search" action="Album.do?op=like"method="post">
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="搜索相册" name="photolike">
                                        </div>
                                        <button type="submit" class="btn btn-search">
                                            <i class="icon-search"></i>
                                            <br/>搜索
                                        </button>
                                    </form>
                                </li>
							 </ul>

                        </nav>

                        <!--Menu HTML Code-->
                    </div>
                </div>

            </div>

        </header>

	<!-- header slider -->
	<div id="jssor_1"
		style="position: relative; margin: 0 auto; top: 20px; left: 0px; width: 800px; height: 456px; overflow: hidden; visibility: hidden; background-color: #24262e;">
		<!-- Loading Screen -->
		<div data-u="loading" style="position: absolute; top: 0px; left: 0px;">
			<div
				style="filter: alpha(opacity = 70); opacity: 0.7; position: absolute; display: block; top: 0px; left: 0px; width: 100%; height: 100%;"></div>
			<div
				style="position: absolute; display: block; background: url('img/loading.gif') no-repeat center center; top: 0px; left: 0px; width: 100%; height: 100%;"></div>
		</div>
		<div data-u="slides" style="cursor: default; position: relative; top: 0px; left: 0px; width: 800px; height: 356px; overflow: hidden;">
			<%
			
			List<Album> list = (List<Album>) request.getAttribute("list");
								
			for (Album a : list) {
				
			%>
			<div data-p="144.50">
				<img data-u="image" src="<%=a.getpUrl()%>" /> 
				<img data-u="thumb" src="<%=a.getpUrl()%>" />
			</div>

			<%
				}
			%>
			
			<a data-u="any" href="http://www.jssor.com" style="display: none">Image
				Gallery</a>
		</div>
		<!-- Thumbnail Navigator -->
		<div data-u="thumbnavigator" class="jssort01"
			style="position: absolute; left: 0px; bottom: 0px; width: 800px; height: 100px;"
			data-autocenter="1">
			<!-- Thumbnail Item Skin Begin -->
			<div data-u="slides" style="cursor: default;">
				<div data-u="prototype" class="p">
					<div class="w">
						<div data-u="thumbnailtemplate" class="t"></div>
					</div>
					<div class="c"></div>
				</div>
			</div>
			<!-- Thumbnail Item Skin End -->
		</div>
		<!-- Arrow Navigator -->
		<span data-u="arrowleft" class="jssora05l"
			style="top: 158px; left: 8px; width: 40px; height: 40px;"></span> <span
			data-u="arrowright" class="jssora05r"
			style="top: 158px; right: 8px; width: 40px; height: 40px;"></span>
	</div>

	<div class="wrapper">
		<article class="container articles">
		<div class="row">


			<div class="col-sm-9 col-md-8 col-lg-6 comments">
				<p class="comments__title">评论</p>
				
					<%
			
			List<AlbumComment> listc = (List<AlbumComment>) request.getAttribute("listc");
								
			for (AlbumComment c : listc) {
				
				%>
				
				<div class="comments__media">
					<div class="media-middle">
						<i class="media-object"
							style="background-image: url('img/content/comment.png')"></i>
						<div class="comm_info">
							<h4 class="media-heading"><%=c.getuName()%></h4>
							<span class="time"><%=c.getcDate()%></span>
						</div>
					</div>
					<p class="media-body"><%=c.getcContent()%>.</p>
				</div>
				<div>
				<%
					}
				%> 
				<br/>
				<br/>

				<div class="comments__form">
					<form action="ai.do?op=addComment" method="POST" >
						
						<div class="form-group">
						<input type="hidden" name="uId" id="uId" value=${sessionScope.user.uId}/>
						<input type="hidden" name="aId" id="aId" value=<%=request.getAttribute("aId")%>/>
							<textarea name="text" id="input" class="form-control" rows="7"
								required="required"></textarea>
						</div>
						<button type="submit" class="btn btn-comment">发送</button>
					</form>
				</div>
			</div>
		</div>
		</article>
	</div>
	<!-- Footer -->
	<footer class="footer slate_gray">
	<div class="container">
		<div class="row">
			<div class="col-sm-6">
				<p class="copyright">Copyright &copy; 2018.Company name All
					rights reserved.</p>
			</div>
			<div class="col-sm-6">
				<div class="social navbar-right">
					<p class="social__text">We are in social networks</p>
					<ul class="social__list">
						<li class="social__item"><a class="facebook" href="#"> <i
								class="icon-facebook"></i>
						</a></li>
						<li class="social__item"><a class="twitter" href="#"> <i
								class="icon-twitter"></i>
						</a></li>
						<li class="social__item"><a class="gplus" href="#"> <i
								class="icon-gplus"></i>
						</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	</footer>
	<!-- END Footer -->
	<!-- All JavaScript libraries -->
	<script src="http://cdn.bootcss.com/jquery/3.1.1/jquery.min.js"></script>

	<script src="js/bootstrap.min.js"></script>
	<!-- Custom JavaScript -->
	<script src="js/main.js"></script>
	<script src="js/jssor.slider-21.1.6.mini.js" type="text/javascript"></script>
	<script type="text/javascript">
		jQuery(document).ready(function($) {

			var jssor_1_SlideshowTransitions = [ {
				$Duration : 1200,
				x : 0.3,
				$During : {
					$Left : [ 0.3, 0.7 ]
				},
				$Easing : {
					$Left : $Jease$.$InCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			}, {
				$Duration : 1200,
				x : -0.3,
				$SlideOut : true,
				$Easing : {
					$Left : $Jease$.$InCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			}, {
				$Duration : 1200,
				x : -0.3,
				$During : {
					$Left : [ 0.3, 0.7 ]
				},
				$Easing : {
					$Left : $Jease$.$InCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			}, {
				$Duration : 1200,
				x : 0.3,
				$SlideOut : true,
				$Easing : {
					$Left : $Jease$.$InCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			}, {
				$Duration : 1200,
				y : 0.3,
				$During : {
					$Top : [ 0.3, 0.7 ]
				},
				$Easing : {
					$Top : $Jease$.$InCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			}, {
				$Duration : 1200,
				y : -0.3,
				$SlideOut : true,
				$Easing : {
					$Top : $Jease$.$InCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			}, {
				$Duration : 1200,
				y : -0.3,
				$During : {
					$Top : [ 0.3, 0.7 ]
				},
				$Easing : {
					$Top : $Jease$.$InCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			}, {
				$Duration : 1200,
				y : 0.3,
				$SlideOut : true,
				$Easing : {
					$Top : $Jease$.$InCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			}, {
				$Duration : 1200,
				x : 0.3,
				$Cols : 2,
				$During : {
					$Left : [ 0.3, 0.7 ]
				},
				$ChessMode : {
					$Column : 3
				},
				$Easing : {
					$Left : $Jease$.$InCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			}, {
				$Duration : 1200,
				x : 0.3,
				$Cols : 2,
				$SlideOut : true,
				$ChessMode : {
					$Column : 3
				},
				$Easing : {
					$Left : $Jease$.$InCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			}, {
				$Duration : 1200,
				y : 0.3,
				$Rows : 2,
				$During : {
					$Top : [ 0.3, 0.7 ]
				},
				$ChessMode : {
					$Row : 12
				},
				$Easing : {
					$Top : $Jease$.$InCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			}, {
				$Duration : 1200,
				y : 0.3,
				$Rows : 2,
				$SlideOut : true,
				$ChessMode : {
					$Row : 12
				},
				$Easing : {
					$Top : $Jease$.$InCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			}, {
				$Duration : 1200,
				y : 0.3,
				$Cols : 2,
				$During : {
					$Top : [ 0.3, 0.7 ]
				},
				$ChessMode : {
					$Column : 12
				},
				$Easing : {
					$Top : $Jease$.$InCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			}, {
				$Duration : 1200,
				y : -0.3,
				$Cols : 2,
				$SlideOut : true,
				$ChessMode : {
					$Column : 12
				},
				$Easing : {
					$Top : $Jease$.$InCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			}, {
				$Duration : 1200,
				x : 0.3,
				$Rows : 2,
				$During : {
					$Left : [ 0.3, 0.7 ]
				},
				$ChessMode : {
					$Row : 3
				},
				$Easing : {
					$Left : $Jease$.$InCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			}, {
				$Duration : 1200,
				x : -0.3,
				$Rows : 2,
				$SlideOut : true,
				$ChessMode : {
					$Row : 3
				},
				$Easing : {
					$Left : $Jease$.$InCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			}, {
				$Duration : 1200,
				x : 0.3,
				y : 0.3,
				$Cols : 2,
				$Rows : 2,
				$During : {
					$Left : [ 0.3, 0.7 ],
					$Top : [ 0.3, 0.7 ]
				},
				$ChessMode : {
					$Column : 3,
					$Row : 12
				},
				$Easing : {
					$Left : $Jease$.$InCubic,
					$Top : $Jease$.$InCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			}, {
				$Duration : 1200,
				x : 0.3,
				y : 0.3,
				$Cols : 2,
				$Rows : 2,
				$During : {
					$Left : [ 0.3, 0.7 ],
					$Top : [ 0.3, 0.7 ]
				},
				$SlideOut : true,
				$ChessMode : {
					$Column : 3,
					$Row : 12
				},
				$Easing : {
					$Left : $Jease$.$InCubic,
					$Top : $Jease$.$InCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			}, {
				$Duration : 1200,
				$Delay : 20,
				$Clip : 3,
				$Assembly : 260,
				$Easing : {
					$Clip : $Jease$.$InCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			}, {
				$Duration : 1200,
				$Delay : 20,
				$Clip : 3,
				$SlideOut : true,
				$Assembly : 260,
				$Easing : {
					$Clip : $Jease$.$OutCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			}, {
				$Duration : 1200,
				$Delay : 20,
				$Clip : 12,
				$Assembly : 260,
				$Easing : {
					$Clip : $Jease$.$InCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			}, {
				$Duration : 1200,
				$Delay : 20,
				$Clip : 12,
				$SlideOut : true,
				$Assembly : 260,
				$Easing : {
					$Clip : $Jease$.$OutCubic,
					$Opacity : $Jease$.$Linear
				},
				$Opacity : 2
			} ];

			var jssor_1_options = {
				$AutoPlay : true,
				$SlideshowOptions : {
					$Class : $JssorSlideshowRunner$,
					$Transitions : jssor_1_SlideshowTransitions,
					$TransitionsOrder : 1
				},
				$ArrowNavigatorOptions : {
					$Class : $JssorArrowNavigator$
				},
				$ThumbnailNavigatorOptions : {
					$Class : $JssorThumbnailNavigator$,
					$Cols : 10,
					$SpacingX : 8,
					$SpacingY : 8,
					$Align : 360
				}
			};

			var jssor_1_slider = new $JssorSlider$("jssor_1", jssor_1_options);

			/*responsive code begin*/
			/*you can remove responsive code if you don't want the slider scales while window resizing*/
			function ScaleSlider() {
				var refSize = jssor_1_slider.$Elmt.parentNode.clientWidth;
				if (refSize) {
					refSize = Math.min(refSize, 800);
					jssor_1_slider.$ScaleWidth(refSize);
				} else {
					window.setTimeout(ScaleSlider, 30);
				}
			}
			ScaleSlider();
			$(window).bind("load", ScaleSlider);
			$(window).bind("resize", ScaleSlider);
			$(window).bind("orientationchange", ScaleSlider);
			/*responsive code end*/
		});
	</script>

	
	<!-- ajax的相册类型显示 -->
	<script type="text/javascript">
			$(function(){
				$.get("Album.do?op=load",function(data){
					var arry=JSON.parse(data);
					$.each(arry, function(i,d) {
						console.log(d.tName);
						//$("#albumstyle").append("<li></li>");
						//$("#albumstyle").find("li").eq(i).append("<a href='4'>"+d.tName+"</a>");
						$("#albumstyle").append("<li><a href='Album.do?op=altype&tId="+d.tId+"'>"+d.tName+"</a></li>");
					});
				});
				
			});
		</script>
</body>
</html>

