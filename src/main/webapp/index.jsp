<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<html>
<body>
	<h2>How to fetch data from database in Spring MVC</h2>


	<table border="1">
<tr>
	
		<th>Name</th>
		<th>Designation</th>
		<th>Department</th>
		<th>Salary</th>
		<th>Location</th>
</tr>
		<c:forEach var="emp" items="${listEmp}" varStatus="status">
			<tr>
				<td>${emp.name}</td>
				<td>${emp.designation}</td>
				<td>${emp.dept}</td>
				<td>${emp.salary}</td>
				<td>${emp.location}</td>

			</tr>
		</c:forEach>
	</table>

</body>
</html>