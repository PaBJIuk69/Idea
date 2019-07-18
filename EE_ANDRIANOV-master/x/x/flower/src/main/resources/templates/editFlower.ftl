<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<form name="flower" action="/updateFlower" method="post">
    <p>Id</p>
    <input title="Id" type="text" name="id" value="${flower.id}">
    <p>Name</p>
    <input title="Name" type="text" name="name" value="${flower.name}">
    <p>Number</p>
    <input title="Number" type="text" name="number"value="${flower.number}">
    <p>Price</p>
    <input title="Price" type="text" name="price"value="${flower.price}">
    <input type="submit" value="OK">
</form>

<a href="/main">Click here to see Flowers</a><br>

</body>
</html>