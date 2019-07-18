<html>
<head>
    <title>Flower Shop</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>

<div><form action="/logout" method="post">
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <input type="submit" value="Sign Out"/>
    </form></div>
Welcome user

<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>number</th>
        <th>price</th>
    </tr>
    <#list flowers as flower>
        <tr>
            <td><a href="/flower${flower.id}">${flower.id}</a></td>
            <td>${flower.name}</td>
            <td>25</td>
            <td>${flower.price}</td>
            <td><a href="cart${flower.id}"><button>Buy</button></a></td>
        </tr>
    </#list>
</table>

</body>
</html>