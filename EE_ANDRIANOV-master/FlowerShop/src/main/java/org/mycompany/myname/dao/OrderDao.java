package org.mycompany.myname.dao;


import org.mycompany.myname.entity.Order;

import java.util.List;

public interface OrderDao {

    List<Order> findAllOrder();

    void saveOrder(Order Order);

    Order getByOrderId(int id);





}
