<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
    <body>
        <h1>Welcome Flower Shop</h1>
        <p><a href="">Exit</a></p>

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
            <td><a href="/springgtest_war/flower/${flower.id}">${flower.id}</a></td>
            <td>${flower.name}</td>
            <td>${flower.number}</td>
            <td>${flower.price}</td>
            <td><a href="delete/${flower.id}"><button>Delete</button></a></td>
            <td><a href="update/${flower.id}"><button>Update</button></a></td>
        </tr>
    </#list>
    <p><a href="addFlower">Create Flower</a></p>
</table>
    </body>
</html>
