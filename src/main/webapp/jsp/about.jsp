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
        <c:forEach items="${taskList}" var="task">
            <h4>Title:</h4>
            ${task.title}<br>
            <h4>Details:</h4>
            ${task.details}<br>
            <h4>Creation time:</h4>
            ${task.localTime}
            <h4>Current time:</h4>
            ${task.currentDay}
        </c:forEach>
    </table>
    <table>
        <c:forEach items="${listLists}" var="list">
            <h4>List:</h4>
            ${list.id}<br>
            <h4>Name:</h4>
            ${list.name}<br>
        </c:forEach>
    </table>
</div>
</body>
</html>
