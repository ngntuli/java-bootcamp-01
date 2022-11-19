<!DOCTYPE HTML>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Confirm Page</title>
</head>
<body>
<p>
    This is a simple HTML page that has a form in it.
</p>
<p>
    The value of the hobby that was sent to this page is: <strong> ${data.hobby}</strong>
    <br>
    The value of the aversion that was sent to this page is: <strong>${data.aversion}</strong>
</p>
<p>
    If there is an error, please select <em>Edit</em>, otherwise please select <em>Process</em>.
</p>
<p>
    <a href="edit">
        <button>Edit</button>
    </a>
    <a href="process">
        <button>Process</button>
    </a>
</p>
</body>
</html>
