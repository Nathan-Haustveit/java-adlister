<%--
  Created by IntelliJ IDEA.
  User: nathanhaustveit
  Date: 4/28/22
  Time: 9:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Guessing Game</h1>
    <h2>Guess a number between 1 and 3</h2>
    <form method="post" action="/guess">
        <input type="radio" id="num1" name="guess" value=1>
        <label for="num1">1</label>
        <input type="radio" id="num2" name="guess" value=2>
        <label for="num2">2</label>
        <input type="radio" id="num3" name="guess" value=3>
        <label for="num3">3</label>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
