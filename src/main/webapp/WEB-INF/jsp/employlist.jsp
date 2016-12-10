<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@include file="common/tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>员工列表</title>
<%@include file="common/head.jsp"%>
</head>
<body>
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading text-center">
				<h2>用户列表</h2>
			</div>
			<div class="panel-body">
				<table class="table table-hover">
					<thead>
						<tr>
							<td>员工ID</td>
							<td>员工名字</td>
							<td>所在部门ID</td>
							<td>所在部门</td>
							<td>性别</td>
							<td>生日</td>
							<td>职位名称</td>
							<td>职位等级</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="employs" items="${employlist}">
							<tr>
								<td>${employs.empId}</td>
								<td>${employs.empName}</td>
								<td>${employs.departId}</td>
								<td>${employs.departName}</td>
								<td>
									<c:choose>
										<c:when test="${employs.gender== 'male'}">男</c:when>
										<c:otherwise>女</c:otherwise>
									</c:choose>
								</td>
								<td><fmt:formatDate value="${employs.birthDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
								<td>${employs.title}</td>
								<td>${employs.grade}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>
		</div>
	</div>
</body>
</html>