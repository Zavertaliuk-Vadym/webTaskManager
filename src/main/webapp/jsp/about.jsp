<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/mystyle.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>

<body>
<div class="aboutTask">
<input type="submit" value="Home" onclick="window.location='/home'"><br>
<table>
    <h4>Title:</h4>
    ${task.title}<br>
    <h4>Details:</h4>
    ${task.details}<br>
    <a href="/change?task=${task.taskId}">
        <i class="material-icons" style="font-size:32px;color: black">spellcheck</i>
    </a>
    <h4>Creation time:</h4>
    ${task.localTime}
</table>
</div>
</body>
</html>
