<%@ page language="java" contentType="text/html; utf-8"
    pageEncoding="utf-8"%>
<%@ page autoFlush="true" buffer="1094kb"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html lang="zxx">
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
        <title></title>
    </head>
    <body class="page">
        <div class="wrapper-sticky-footer">
            <div class="content-sticky">
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
                                
                                
                                <c:if test="${sessionScope.user.uName!=mull}">

                                <li>
                                    <span class="wsmenu-click"></span>
                                    <a href="">${sessionScope.user.uName}
                                    <span class="arrow"></span>
                                </a>
                                    <ul class="wsmenu-submenu">
                                        <li>
                                            <a href="404.html">个人信息</a>
                                        </li>
                                        <li>
                                            <a href="category.html">我的相册</a>
                                        </li>
                                        <li>
                                            <a href="us.do?op=outlogin">退出登录</a>
                                        </li>
                                    </ul>
                                </li>
                                
                                </c:if> 
                                
                                <c:if test="${sessionScope.user.uName==null}">
                                
                                 <li>
                                            <a href="login.jsp">登录</a>
                                        </li>
                                
                                
                                </c:if>


                                <li class="hidden-xs" style="margin-left: 10px">
                                    <form class="navbar-form" role="search" action="Album.do?op=like"
					method="post">
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="搜索相册" name="photolike"  >
                                        </div>
                                        <button type="submit" class="btn btn-search">
                                            <i class="icon-search"></i>
                                            <br/>搜索
                                        </button>
                                    </form>
                                </li>
                                <button type="button" class="btn btn-success ">发布相册</button>
                             

                            </ul>

                        </nav>

                        <!--Menu HTML Code-->
                    </div>
                </div>

            </div>

        </header>
        <section>
        <div class="wrap wrap_white">
                <div class="container title">
                    <h2 class="title__h1 underscore">相册展示</h2>
                </div>
                 </div>
                <!-- END header -->
                <!-- content-->
                <!-- END title 相册展示开始-->
                <div class="wrap wrap_gray pt20">
                    <div class="container">
                        <div class="row">
                          <!-- 判断在请求中是否存在-->
            <c:if test="${requestScope.pa==null }">
			<jsp:forward page="Album.do?op=altype"></jsp:forward>
			</c:if>
			<!-- 如果没有找到相关的记录页面显示没有找到相关记录 -->
			<c:if test="${fn:length(lista)==0 }">
			<h1 class="text-center">没有找到相关的记录</h1>
			</c:if>
			<!-- 显示第一行的图片相册-->
			<c:if test="${requestScope.lista!=null }">
			<!-- 遍历第一行的图片相册-->
			<c:forEach var="q" items="${requestScope.lista }" >
                            <div class="col-sm-3">
                                <div class="thumbnail thumbnail_small">
                                <a href="#" class="thumbnail__link">
                                    <img src="${q.pUrl}" height="153" width="270" alt="News">
                                </a>
                                <div class="caption thumbnail__caption">
                                    <div class="news caption__news">
                                        <p class="news__category yellow-line">${q.aTitle}</p>
                                        
                                            <p class="news__text">${q.aDescription}</p>
                                        
                                    </div>
                                    <div class="posted">
                                        <span class="posted__date">${q.createTime}</span>
                                        <ul class="posted__icon">
                                            <li>
                                                <span>
                                                <i class="icon-comment-empty"></i>${q.co}
                                            </span>
                                            </li>
                                            <li>
                                                <span>
                                                <i >点赞</i>${q.aLikes}
                                            </span>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            </div>
                              </c:forEach> 

                   </c:if>
                   <!-- 显示第二行的图片相册-->
                   <c:if test="${requestScope.listb!=null }">
                   <!-- 遍历第二行的图片相册-->
			<c:forEach var="q" items="${requestScope.listb }">
                            <div class="col-sm-3">
                                <div class="thumbnail thumbnail_small">
                                <a href="#" class="thumbnail__link">
                                    <img src="${q.pUrl}" height="153" width="270" alt="News">
                                </a>
                                <div class="caption thumbnail__caption">
                                    <div class="news caption__news">
                                        <p class="news__category yellow-line">${q.aTitle}</p>
                                        
                                            <p class="news__text">${q.aDescription}</p>
                                        
                                    </div>
                                    <div class="posted">
                                        <span class="posted__date">${q.createTime}</span>
                                        <ul class="posted__icon">
                                            <li>
                                                <span>
                                                <i class="icon-comment-empty"></i>${q.co}
                                            </span>
                                            </li>
                                            <li>
                                                <span>
                                                <i >点赞</i>${q.aLikes}
                                            </span>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            </div>
                              </c:forEach> 

                   </c:if>
                            
                </div>
                </div>
                <!-- END content-->
                <!-- 加入分页-->
                <nav aria-label="Page navigation" class="text-center">
  <ul class="pagination ">
    <li>
      <a href="javascript:prePage()" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    <c:forEach begin="1" end="${requestScope.pa.totalPage}" var="index">
    <c:if test="${requestScope.pa.page==index}">
    <li class="active"><a href="javascript:jumpPage(${index})">${index}</a></li>
    </c:if>
    <c:if test="${requestScope.pa.page!=index}">
     <li><a href="javascript:jumpPage(${index})">${index}</a></li>
    </c:if>
    </c:forEach> 
    <li>
      <a href="javascript:nextPage()" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>
<!-- 分页的结束 -->
                
            
           
            
        </div>
        </section>
        
        <!-- All JavaScript libraries -->
		<script src="http://cdn.bootcss.com/jquery/3.1.1/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<!-- Custom JavaScript -->
        <script src="js/main.js"></script>
        <!-- 分页的js代码 -->
        <script type="text/javascript">
	function prePage(){
		var page=1;
		if(${requestScope.pa.page}>1){
			
			page=${requestScope.pa.page}-1;
		}
		location.href="Album.do?op=altype&page="+page;
	}
	function nextPage(){
		var page=${requestScope.pa.totalPage}
		if(${requestScope.pa.page}<${requestScope.pa.totalPage}){
			page=${requestScope.pa.page}+1;
		}
		location.href="Album.do?op=altype&page="+page;
	}
	function jumpPage(page){
		location.href="Album.do?op=altype&page="+page;
	}
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

