package org.mycompany.myname.mapper;

import org.mycompany.myname.entity.Flower;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FlowerMapper implements RowMapper<Flower> {
    @Override
    public Flower mapRow(ResultSet resultSet, int i) throws SQLException {
        Flower flower = new Flower();
        flower.setId(resultSet.getInt("id"));
        flower.setName(resultSet.getString("name"));
        flower.setNumber(resultSet.getInt("number"));
        flower.setPrice(resultSet.getInt("price"));

        return flower;
    }
}
