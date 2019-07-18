<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
    <body>
        <h1>Welcome Flower Shop</h1>

        <p><a href="">Cart(1)</a></p>

<table>
    <colgroup>
        <col span="3" style="background:Khaki"><!-- С помощью этой конструкции задаем цвет фона для первых двух столбцов таблицы-->
        <col style="background-color:LightCyan"><!-- Задаем цвет фона для следующего (одного) столбца таблицы-->
    </colgroup>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>number</th>
        <th>price</th>
   </tr>
    <#list flowers as flower>
        <tr>
            <td>${flower.id}</td>
            <td>${flower.name}</td>
            <td>${flower.number}</td>
            <td>${flower.price}</td>
            <td><a href="/buy${flower.id}"><button>Buy</button></a></td>
        </tr>
    </#list>
</table>
        <p><a href="/">Exit</a></p>

        <div><form action="/logout" method="post">
                <input type="submit" value="Sign Out"/>
            </form></div>
    </body>
</html>
