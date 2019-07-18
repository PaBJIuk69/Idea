<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

    <p><a href="">Exit</a></p>
    <h1>Flower Shop</h1>
    <h4>User information  </h4>
    <table>
        <col span="9" style="background:Khaki"><!-- С помощью этой конструкции задаем цвет фона для первых двух столбцов таблицы-->
        <col style="background-color:LightCyan"><!-- Задаем цвет фона для следующего (одного) столбца таблицы-->
        <tr>
            <td>Id</td>
            <td>${flower.id}</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${flower.name}</td>
        </tr>
        <tr>
            <td>Number</td>
            <td>${flower.number}</td>
        </tr>
        <tr>
            <td>Price</td>
            <td>${flower.price}</td>
        </tr>
    </table>

</body>
</html>