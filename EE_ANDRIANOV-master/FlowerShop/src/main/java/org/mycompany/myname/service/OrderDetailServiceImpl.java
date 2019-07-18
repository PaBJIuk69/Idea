package org.mycompany.myname.service;

import org.mycompany.myname.dao.OrderDetailDao;
import org.mycompany.myname.entity.Order;
import org.mycompany.myname.entity.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService  {

    @Autowired
    OrderDetailDao orderDetailDao;

    @Override
    public void create(OrderDetail orderDetail) {
        orderDetailDao.create(orderDetail);
    }

    @Override
    public OrderDetail getByOrderId(int id) {
        return orderDetailDao.getByOrderId(id);
    }

    @Override
    public List<OrderDetail> findAllOrder() {
        return orderDetailDao.findAllOrder();
    }


}
