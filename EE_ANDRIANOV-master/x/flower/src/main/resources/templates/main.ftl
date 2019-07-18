<html>
<head>
    <title>Flower Shop</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<span><a href="/user"> User list</a> </span>
<div><form action="/logout" method="post">
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <input type="submit" value="Sign Out"/>
    </form></div>
Welcome user
</body>
</html>