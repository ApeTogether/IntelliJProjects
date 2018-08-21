<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" type="text/css" href="/resources/style.css">
<html>
<head>
    <title>Title</title>
</head>
<body>

<sf:form method="post" commandName="spitter" action="/spitter/register_jstl">
    <sf:errors path="*" element="div"/>
    <table>
        <tr>
            <td>First Name:</td>
            <td><sf:input path="firstName"/><sf:errors path="firstName"/></td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td><sf:input path="lastName"/><sf:errors path="lastName"/></td>
        </tr>
        <tr>
            <td>User Name:</td>
            <td><sf:input path="userName"/><sf:errors path="userName"/></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><sf:input path="password"/><sf:errors path="password"/></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><sf:input path="email"/><sf:errors path="email"/></td>
        </tr>
        <tr aria-colspan="2">
            <td><input type="submit" name="Register"/></td>
        </tr>
    </table>
    <br/>

</sf:form>
</body>
</html>
