<#import "parts/common.ftl" as c>
<@c.common "600">
        <h1>Customer orders</h1>
        <p><a href="/adminPanel">To main</a></p>
        <p>Client: <a href="/">Bob Lanchovski</a></p>
        <table>
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
                </tr>
            </#list>
        </table>
        <div><form action="/logout" method="post">
                <input type="submit" value="Sign Out"/>
            </form></div>
</@c.common>
