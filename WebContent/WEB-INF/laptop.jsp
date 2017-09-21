<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" href="laptop.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Laptop ${laptop.name}Result</title>
</head>
<body>
<h1>SEARCH RESULTS</h1>
	<c:choose>
		<c:when test="${! empty laptop}">
			<p class="mainList">
				${l.stockNum}<br> ${laptop.name} —
				YEAR: ${laptop.year} <br>Price $${laptop.price}<br> SPECS: Ram: ${laptop.ram}      Processor: ${laptop.processor}
				      HardDrive: ${laptop.hardDrive}<br>Seller: ${laptop.seller}
			</p>
		</c:when>
		<c:otherwise>
			<p>No Laptop found</p>
		</c:otherwise>
	</c:choose>
	<form action="http://localhost:8080/MVCCRUDProject/" > 
  <button type="submit">Return to  view full inventory</button>
	</form>
	 
</body>
</html>