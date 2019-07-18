<html>
    <body>
        <h1>Welcome Flower Shop</h1>
        <form action="/login/process" method="post">

            <div>
                Username: <input name="username" type="username">
            </div>
            <div>
                Password: <input name="password" type="password">
            </div>
            <input type="submit">
        </form>

        <#if error??>
            <p>Bad credentials</p>
        </#if>
    </body>
</html>
