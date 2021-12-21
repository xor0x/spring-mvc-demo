<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>

<title>Student Registration Form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
First name: <form:input path="firstName"/>
<br><br>
Last name: <form:input path="lastName"/>
<br><br>
Country:
<form:select path="country">
	<%-- <form:options items="${student.countryOptions}" /> --%>
	<form:options items="${theCountryOptions}" />

</form:select>
<br><br>
Favorite Language:

<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"  />
<%-- Java <form:radiobutton path="favoriteLanguage" value="Java"/>
Python <form:radiobutton path="favoriteLanguage" value="Python"/>
GO <form:radiobutton path="favoriteLanguage" value="GO"/>
Rust <form:radiobutton path="favoriteLanguage" value="Rust"/> --%>

<br><br>

Operating Systems:
Linux <form:checkbox path="operationSystems" value="Linux"/>
Windows <form:checkbox path="operationSystems" value="Windows"/>
Mac OS <form:checkbox path="operationSystems" value="Mac OS"/>
<br><br>
<input type="submit" value="Submit"/>

</form:form>
	
</body>
</html>