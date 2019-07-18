package org.mycompany.myname.mapper;


import org.mycompany.myname.entity.OrderDetail;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderDetailMapper implements RowMapper<OrderDetail> {
    @Override
    public OrderDetail mapRow(ResultSet resultSet, int i) throws SQLException {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setFlowerId(resultSet.getInt("flowerId"));
        orderDetail.setOrderId(resultSet.getInt("orderId"));
        orderDetail.setPrice(resultSet.getInt("price"));
        orderDetail.setNumber(resultSet.getInt("number"));


        return orderDetail;
    }
}
