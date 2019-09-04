<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
<h1>添加</h1><hr>
<div align="center">
	<form action="<%=request.getContextPath()%>/add.do" method="post">
		电影名:<input type="text" name="dname"><br><br>
		剧情介绍:<input type="text" name="jqjs"><br><br>
		导演:<input type="text" name="writer"><br><br>
		类型:<div class="whh">
			
		</div><br>
		发行时间<input type="date" name="fxdate"><br><br>
		<button>保存</button>
	</form>
</div>
</body>
<script type="text/javascript">
$(function() {
	$.get("<%=request.getContextPath()%>/duoxuan.do",function(hh){
		for(var i in hh){
			var h=$('<input type="checkbox" value="'+hh[i].fid+'" name="fids"><span>'+hh[i].fname+'</span>')
			$(".whh").append(h)
		}
	})
})	

	
</script>
</html>