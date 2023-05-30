<html>
<head>
<meta charset="UTF-8">
<title>Insert title here </title>
</head>
<body>
<h1 align="center">DAYANA`S CAFE!</h1>
<br/>
<!--we create an action when the submit
button is clicked. In this way we are redirecting to a different URL called / processOrder -->
<form action="processOrder">
<!--all contain below will be in the center -->
<div align="center">
<!--create label and link it to the checkbox -->
<label for="item_name">Item Name: </label>
<!--create a text box -->
<input type="text" name="foodType" placeholder="food type?" id="item_name">
<input type="submit" value="Order now!">
</div>
</form>
</body>
</html>
