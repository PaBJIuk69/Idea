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
           <h4>Order  - ${orderId}</h4>
        <table>
            <tr>
<#--                <th>OrderId</th>-->
                <th>FlowerId</th>
                <th>Price</th>
                <th>number</th>
            </tr>
            <#list orderdetails as orderdetail>
                <tr>
<#--                    <td>${orderdetail.orderId}</td>-->
                    <td>${orderdetail.flowerId}</td>
                    <td>${orderdetail.price}</td>
                    <td>${orderdetail.number}</td>
                </tr>
            </#list>
        </table>

        </@c.common>
