package org.mycompany.myname.dao;

import org.mycompany.myname.entity.Order;
import org.mycompany.myname.entity.OrderDetail;

import java.util.List;

public interface OrderDetailDao {

    void create(OrderDetail orderDetail);

    OrderDetail getByOrderId(int id);

    List<OrderDetail> findAllOrder();


}
