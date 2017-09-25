<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" href="master.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bienvenidos a MACBOOK RESALE LAND!</title>
</head>
<body>
	<h1>WELCOME TO MACBOOK RESALE LAND</h1>
	<h2>Laptop Inventory</h2>
	<c:forEach var="l" items="${laptops}">
		<p class="mainList"><strong>Stock number#</strong> ${l.stockNum}<br>  ${l.name} — YEAR: ${l.year}
			$${l.price}</p>
		<br>
	</c:forEach>
	<h2>Search by stock number:</h2>
	<form action="getLaptop.do" method="POST">
		<center>
			Enter stock number:<br>To see laptop details<br> <input type="text" name="id" />
		</center>
	</form> 
 

	<center>
	<a href="viewAddLaptop.do">Add A Laptop</a><br>
	<a href="viewUpdateLaptop.jsp">Update A Laptop (JSP)</a><br>
	<a href="viewDeleteLaptop.jsp">Remove A Laptop (JSP)</a><br>
	</center>

</body>
</html>