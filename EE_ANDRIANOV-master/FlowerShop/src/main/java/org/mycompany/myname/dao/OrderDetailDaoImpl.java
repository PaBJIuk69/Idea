package org.mycompany.myname.dao;

import org.mycompany.myname.entity.Order;
import org.mycompany.myname.entity.OrderDetail;

import org.mycompany.myname.mapper.OrderDetailMapper;
import org.mycompany.myname.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class OrderDetailDaoImpl implements OrderDetailDao {


    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public OrderDetailDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(OrderDetail orderDetail) {
        String sql = "INSERT INTO orderdetail(flowerId, orderId, price, number ) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, orderDetail.getFlowerId(), orderDetail.getOrderId(),orderDetail.getPrice(), orderDetail.getNumber());
    }

    @Override
    public OrderDetail getByOrderId(int id) {
        String sql = "SELECT * FROM orderdetail WHERE orderId = ?";
        return jdbcTemplate.queryForObject(sql, new OrderDetailMapper(), id);
    }

    @Override
    public List<OrderDetail> findAllOrder() {
        String sql = "SELECT * FROM orderdetail";
        return jdbcTemplate.query(sql, new OrderDetailMapper());
    }




}
