package org.mycompany.myname.service;

import org.mycompany.myname.entity.Order;
import org.mycompany.myname.entity.OrderDetail;

import java.util.List;

public interface OrderDetailService {

    void create(OrderDetail orderDetail);

    OrderDetail getByOrderId(int id);

    List<OrderDetail> findAllOrder();


}
