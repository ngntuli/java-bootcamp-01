<!DOCTYPE HTML>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Process Page</title>
</head>
<body>
<p>
    Thank you for your information. Your hobby of
    <strong>${data.hobby}</strong> and aversion of
    <strong>${data.aversion}</strong> will be added to our records, eventually.
</p>
<form action="Controller">
    <input type="hidden" name="hobby" value="${data.hobby}">
    <input type="hidden" name="aversion" value="${data.aversion}">
    <p>
        <input type="submit" name="editButton" value="Edit">
    </p>
</form>
</body>
</html>
