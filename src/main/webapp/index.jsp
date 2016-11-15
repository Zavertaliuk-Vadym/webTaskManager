<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/mystyle.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
<input type="submit" value="Add Task" onclick="window.location='jsp/add_task.jsp'" style="font-size:12px"><br>
<table>

    <c:forEach items="${taskList}" var="task">
        <tr>
            <c:if test="${!task.view}">
                <td>
                        ${task.title}
                </td>
                <td>
                    <a href="/messages?task=${task.taskId}">
                        <i class="material-icons" style="font-size:32px; color: blue;">pageview</i>
                    </a>
                </td>
                <td>
                    <a href="/delete?task=${task.taskId}">
                        <i class="material-icons" style="font-size:32px;color: red">gavel</i>
                    </a>
                </td>
                <td>
                    <a href="/view?task=${task.taskId}">
                        <i class="material-icons" style="font-size:32px;color: black">speaker_notes</i>
                    </a>
                </td>
            </c:if>
        </tr>
    </c:forEach>

    <c:forEach items="${taskList}" var="task">
        <tr>
            <c:if test="${task.view}">
                <td>
                        ${task.title}
                </td>
                <td>
                    <a href="/messages?task=${task.taskId}">
                        <i class="material-icons" style="font-size:32px; color: blue;">pageview</i>
                    </a>
                </td>
                <td>
                    <a href="/delete?task=${task.taskId}">
                        <i class="material-icons" style="font-size:32px;color: red">gavel</i>
                    </a>
                </td>
                <td>
                    <a href="/view?task=${task.taskId}">
                        <i class="material-icons" style="font-size:32px;color: green">speaker_notes_off</i>

                    </a>
                </td>
            </c:if>
        </tr>
    </c:forEach>

</table>


</body>
</html>
