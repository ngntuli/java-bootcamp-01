<!DOCTYPE HTML>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Simple Edit Page</title>
</head>
<body>
<p>
    This is a simple HTML page that has a form in it.
</p>
<form action="Controller">
    <p>
        If there are values for hobby and aversion in the query string, then they are used to
        initialize the hobby and aversion text elements.
    </p>
    <p>
        Hobby:
        <input type="text" name="hobby" value="${data.hobby}" required>
        <br>
        Aversion:
        <input type="text" name="aversion" value="${data.aversion}" required>
    </p>
    <p>
        <input type="submit" name="confirmButton" value="Confirm">
    </p>
</form>
</body>
</html>
