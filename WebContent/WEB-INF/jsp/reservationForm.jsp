<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head><title>Reservation Form</title>
<style>
.error {
color:#ff0000;
font-weight:bold;
}
</style>
</head>
<body>
<form:form method="post" modelAttribute="reservation">
<form:errors path="*" cssClass="error"/>
<table>
	<tr>
		<td>Court Name</td>
		<td><form:input path="courtName"/></td>
		<td><form:errors path="courtName" cssClass="error"/></td>
	</tr>
	<tr>
		<td>Date</td>
		<td><form:input path="date"/></td>
		<td><form:errors path="date" cssClass="error"/></td>
	</tr>
	<tr>
		<td>Hour</td>
		<td><form:input path="hour"/></td>
		<td><form:errors path="hour" cssClass="error"/></td>		
	</tr>
	<tr>
	<tr>
		<td>Player Name</td>
		<td><form:input path="player.name"/></td>
		<td><form:errors path="player.name" cssClass="error"/></td>
	</tr>
	<tr>
		<td>Player phone</td>
		<td><form:input path="player.phone"/></td>
		<td><form:errors path="player.phone" cssClass="error"/></td>
	</tr>
	<tr>
		<td>Sport Type</td>
		<td><select>
				<c:forEach var="sport" items="${sportTypes}">
				<option>${sport.name}</option>
				</c:forEach>
			</select>
		</td>
	</tr>
	<tr>
		<td colspan="3"><input type="submit" value="Submit"/></td>
	</tr>
</table>
</form:form>
</body>
</html>