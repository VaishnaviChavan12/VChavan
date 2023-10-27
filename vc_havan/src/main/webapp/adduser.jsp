<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:import url="include/header.jsp"><c:param name="title" value="Add User"/></c:import>
<head>

<style>
input{
margin-bottom:15px;
}
</style>
</head>
<div class="container mtb">
	<div class="row">
		<div class="container col-lg-6 center">
		<form action="${pageContext.request.contextPath}/operation" method="post">
			<label>Employee Name: </label><input class="form-control" type="text" name="empName" required="required"><br>
			<label>Employee Designation:</label> <input class="form-control" type="text" name="Designation" required="required"><br>
			<label>Employee Salary: </label><input class="form-control" type="number" name="Salary" required="required"><br>
			<input type="hidden" name="form" value="adduserOperation"/>
			<input class="btn btn-primary" type="submit" value="Add User">
		</form>
			
		</div>
	</div>
</div>

<c:import url="include/footer.jsp"></c:import>