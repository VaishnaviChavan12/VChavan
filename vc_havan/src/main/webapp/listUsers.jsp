<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List" %>
<%@ page import="org.vchavan.entity.User" %>
<%@ page import="org.vchavan.model.UsersModel" %>

<c:import url="include/header.jsp">
	<c:param name="title" value="List Users Page"/>
</c:import>
<div class="container mtb">
	<div class="row">
		<div class="col-lg-6">
			<strong>Listing users</strong>
			<hr/>
			<table class="table table-hover" border="1">
				<tr>
					<th>Employee ID </th>
					<th>Employee Name </th>
					<th>Designation </th>
					<th>Salary </th>
					<th>Operation </th>
				</tr>
				<%! String deleteUrl; %>
			<%

				@SuppressWarnings("unchecked")
				List<org.vchavan.entity.User> listUsers = (List<org.vchavan.entity.User>)request.getAttribute("listUsers");
				String updateUrl;
				for(int i=0;i<listUsers.size(); i++){
					out.print("<tr>");
					out.print("<td>"+listUsers.get(i).getempID()+"</td>");
					out.print("<td>"+listUsers.get(i).getempName()+"</td>");
					out.print("<td>"+listUsers.get(i).getDesignation()+"</td>");
					out.print("<td>"+listUsers.get(i).getSalary()+"</td>");
					updateUrl=request.getContextPath()+"/operation?page=updateUser"+
					               "&empID="+listUsers.get(i).getempID()+
					               "&empName="+listUsers.get(i).getempName()+
					                "&Designation="+listUsers.get(i).getDesignation()+
					                "&Salary="+listUsers.get(i).getSalary();
					deleteUrl=request.getContextPath()+"/operation?page=deleteUser"+
				               "&empID="+listUsers.get(i).getempID();
					updateUrl=updateUrl.replace(" ", "-");
					out.print("<td><a href="+updateUrl+"> Update | </a>");
				
			%>
			<a href="<%=deleteUrl%>" onclick="if(!confirm('Are you sure to delete the user')) return false">Delete</a></td>
			</tr>
			<% } %>
			</table>
		</div>
	</div>
</div>
<c:import url="include/footer.jsp"></c:import>