<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
    <body>
    <p> <a href="/springgtest_war/">Exit</a></p>
    <h1>Flower Shop</h1>
    <table>
     <col span="9" style="background:Khaki"><!-- С помощью этой конструкции задаем цвет фона для первых двух столбцов таблицы-->
     <col style="background-color:LightCyan"><!-- Задаем цвет фона для следующего (одного) столбца таблицы-->
        <tr>
            <th>id</th>
            <th>login</th>
            <th>password</th>
            <th>full_name</th>
        </tr>
        <#list users as user>
            <tr>
                <td><a href="/springgtest_war/user/${user.id}">${user.id}</a></td>
                <td>${user.login}</td>
                <td>${user.password}</td>
                <td>${user.full_name}</td>
            </tr>
        </#list>
    </body>
</html>
