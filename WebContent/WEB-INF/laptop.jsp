<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Laptop ${laptop.name}Result</title>
</head>
<body>
	<c:choose>
		<c:when test="${! empty laptop}">
			<ul>
				<li>${laptop.stockNum}</li>
				<li>${laptop.name}</li>
				<li>${laptop.year}</li>
				<li>${laptop.ram}</li>
				<li>${laptop.processor}</li>
				<li>${laptop.hardDrive}</li>
				<li>${laptop.price}</li>
				<li>${laptop.seller}</li>
			</ul>
		</c:when>
		<c:otherwise>
			<p>No Laptop found</p>
		</c:otherwise>
	</c:choose>

</body>
</html>