<%@ page contentType="text/html;charset=UTF-8" %>
<script src="<%=request.getContextPath()%>/resources/jquery/jquery-1.9.1.min.js" type="text/javascript"></script>
<link href="<%=request.getContextPath()%>/resources/bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet" />
<script src="<%=request.getContextPath()%>/resources/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<link href="<%=request.getContextPath()%>/resources/jquery-validation/1.11.1/jquery.validate.min.css" type="text/css" rel="stylesheet" />
<script src="<%=request.getContextPath()%>/resources/jquery-validation/1.11.1/jquery.validate.min.js" type="text/javascript"></script> 
<script src="<%=request.getContextPath()%>/resources/jquery-validation/1.11.1/jquery.validate.method.min.js" type="text/javascript"></script>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<c:set var="basePath" value="<%=basePath %>"></c:set>
<script>
        window.basePath = "<%=basePath%>";
    </script>