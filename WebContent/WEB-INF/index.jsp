<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Laptop Inventory</h2>
	<c:forEach var="l" items="${laptops}">${l.stockNum} ${l.name}<br></c:forEach>
	<h2>Search by stock number:</h2>
	<form action="getLaptop.do" method="GET">
		Enter stock number: <input type="text" name="id" />
	</form>

</body>
</html>