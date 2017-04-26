<%@page import="edu.bigroi.sh.bean.Group"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Helper</title>
</head>
<body>

	<table>
		<thead>
			<tr>
				<td>Group Name</td>
				<td>Average mark</td>
				<td></td>
				<td></td>
			</tr>
		</thead>
		<tbody>
			<%
				List<Group> groups = (List<Group>) request.getAttribute("List of groups");
				for (int i = 0; i < groups.size(); i++) {
					Group group = groups.get(i);
			%>
			<tr>
				<td><%=group.getNumber()%></td>
				<td><%=group.getAvgMark()%></td>
				<td><form action="GroupModify.do" method="get">
				<input type="hidden" name="id" value="<%=group.getNumber()%>">
						<input type="submit" value="Modify">
					</form></td>
				<td><form action="GroupDelete.do" method="get">
						<input type="hidden" name="id" value="<%=group.getNumber()%>">
						<input type="submit" value="Delete">
					</form></td>
			</tr>

			<%
				}
			%>
			


		</tbody>
	</table>
	<br>
	<br>
	<form action="GroupModify.do" method="get">
		<input type="hidden" name="id" value="">
		<input type="submit" value="Add">
	</form>

</body>
</html>