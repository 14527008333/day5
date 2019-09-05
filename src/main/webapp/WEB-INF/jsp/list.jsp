<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<h1>列表</h1><hr>
<div align="center">
	<table border="1">
		<thead>
			<tr>
				<th colspan="7">
					<form action="<%=request.getContextPath()%>/list.do" method="post">
						<input type="hidden" name="page">						
						电影名:<input type="text" name="mh" value="${mh }">
						<button>查询</button>
						<input type="button" name="plsc" value="批量删除">
					</form>
				</th>
			</tr>
			<tr>
				<th>
					<input type="checkbox" name="quan">全选
				</th>
				<th>电影名</th>
				<th>剧情介绍</th>
				<th>导演</th>
				<th>发行日期</th>
				<th>类型</th>
				<th>操作
				<a href="<%=request.getContextPath()%>/toadd.do"><button>添加</button></a>
				</th>
			</tr>
		</thead>
		
		<tbody>
		<c:forEach items="${list }" var="d">
			<tr>
				<td>
					<input type="checkbox" name="box" value="${d.did }">
				</td>
				<td>${d.dname }</td>
				<td>${d.jqjs }</td>
				<td>${d.writer }</td>
				<td>${d.fxdate }</td>
				<td>${d.ffname }</td>
				<td>
					<button onclick="toupdate(${d.did })">修改</button>
					<button onclick="deletehh(${d.did })">删除</button>
				</td>
			</tr>
		</c:forEach>
			<tr align="center">
				<td colspan="7">
					<button onclick="">首页</button>
					<button onclick="fy(${pi.isIsFirstPage()?1:pi.getPrePage()})">上一页</button>
					<button onclick="fy(${pi.isIsLastPage()?pi.getPages():pi.getNextPage()})">下一页</button>
					<button onclick="fy(${pi.getPages()})">尾页</button>
				</td>
			</tr>
		</tbody>
	</table>
</div>
</body>
<script type="text/javascript">
function fy(page) {
	$("[name=page]").val(page);
	$("form").submit();
}
$("[name=quan]").click(function() {
	if($(this).attr("checked")){
		$("[name=box]").attr("checked",true)
	}else{
		$("[name=box]").attr("checked",false)
	}
})
$("[name=plsc]").click(function() {
	var dids=[]
	$("[name=box]:checked").each(function() {
		dids.push($(this).val())
	})
	if(dids==''){
		alert("至少选择一条数据")
	}else{
		alert("删除"+dids)
		location.href="<%=request.getContextPath()%>/delete.do?dids="+dids
	}
})
function deletehh(did) {
	alert("删除"+did)
	location.href="<%=request.getContextPath()%>/delete.do?dids="+did
}
function toupdate(did) {
	location.href="<%=request.getContextPath()%>/toupdate.do?did="+did
}
</script>
</html>