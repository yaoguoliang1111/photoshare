<%@ page language="java" contentType="text/html; utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
        <title>Home</title>
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
                                <li class="visible-xs">
                                    <form class="navbar-form mob_search" role="search">
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="Search">
                                        </div>
                                        <button type="submit" class="btn btn-search">
                                            <i class="icon-search"></i>
                                        </button>
                                    </form>
                                </li>

                                <li class="active">
                                    <span class="wsmenu-click"></span>
                                    <a href="index.html">首页</a>
                                </li>
                                <li>
                                    <span class="wsmenu-click"></span>
                                    <a href="category.html">人像</a>
                                </li>
                                <li>
                                    <span class="wsmenu-click"></span>
                                    <a href="category.html">生活</a>
                                </li>
                                <li>
                                    <span class="wsmenu-click"></span>
                                    <a href="category.html">动物</a>
                                </li>
                                <li>
                                    <span class="wsmenu-click"></span>
                                    <a href="category.html">建筑</a>
                                </li>
                                <li>
                                    <span class="wsmenu-click"></span>
                                    <a href="category.html">风景</a>
                                </li>
                                <li>
                                    <span class="wsmenu-click"></span>
                                    <a href="category.html">运动</a>
                                </li>
                                <li>
                                    <span class="wsmenu-click"></span>
                                    <a href="">其它
        							<span class="arrow"></span>
                                </a>
                                    <ul class="wsmenu-submenu">
                                        <li>
                                            <a href="404.html">404 page</a>
                                        </li>
                                        <li>
                                            <a href="category.html">Category page</a>
                                        </li>
                                        <li>
                                            <a href="news.html">News page</a>
                                        </li>
                                        <li>
                                            <a href="search-result.html">Search result</a>
                                        </li>
                                        <li>
                                            <a href="full-width.html">Full width</a>
                                        </li>
                                    </ul>
                                </li>

                                <li>
                                    <span class="wsmenu-click"></span>
                                    <a href="">我的
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
                                            <a href="news.html">退出登录</a>
                                        </li>
                                    </ul>
                                </li> 


                                <li class="hidden-xs" style="margin-left: 10px">
                                    <form class="navbar-form" role="search">
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="搜索相册">
                                        </div>
                                        <button type="submit" class="btn btn-search">
                                            <i class="icon-search"></i>
                                            <br/>搜索
                                        </button>
                                    </form>
                                </li>
                                <button type="button" class="btn btn-success "><a href="#">发布相册</a></button>
                              

                            </ul>

                        </nav>

                        <!--Menu HTML Code-->
                    </div>
                </div>

            </div>

        </header>
        <!-- END header -->
        <!-- header slider -->
        <div class="slate_gray">
            <div class="container">
                <div class="row header_news_panel">
                    <!-- Tab panes -->
                    <div class="col-sm-8 tab-content tab-content_mob-p0">
                        <div role="tabpanel" class="tab-pane fade in active" id="home">
                            <img src="img/content/slide1.jpg" alt="main img" class="tab-pane__img">
                            <div class="header_news_text tab-pane__block">
                                <p class="tab-pane__category yel_line">人像</p>
                                <a class="tab-pane__title">做最真实的自己</a>
                                <p class="tab-pane__text">享受美好生活</p>
                            </div>
                        </div>
                        <div role="tabpanel" class="tab-pane fade" id="profile">
                            <img src="img/content/slide2.jpg" alt="main img" class="tab-pane__img">
                            <div class="header_news_text tab-pane__block">
                                <p class="tab-pane__category yel_line">People</p>
                                <a class="tab-pane__title">The Visions's Rainbow</a>
                                <p class="tab-pane__text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                            </div>
                        </div>
                        <div role="tabpanel" class="tab-pane fade" id="messages">
                            <img src="img/content/slide1.jpg" alt="main img" class="tab-pane__img">
                            <div class="header_news_text tab-pane__block">
                                <p class="tab-pane__category yel_line">People</p>
                                <a class="tab-pane__title">The Visions's Rainbow</a>
                                <p class="tab-pane__text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                            </div>
                        </div>
                        <div role="tabpanel" class="tab-pane fade" id="settings">
                            <img src="img/content/slide2.jpg" alt="main img" class="tab-pane__img">
                            <div class="header_news_text tab-pane__block">
                                <p class="tab-pane__category yel_line">People</p>
                                <a class="tab-pane__title">The Visions's Rainbow</a>
                                <p class="tab-pane__text">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                            </div>
                        </div>
                    </div>
                    <!-- END Tab panes -->
                    <!-- Nav tabs -->
                    <div class="col-sm-4 news-tabs">
                        <p class="news-tabs__title h2">分享美好瞬间</p>
                        <ul class="news-tabs__nav nav nav-tabs shadow_text" role="tablist">
                            <li role="presentation" class="active">
                                <a href="#home" role="tab" data-toggle="tab">
                                   汇聚全球高端视觉内容。
                                </a>
                            </li>
                            <li role="presentation">
                                <a href="#profile" role="tab" data-toggle="tab">
                                    XX，陪你做生活的设计师。
                                </a>
                            </li>
                            <li role="presentation">
                                <a href="#messages" role="tab" data-toggle="tab">
                                    XX,使用世界前沿的人工智能技术,为用户甄选海量的高清美图,用更流畅、更快捷、更精准的搜索体验,带你去发现多彩的世界。
                                </a>
                            </li>
                            <li role="presentation">
                                <a href="#settings" role="tab" data-toggle="tab">
                                    让任何一个用户都能轻松找到自己想要的素材。
                                </a>
                            </li>
                        </ul>
                    </div>
                    <!-- END Nav tabs -->
                </div>
            </div>
        </div>
        <!-- END header slider -->
        <!-- top news-->
        <section>
            <!-- top news -->
            <!-- title -->
            <div class="wrap wrap_white">
                <div class="container title">
                    <h1 class="title__h1 underscore">为您推荐</h1>
                </div>
            </div>
            <c:if test="${requestScope.page==null }">
						<jsp:forward page="Album.do?op=photopage"></jsp:forward>
			</c:if>
            <!-- END title 相册展示开始-->
            <div class="wrap wrap_gray pt20">
                <div class="container">
                <table class="table table-striped table-hover">
                    <tr class="row">
                    <td class="col-sm-3">
                        <div >
                            <div class="thumbnail thumbnail_small">
                                <a href="#" class="thumbnail__link">
                                    <img src="img/content/news2.jpg" height="153" width="270" alt="News">
                                </a>
                                <div class="caption thumbnail__caption">
                                    <div class="news caption__news">
                                        <p class="news__category yellow-line">物体</p>
                                        
                                            <p class="news__text">世界因你而精彩</p>
                                        
                                    </div>
                                    <div class="posted">
                                        <span class="posted__date">today, 12:11</span>
                                        <ul class="posted__icon">
                                            <li>
                                                <span>
                                                <i class="icon-comment-empty"></i>11
                                            </span>
                                            </li>
                                            <li>
                                                <span>
                                                <i >点赞</i>1.1k
                                            </span>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                        </td>
                        <td class="col-sm-3">
                        <div >
                            <div class="thumbnail thumbnail_small">
                                <a href="news.html" class="thumbnail__link">
                                    <img src="img/content/news3.jpg" height="153" width="270" alt="News">
                                </a>
                                <div class="caption thumbnail__caption">
                                    <div class="news caption__news">
                                        <p class="news__category yellow-line">数字</p>
                                        <a href="news.html" class="news__link">
                                            <p class="news__text">渺小而伟大</p>
                                        </a>
                                    </div>
                                    <div class="posted">
                                        <span class="posted__date">today, 19:30</span>
                                        <ul class="posted__icon">
                                            <li>
                                                <span>
                                                <i class="icon-comment-empty"></i>294
                                            </span>
                                            </li>
                                            <li>
                                                <span>
                                                <i class="icon-eye"></i>2.9k
                                            </span>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                        </td>
                        <td class="col-sm-3">
                        <div >
                            <div class="thumbnail thumbnail_small">
                                <a href="news.html" class="thumbnail__link">
                                    <img src="img/content/news4.jpg" height="153" width="270" alt="News">
                                </a>
                                <div class="caption thumbnail__caption">
                                    <div class="news caption__news">
                                        <i class="icon-play"></i>
                                        <p class="news__category yellow-line">人们</p>
                                        <a href="news.html" class="news__link">
                                            <p class="news__text">一群人的狂欢,一个人的孤单</p>
                                        </a>
                                    </div>
                                    <div class="posted">
                                        <span class="posted__date">today, 2:39</span>
                                        <ul class="posted__icon">
                                            <li>
                                                <span>
                                                <i class="icon-comment-empty"></i>9
                                            </span>
                                            </li>
                                            <li>
                                                <span>
                                                <i class="icon-eye"></i>1.3k
                                            </span>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                        </td>
                         <td class="col-sm-3">
                        <div >
                            <div class="thumbnail thumbnail_small">
                                <a href="news.html" class="thumbnail__link">
                                    <img src="img/content/news5.jpg" height="153" width="270" alt="News">
                                </a>
                                <div class="caption thumbnail__caption">
                                    <div class="news caption__news">
                                        <p class="news__category yellow-line">休闲</p>
                                        <a href="news.html" class="news__link">
                                            <p class="news__text">手gay真好玩</p>
                                        </a>
                                    </div>
                                    <div class="posted">
                                        <span class="posted__date">today, 14:34</span>
                                        <ul class="posted__icon">
                                            <li>
                                                <span>
                                                <i class="icon-comment-empty"></i>58
                                            </span>
                                            </li>
                                            <li>
                                                <span>
                                                <i class="icon-eye"></i>8.8k
                                            </span>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                        </td>
                   </tr>
                    <tr class="row">
                     <td class="col-sm-3">
                        <div >
                            <div class="thumbnail thumbnail_small">
                                <a href="news.html" class="thumbnail__link">
                                    <img src="img/content/news6.jpg" height="153" width="270" alt="News">
                                </a>
                                <div class="caption thumbnail__caption">
                                    <div class="news caption__news">
                                        <i class="icon-play"></i>
                                        <p class="news__category yellow-line">抽象</p>
                                        <a href="news.html" class="news__link">
                                            <p class="news__text">生活亦或是抽象</p>
                                        </a>
                                    </div>
                                    <div class="posted">
                                        <span class="posted__date">today, 12:37</span>
                                        <ul class="posted__icon">
                                            <li>
                                                <span>
                                                <i class="icon-comment-empty"></i>20
                                            </span>
                                            </li>
                                            <li>
                                                <span>
                                                <i class="icon-eye"></i>1.2k
                                            </span>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                        </td>
                        <td class="col-sm-3">
                        <div >
                            <div class="thumbnail thumbnail_small">
                                <a href="news.html" class="thumbnail__link">
                                    <img src="img/content/news7.jpg" height="153" width="270" alt="News">
                                </a>
                                <div class="caption thumbnail__caption">
                                    <div class="news caption__news">
                                        <p class="news__category yellow-line">金钱</p>
                                        <a href="news.html" class="news__link">
                                            <p class="news__text">可能是全世界最让人有安全感的东西</p>
                                        </a>
                                    </div>
                                    <div class="posted">
                                        <span class="posted__date">today, 11:30</span>
                                        <ul class="posted__icon">
                                            <li>
                                                <span>
                                                <i class="icon-comment-empty"></i>21
                                            </span>
                                            </li>
                                            <li>
                                                <span>
                                                <i class="icon-eye"></i>1.9k
                                            </span>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                        </td>
                        <td class="col-sm-3">
                        <div >
                            <div class="thumbnail thumbnail_small">
                                <a href="news.html" class="thumbnail__link">
                                    <img src="img/content/news8.jpg" height="153" width="270" alt="News">
                                </a>
                                <div class="caption thumbnail__caption">
                                    <div class="news caption__news">
                                        <i class="icon-play"></i>
                                        <p class="news__category yellow-line">运动</p>
                                        <a href="news.html" class="news__link">
                                            <p class="news__text">好好学习,天天运动</p>
                                        </a>
                                    </div>
                                    <div class="posted">
                                        <span class="posted__date">today, 10:36</span>
                                        <ul class="posted__icon">
                                            <li>
                                                <span>
                                                <i class="icon-comment-empty"></i>17
                                            </span>
                                            </li>
                                            <li>
                                                <span>
                                                <i class="icon-eye"></i>2.0k
                                            </span>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                        </td>
                        <td class="col-sm-3">
                        <div >
                            <div class="thumbnail thumbnail_small">
                                <a href="news.html" class="thumbnail__link">
                                    <img src="img/content/news9.jpg" height="153" width="270" alt="News">
                                </a>
                                <div class="caption thumbnail__caption">
                                    <div class="news caption__news">
                                        <p class="news__category yellow-line">工作</p>
                                        <a href="news.html" class="news__link">
                                            <p class="news__text">人总是要吃饭的嘛</p>
                                        </a>
                                    </div>
                                    <div class="posted">
                                        <span class="posted__date">today, 12:30</span>
                                        <ul class="posted__icon">
                                            <li>
                                                <span>
                                                <i class="icon-comment-empty"></i>29
                                            </span>
                                            </li>
                                            <li>
                                                <span>
                                                <i class="icon-eye"></i>2.3k
                                            </span>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                        </td>
                    </tr>
                    
                </table>
                <!-- btn load-->
                <!-- 分页的开始 -->
                <nav aria-label="Page navigation" class="text-center">
  <ul class="pagination">
    <li>
      <a href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    <li><a href="#">1</a></li>
    <li><a href="#">2</a></li>
    <li><a href="#">3</a></li>
    <li><a href="#">4</a></li>
    <li><a href="#">5</a></li>
    <li>
      <a href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>
<!-- 分页的结束 -->
                <!-- END btn load-->
            </div>
            <!-- /container-->
        </section>
        <!-- /top news -->

       
        <!-- Footer -->
        <footer class="footer slate_gray">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6">
                        <p class="copyright">Copyright &copy; 2018.Company name All rights reserved.</p>
                    </div>
                    <div class="col-sm-6">
                        <div class="social navbar-right">
                            <p class="social__text">We are in social networks</p>
                            <ul class="social__list">
                                <li class="social__item">
                                    <a class="facebook" href="#">
                                        <i class="icon-facebook"></i>
                                    </a>
                                </li>
                                <li class="social__item">
                                    <a class="twitter" href="#">
                                        <i class="icon-twitter"></i>
                                    </a>
                                </li>
                                <li class="social__item">
                                    <a class="gplus" href="#">
                                        <i class="icon-gplus"></i>
                                    </a>
                                </li>
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
    </body>
</html>
