package org.mycompany.myname.dao;

import org.mycompany.myname.entity.Order;
import org.mycompany.myname.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDaoImpl implements OrderDao {

    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public OrderDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Order> findAllOrder() {
        String sql = "SELECT * FROM orders";
        return jdbcTemplate.query(sql, new OrderMapper());
    }

    @Override
    public void saveOrder(Order order) {
        String sql = "INSERT INTO orders(id, name, creationDate, customerName, customerAddress, phone) VALUES (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, order.getId(), order.getName(), order.getCreationDate(),order.getCustomerName(), order.getCustomerAddress(), order.getPhone());
    }

    @Override
    public Order getByOrderId(int id) {
        String sql = "SELECT * FROM orders WHERE id= ?";
        return jdbcTemplate.queryForObject(sql, new OrderMapper(), id);
    }



}
