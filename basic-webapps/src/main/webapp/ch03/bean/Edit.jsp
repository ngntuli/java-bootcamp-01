<!DOCTYPE HTML>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Login</title>
</head>
<body>
<h2>Enter your details</h2>
<form action="Controller">
    Username: <input name="userName" type="text" value="${refData.data.userName}" required><br>
    Password: <input name="password" type="text" value="${refData.data.password}" required><br>
    <input name="confirmButton" type="submit" value="Submit">
</form>
</body>
</html>
