<html>
<head>
    <link rel="stylesheet" href="../css/mystyle.css">
</head>
<body>
<input type="submit" value="Home" onclick="window.location='/home'"><br>
<form action="/newTask">
    <input type="text" name="new_task" placeholder="add task" required>
    <input type="text" name="new_description" placeholder="add description" required>
    <input type="submit" value="Add Task"><br>
</form>
</body>
</html>
