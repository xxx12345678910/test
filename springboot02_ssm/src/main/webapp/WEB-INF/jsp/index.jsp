<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>学号</td>
			<td>姓名</td>
			<td>性别</td>
		</tr>
		<c:forEach items="${studentList }" var="stu">
			<tr>
				<td>${stu.stu_id }</td>
				<td>${stu.stu_name }</td>
				<td>${stu.sex }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>