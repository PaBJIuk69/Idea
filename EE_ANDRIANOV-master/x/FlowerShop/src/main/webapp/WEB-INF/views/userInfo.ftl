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
            <td>${user.id}</td>
        </tr>
        <tr>
            <td>Login</td>
            <td>${user.login}</td>
        </tr>
        <tr>
            <td>Password</td>
            <td>${user.password}</td>
        </tr>
        <tr>
            <td>Full_name</td>
            <td>${user.full_name}</td>
        </tr>
        <tr>
            <td>Address</td>
            <td>${user.address}</td>
        </tr>
        <tr>
            <td>Phone</td>
            <td>${user.phone}</td>
        </tr>
        <tr>
            <td>Sale</td>
            <td>${user.sale}</td>
        </tr>
        <tr>
            <td>Cash</td>
            <td>${user.cash}</td>
        </tr>
    </table>

</body>
</html>