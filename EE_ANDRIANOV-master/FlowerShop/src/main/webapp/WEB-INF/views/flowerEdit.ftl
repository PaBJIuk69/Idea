<#import "parts/common.ftl" as c>
<@c.common "300">
        <h1>Welcome Flower Shop</h1>
        <p><a href="">Exit</a></p>
<table>
    <tr>
        <th>id</th>
        <th>name</th>
        <th>number</th>
        <th>price</th>
   </tr>
    <#list flowers as flower>
        <tr>
            <td><a href="/flower/${flower.id}">${flower.id}</a></td>
            <td>${flower.name}</td>
            <td>${flower.number}</td>
            <td>${flower.price}</td>
            <td><a href="/delete/${flower.id}"><button>Delete</button></a></td>
            <td><a href="/update/${flower.id}"><button>Update</button></a></td>
        </tr>
    </#list>
    <p><a href="addFlower">Create Flower</a></p>
</table>
</@c.common>
