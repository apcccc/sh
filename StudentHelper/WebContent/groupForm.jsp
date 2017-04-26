<%@page import="edu.bigroi.sh.bean.Group"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Helper</title>
</head>
<body>

<form action="GroupSave.do">
	<input type="hidden" name="oldNumber" value="<%=request.getAttribute("oldGroupNumber").toString()%>"><br>
	<input name="number" value="<%=((Group)request.getAttribute("group")).getNumber() %>"><br>
	<input name="avgMark" value="<%=((Group)request.getAttribute("group")).getAvgMark() %>"><br>
	<input type="submit" name="save" value="SAVE"><br>
	<input type="submit" name="back" value="BACK">
</form>

</body>
</html>