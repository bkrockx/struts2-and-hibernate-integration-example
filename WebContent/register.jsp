<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
<s:head />
<style type="text/css">
@import url(style.css);
</style>
</head>
<body>
<s:form action="addEmployee">
	<s:textfield name="name" label="Employee Name" />
	<s:password name="password" label="Password" />
	<s:radio name="gender" label="Gender" list="{'Male','Female'}" />
	<s:submit />
</s:form>

<s:if test="employeeList.size() > 0">
	<div class="content">
	<table class="employeeTable" cellpadding="5px">
		<tr class="even">
			<th>Name</th>
			<th>Gender</th>
		</tr>
		<s:iterator value="employeeList" status="userStatus">
			<tr
				class="<s:if test="#employeeStatus.odd == true ">odd</s:if><s:else>even</s:else>">
				<td><s:property value="name" /></td>
				<td><s:property value="gender" /></td>
			</tr>
		</s:iterator>
	</table>
	</div>
</s:if>
</body>
</html>