<#import "parts/common.ftl" as c>
<@c.common "450">
        <h1>Shopping Cart</h1>
        <form method="post" action="/update">
        <table>
            <tr>
                <th>id</th>
                <th>name</th>
                <th>price</th>
                <th>number </th>
                <th>Sub Total</th>
            </tr>
            <set <#assign s = 0>></set>
            <#if carts??>
            <#list carts as cart>
                <set <#assign s = s+cart.flower.price * cart.number>></set>
                <tr>
                    <td>${cart.flower.id}</td>
                    <td>${cart.flower.name}</td>
                    <td>${cart.flower.price}</td>
                    <td><input type="text" name="number" value="${cart.number}" style="width: 60px"> </td>
                    <td>${cart.flower.price * cart.number}</td>
        </form>
        <form method="get" action="/cart/delete/${cart.flower.id}">
                    <td><a href="/cart/delete/${cart.flower.id}"><button>delete</button></a></td>
        </form>
                </tr>
            </#list>
            </#if>
            <tr>
                <td colspan="4" align="right"><input type="submit" value="update"></td>
            </tr>
            <tr>
                <td colspan="4" align="right">Sum</td>
                <td>${s}</td>
            </tr>
        </table>
        <form method="get" action="/cart/checkout">
        <a href="/cart/checkout"><button>Checkout</button></a>
        </form>
</@c.common>
