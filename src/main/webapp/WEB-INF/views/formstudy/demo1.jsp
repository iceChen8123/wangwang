<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<%@include file="/WEB-INF/views/include.jsp"%>
<head>
	<title>提交表单(同步)</title>
</head>
<body>

<div class="row">
  <div class="col-md-4"></div>
  <div class="col-md-4">
  <hr>
	<form action="user/add/old" method="post" enctype="multipart/form-data">
	  <div class="form-group">
	    <label for="username">用户名</label>
	    <input class="form-control" name="userName" id="username" placeholder="请输入用户名">
	  </div>
	  <div class="form-group">
	    <label for="age">年龄</label>
	    <input class="form-control" name="age" id="age" placeholder="请输入年龄">
	  </div>
	  <div class="form-group">
	    <label for="sex">性别:&nbsp;</label>
		<label class="radio-inline">
		  <input type="radio" name="sex" id="sex" value="0">女
		</label>
	    <label class="radio-inline">
		  <input type="radio" name="sex" id="sex" value="1">男
		</label>
	  </div>
	  <div class="form-group">
	    <label for="address">地址</label>
	    <input class="form-control" name="address" id="address" placeholder="请输入地址">
	  </div>
	  <div class="form-group">
	    <label for="phone">电话</label>
	    <input class="form-control" name="phone" id="phone" placeholder="请输入电话">
	  </div>
	  <div class="form-group">
	    <label for="hobby">爱好:&nbsp;</label>
	    <label class="checkbox-inline">
		  <input type="checkbox" name="hobby" id="hobby" value="1">足球
		</label>
		<label class="checkbox-inline">
		  <input type="checkbox" name="hobby" id="hobby" value="2">画画
		</label>
		<label class="checkbox-inline">
		  <input type="checkbox" name="hobby" id="hobby" value="3">下棋
		</label>
	  </div>
	  <div class="form-group">
	    <label for="photo">上传照片</label>
	    <input type="file" name="photo" id="photo">
	  </div>
	  <hr>
	  <div class="form-group">
		<button type="submit" class="btn btn-primary">确认</button>
		<button type="reset" class="btn btn-primary">重置</button>
	  </div>
	</form>
	</div>
  <div class="col-md-4"></div>
</div>

<script type="text/javascript">

function list(){
	$.ajax({  
        url: basePath + 'user/list',
        type: "post",
        success: function(data){
			if (data.code == 1) { 
	          	
	          } else { 

	          }
        }
    });
}
list();
</script>

</body>
</html>
