package org.mycompany.myname.mapper;


import org.mycompany.myname.entity.Order;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderMapper implements RowMapper<Order> {
    @Override
    public Order mapRow(ResultSet resultSet, int i) throws SQLException {
        Order order = new Order();
        order.setId(resultSet.getInt("id"));
        order.setName(resultSet.getString("name"));
        order.setCreationDate(resultSet.getDate("CreationDate"));
        order.setCustomerName(resultSet.getString("CustomerName"));
        order.setCustomerAddress(resultSet.getString("CustomerAddress"));
        order.setPhone(resultSet.getString("phone"));
        return order;
    }
}
