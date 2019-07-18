<#import "parts/common.ftl" as c>
<@c.common "600">
        <h1>Admin panel</h1>
        <style type="text/css">
            TABLE {
                width: 600px; /* Ширина таблицы */
                border-collapse: collapse; /* Убираем двойные линии между ячейками */
            }
            TD, TH {
                padding: 3px; /* Поля вокруг содержимого таблицы */
                border: 1px solid black; /* Параметры рамки */
            }
            TH {
                background: #b0e0e6; /* Цвет фона */
            }
        </style>
        <table>
            <tr>
                <th>Id</th>
                <th>name</th>
                <th>Data order</th>
                <th>customerName</th>
                <th>customerAddress</th>
                <th>phone</th>
            </tr>
            <#list orders as order>
                <tr>
                    <td><a href="/orders/${order.id}">${order.id}</a> </td>
                    <td>${order.name}</td>
                    <td>${order.creationDate}</td>
                    <td>${order.customerName}</td>
                    <td>${order.customerAddress}</td>
                    <td>${order.phone}</td>
                </tr>
            </#list>
        </table>
</@c.common>
