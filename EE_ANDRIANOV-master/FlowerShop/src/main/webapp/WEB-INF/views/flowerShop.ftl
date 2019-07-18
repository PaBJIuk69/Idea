<#import "parts/common.ftl" as c>
<@c.common "300">

        <h1>Welcome Flower Shop</h1>

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
                    <td>${1}</td>
<#--                    <td>${flower.number}</td>-->
                    <td>${flower.price}</td>
                    <td><a href="/buy/${flower.id}"><button>Buy</button></a></td>
                </tr>
            </#list>
        </table>
</@c.common>
