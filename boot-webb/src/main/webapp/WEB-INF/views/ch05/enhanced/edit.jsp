<%@page pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Edit Page</title>
</head>
<body>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<p>
    This is a simple HTML page that has a form in it.
</p>
<form:form method="POST" action="confirm" modelAttribute="data">
    <p>
        If there are values for hobby and aversion in the query string, then they are used to
        initialize the hobby and aversion text elements.
    </p>
    <p>
        Hobby:
        <form:input path="hobby"/>
        <br>
        Aversion:
        <form:input path="aversion"/>
    </p>
    <p>
        <input type="submit" name="confirmButton" value="Confirm">
    </p>
</form:form>
</body>
</html>
