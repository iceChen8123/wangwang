<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<%@include file="/WEB-INF/views/include.jsp"%>
<head>
	<title>汪汪学测试</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<hr>

<a href="formstudy">表单发展历史</a>

<hr>

<ul>
<li><a href="department/get">获取所有部门</a>
	<button type="button" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#departmentModal">部门表</button>
</li>
<li><a href="employer/get">获取所有雇员</a>
	<button type="button" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#employerModal">雇员表</button>
</li>
<li><a href="employerinfo/get">获取所有雇员信息</a>
	<button type="button" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#employerinfoModal">雇员信息表</button>
</li>
</ul>

<div class="modal fade" id="departmentModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
      	<h4 class="modal-title" id="myModalLabel">部门表</h4>
      </div>
      <div class="modal-body">
		<table class="table table-hover">
			<thead>
				<tr><th>部门号</th>
				<th>部门名称<th></tr>
			</thead>
			<tbody id="departmenttable">
			</tbody>
		</table>
	  </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>

<div class="modal fade" id="employerModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
      	<h4 class="modal-title" id="myModalLabel">雇员表</h4>
      </div>
      <div class="modal-body">
		<table class="table table-hover table-bordered">
			<thead >
				<tr>
					<th>雇员号</th>
					<th>雇员信息id</th>
					<th>雇员名字</th>
					<th>英文名</th>
					<th>部门号</th>
					<th>月薪</th>
					<th>薪水月数</th>
				</tr>
			</thead>
			<tbody id="employertable" align="right">
			</tbody>
		</table>
	  </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>

<div class="modal fade" id="employerinfoModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
      	<h4 class="modal-title" id="myModalLabel">部门表</h4>
      </div>
      <div class="modal-body">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>雇员信息id</th>
					<th>雇员名字</th>
					<th>年龄</th>
					<th>性别</th>
					<th>地址(省份)</th>
				</tr>
			</thead>
			<tbody id="employerinfotable">
			</tbody>
		</table>
		</div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>


<div id="ajaxinfo">
</div>

<script type="text/javascript">
function getD(){
	$.ajax({  
         type:'get',      
         url:'department/get',  
         dataType:'json',  
         success:function(data){ 
        	 for(i in data){
        		 $('#departmenttable').append('<tr><td>'+data[i].id+'</td><td>'+data[i].dname+'</td></tr>');
        	 }
         }  
     });  
}
getD();

function getE(){
	$.ajax({  
         type:'get',      
         url:'employer/get',  
         dataType:'json',  
         success:function(data){ 
        	 for(i in data){
        		 $('#employertable').append('<tr>'
        				 +'<td>'+data[i].id+'</td>'
        				 +'<td>'+data[i].userId+'</td>'
        				 +'<td>'+data[i].userName+'</td>'
        				 +'<td>'+data[i].engName+'</td>'
        				 +'<td>'+data[i].departmentId+'</td>'
        				 +'<td>'+data[i].salary+'</td>'
        				 +'<td>'+data[i].months+'</td>'
        				 +'</tr>');
        	 }
         }  
     });  
}
getE();

function getEI(){
	$.ajax({  
         type:'get',      
         url:'employerinfo/get',  
         dataType:'json',  
         success:function(data){ 
        	 for(i in data){
        		 $('#employerinfotable').append('<tr>'
        				 +'<td>'+data[i].id+'</td>'
        				 +'<td>'+data[i].userName+'</td>'
        				 +'<td>'+data[i].age+'</td>'
        				 +'<td>'+ (data[i].sex=='0' ? '女' : '男') +'</td>'
        				 +'<td>'+data[i].address+'</td>'
        				 +'</tr>');
        	 }
         }  
     });  
}
getEI();

</script>

</body>
</html>
