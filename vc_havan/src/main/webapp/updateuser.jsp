<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:import url="include/header.jsp"><c:param name="title" value="Update User"/></c:import>
<head>

<style>
input{
margin-bottom:15px;
}
</style>
</head>
<div class="container mtb">
	<div class="row">
		<div class="col-lg-6 center">
		<form action="${pageContext.request.contextPath}/operation" method="post">
			<label>Employee Name: </label><input class="form-control" type="text" name="empName" value="${param.empName}"><br>
			<label>Employee Designation:</label> <input class="form-control" type="text" name="Designation" value="${param.Designation}"><br>
			<label>Employee Salary: </label><input class="form-control" type="number" name="Salary" value="${param.Salary}"><br>
			<input type="hidden" name="form" value="updateuserOperation"/>
			<input type="hidden" name="empID" value="${param.empID}"/>
			<input class="btn btn-primary" type="submit" value="Update User">
		</form>
			
		</div>
	</div>
</div>

<c:import url="include/footer.jsp"></c:import>