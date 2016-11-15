<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/mystyle.css">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
<input type="submit" value="Add Task" onclick="window.location='jsp/add_task.jsp'"><br>
<table>
    <c:forEach items="${taskList}" var="task">
        <tr>
            <td>
                    ${task.title}
            </td>
            <td>
                <a href="/messages?task=${task.taskId}">
                    <i class="material-icons" style="font-size:32px; color: black;">chrome_reader_mode</i>
                </a>
            </td>
            <td>
                <a href="/delete?task=${task.taskId}">
                    <i class="material-icons" style="font-size:32px;color: red">gavel</i>
            </td>
            <td>

                <c:if test="${!task.view}">
                    <a href="/view?task=${task.taskId}">
                        <i class="material-icons" style="font-size:32px;color: blue">visibility_off</i>
                    </a>
                </c:if>
                <c:if test="${task.view}">
                    <a href="/view?task=${task.taskId}">
                        <i class="material-icons" style="font-size:32px;color: green">visibility_on</i>

                    </a>
                </c:if>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
