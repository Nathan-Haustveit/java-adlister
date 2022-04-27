<%--
  Created by IntelliJ IDEA.
  User: nathanhaustveit
  Date: 4/27/22
  Time: 12:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
    <form method="post">

            <label for="crust">Crust</label>
            <select name="crust" id="crust">
                <option>Thin</option>
                <option>Pan</option>
                <option>Thick</option>
            </select>

            <label for="sauce">Sauce</label>
            <select name="sauce" id="sauce">
                <option>Marinara</option>
                <option>BBQ</option>
                <option>Alfredo</option>
            </select>

            <label for="size">Size</label>
            <select name="size" id="size">
                <option>Small</option>
                <option>Medium</option>
                <option>Large</option>
            </select>
            <br>
            <br>
            <input type="checkbox" name="toppings" id="peperoni" value="Peperoni">
            <label for="peperoni">Peperoni</label>
            <br>
            <input type="checkbox" name="toppings" id="sausage" value="Sausage">
            <label for="sausage">Sausage</label>
            <br>
            <input type="checkbox" name="toppings" id="green-peppers" value="Green Peppers">
            <label for="green-peppers">Green Peppers</label>
            <br>
            <input type="checkbox" name="toppings" id="roasted-peppers" value="Roasted Red Peppers">
            <label for="roasted-peppers">Roasted Red Peppers</label>
            <br>
            <br>
            <label for="address">Address</label>
            <br>
            <textarea rows="5" cols="30" name="address" id="address" value="address"></textarea>
            <br>
            <br>
            <input type="submit" value="Order">
    </form>
</body>
</html>
