package org.mycompany.myname.service;


import org.mycompany.myname.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAllOrder();

    void saveOrder(Order Order);

    Order getByOrderId(int id);


}
