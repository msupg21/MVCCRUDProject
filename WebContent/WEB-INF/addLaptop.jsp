<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" href="master.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Laptop to Inventory</title>
</head>
<body>
<h1>Add Laptop Product Form</h1>
<form action="addLaptop.do" method="POST">
		Stock Number:
		<input type="text" name="id" value="id*"/><br/>
		Laptop:
		<input type="text" name="name" value="name*"/><br/>
		Seller:
		<input type="text" name="seller" value="seller*"/><br/>
		Model Year:
		<input type="text" name="year" value="year*"/><br/>
		Price:
		<input type="text" name="price" value="price*"/><br/>
		RAM:
		<input type="text" name="ram" value="ram*"/><br/>
		Processor:
		<input type="text" name="processor" value="processor*"/><br/>
		Hard Drive
		<input type="text" name="hardDrive" value="hardDrive*"/><br/>
		
		<input type="submit" value="Add Laptop to Inventory" />
	</form>
	<form action="http://localhost:8080/MVCCRUDProject/" > 
  <button type="submit">Return to Main Menu</button>
	</form>
</body>
</html>