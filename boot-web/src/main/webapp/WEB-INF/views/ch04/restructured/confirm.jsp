<!DOCTYPE HTML>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Confirmation Page with Edit/Process Options</title>
</head>
<body>
<p>
    The value of the hobby that was sent to this page is: <strong> ${data.hobby}</strong>
</p>
<p>
    The value of the aversion that was sent to this page is: <strong>${data.aversion}</strong>
</p>
<p>
    If there is an error, please select <em>Edit</em>, otherwise please select <em>Process</em>.
</p>
<form action="Controller">
    <p>
        <input type="hidden" name="hobby" value="${data.hobby}">
        <input type="hidden" name="aversion" value="${data.aversion}">
        <input type="submit" name="editButton" value="Edit">
        <input type="submit" name="processButton" value="Process">
    </p>
</form>
</body>
</html>
