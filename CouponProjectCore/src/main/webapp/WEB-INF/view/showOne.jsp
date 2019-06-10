<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<html>
<head>
<style >
table, th, td {
  border: 1px solid black;

}
</style>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h1>showing one</h1>
<c:if test="${param.error != null}">
<i class="failed"> Sorry! you entered invalid ID.</i>
</c:if>

<table>
<tr>
<td> ${customer.id} </td>
<td> ${customer.cust_name} </td>
<td> ${customer.password} </td>
</tr>

</table>

</body>
</html>