<!DOCTYPE HTML>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Confirm</title>
</head>
<body>
<h2>Please confirm your details, or edit if there is an error</h2>
<form action="Controller">
    Username: ${refData.data.userName} <br>
    Password: ${refData.data.password}<br>
    <input type="hidden" name="userName" value="${refData.data.userName}">
    <input type="hidden" name="password" value="${refData.data.password}">
    <input type="submit" name="edit" value="Edit">
    <input type="submit" name="processButton" value="Confirm">
</form>
</body>
</html>
