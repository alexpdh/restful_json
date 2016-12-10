<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>部门列表</title>
<%@include file="common/head.jsp"%>
</head>
<body>
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading text-center">
				<h2>部门列表</h2>
			</div>
			<div class="panel-body">
				<table class="table table-hover">
					<thead>
						<tr>
							<td>部门ID</td>
							<td>部门名字</td>
							<td>部门所在地</td>
							<td>部门经理</td>
							<td>操作</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="departs" items="${departlist}">
							<tr>
								<td>${departs.departId}</td>
								<td>${departs.departName}</td>
								<td>${departs.location}</td>
								<td>${departs.manager}</td>
								<td><button class="btn btn-info" id="queryDeatil" onclick="rest.queryDeatil(${departs.departId});">查看</button></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript" src="http://apps.bdimg.com/libs/jquery.cookie/1.4.1/jquery.cookie.js"></script>
<script type="text/javascript" src="<%=path%>/resource/script/handler.js"></script>
<script type="text/javascript">
	$(function(){
		rest.departs.init({});
	})
</script>
</html>