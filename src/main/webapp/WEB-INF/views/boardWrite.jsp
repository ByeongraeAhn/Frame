<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
  <title>test</title>
  <link rel="stylesheet" href="resources/css/bootstrap.min.css">
  <link rel="stylesheet" href="resources/css/bootstrap-theme.min.css">
  <link rel="stylesheet" href="resources/css/blog.css">
  <style>
    .logout {
      position: fixed;
      top: 0;
      right: 10px;
      padding: 10px;
      color: #fff;
      text-decoration: underline;
    }

    .logout a {
      color: #fff;
    }

    .logout a:visted {
      color: #fff;
    }

    .logout a:active {
      color: #fff;
    }
  </style>
</head>
<body>
  <div class="blog-masthead">
    <div class="container">
      <nav class="blog-nav">
        <a class="blog-nav-item active" href="#">Home</a>
      </nav>
    </div>
    <div class="logout"><a href="#">Logout</a></div>
  </div>

  <div class="container">

    <div class="blog-header">
      <h1 class="blog-title">MENU</h1>
    </div>

    <div class="row">

      <div class="col-sm-12 blog-main">

        <div class="blog-post">
          <h2 class="blog-post-title">메뉴 등록/수정</h2>
          <p class="blog-post-meta">메뉴를 등록 및 수정하는 페이지입니다.</a></p>
          <div class="input-group input-group-lg">
            <span class="input-group-addon" id="sizing-addon1"><i class="glyphicon glyphicon-tags"></i></span>
            <input type="text" class="form-control" placeholder="Menu 이름" aria-describedby="sizing-addon1">
          </div>
          <p></p>
          <div class="input-group input-group-lg">
            <span class="input-group-addon" id="sizing-addon1"><i class="glyphicon glyphicon-pencil"></i></span>
            <input type="text" class="form-control" placeholder="Menu 설명" aria-describedby="sizing-addon1">
          </div>
        </div>
        <!-- /.blog-post -->

        <div class="btn-group" role="group" style="float: right; margin-bottom: 20px;">
          <button type="button" class="btn btn-default">등록</button>
          <button type="button" class="btn btn-default">수정</button>
        </div>
      </div>
    </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->

  <footer class="blog-footer">
    <p>Blog template built for <a href="http://getbootstrap.com">Bootstrap</a> by <a href="https://twitter.com/mdo">@mdo</a>.</p>
    <p>
      <a href="#">Back to top</a>
    </p>
  </footer>
</body>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<script type="text/javascript">
  $(function() {
    console.log('haha');
  });
</script>

</html>
