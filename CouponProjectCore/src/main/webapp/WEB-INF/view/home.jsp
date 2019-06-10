<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html xmlns:th="http://www.thymeleaf.org">
<head>
<style>
body {
background-color: blue;
}

</style>
<title>LOGIN PAGE</title>
</head>
<body style="background-color:powderblue;">

<input type="hidden"
    name="${_csrf.parameterName}"
    value="${_csrf.token}"/> 


<security:authorize  access="hasRole('ADMIN')">  
<a href="${pageContext.request.contextPath}/leaders" method="POST">COMPANY LINK</a>
<a href="${pageContext.request.contextPath}/system" method="POST">SYSTEM LINK</a>
<a href="${pageContext.request.contextPath}/customer/show" > SHOW ALL</a>
</security:authorize>

<form:form action ="${pageContext.request.contextPath}/logout" method="POST">

<input type="submit" value="Logout"/>

</form:form>

<form:form action ="/customer/show" method="GET">

<h1>SHOW ALL CLIENTS</h1>

<input type="submit" value="Show All"/>

</form:form>




<form:form action="${pageContext.request.contextPath}/customer/customers/{id}" method="GET" modelAttribute="customer">
<input type="text" name="id">
<input type="submit" value="show customer">
</form:form>

<form:form action="${pageContext.request.contextPath}/customer/customer" method="POST" modelAttribute="customer">
<input type="text" name="name">
<input type="text" name="password">
<input type="submit" value="add">
</form:form>

<h1> COMPNANY </h1>

<form:form action="${pageContext.request.contextPath}/company/company" method="POST" modelAttribute="company">
<input type="text" name="comp_name">
<input type="text" name="password">
<input type="submit" value="add">
</form:form>


<form:form action ="/company/showAllCompany" method="GET">

<h1>SHOW ALL COMPANIES</h1>

<input type="submit" value="Show All"/>

</form:form>


<h1> Create Coupon </h1>
<form:form action="${pageContext.request.contextPath}/company/create" method="POST" modelAttribute="coupon">

title<input type="text" name="title"><br>
startDate<input type="date" name="startDate"><br>
endDate<input type="date" name="endDate"><br>
amount<input type="number" name="amount"><br>
message<input type="text" name="message"><br>
price<input type="number" name="price"><br>
image<input type="text" name="image"><br>

<select>
    <option th:each="value : ${T(com.example.CouponProjectCore.entity.CouponType).values()}"
            th:value="${value}"
            th:text="${value}">
    </option>
</select>

<input type="submit" value="add">
</form:form>





</body>
</html>