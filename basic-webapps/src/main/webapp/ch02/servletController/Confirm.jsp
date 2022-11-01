<!DOCTYPE HTML>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Confirm</title>
</head>
<body>
<h2>Please confirm your details, or edit if there is an error</h2>
<form action="Controller">
    Username: ${param.userName} <br>
    Password: ${param.password}<br>
    <input type="hidden" name="userName" value="${param.userName}">
    <input type="hidden" name="password" value="${param.password}">
    <input type="submit" name="edit" value="Edit">
    <input type="submit" name="process" value="Confirm">
</form>
</body>
</html>
