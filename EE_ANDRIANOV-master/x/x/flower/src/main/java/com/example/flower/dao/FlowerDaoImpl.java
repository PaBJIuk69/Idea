package com.example.flower.dao;

import com.example.flower.mapper.FlowerMapper;
import com.example.flower.model.Flower;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class FlowerDaoImpl implements FlowerDao {

    public final JdbcTemplate jdbcTemplate;

    public FlowerDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Flower> AllFlower() {

      String sql = "SELECT * FROM flower";
        return jdbcTemplate.query(sql,new FlowerMapper());
    }



    @Override
    public void save(Flower flower) {
        String sql = "INSERT INTO flower(name, number, price) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, flower.getName(),flower.getNumber(),flower.getPrice());
    }


    @Override
    public Flower getById(int id) {
        String sql = "SELECT * FROM flower WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new FlowerMapper(), id);
    }

    @Override
    public void update(Flower flower) {
        String sql = "UPDATE flower SET name = ?, number = ?, price = ? WHERE id = ?";
        jdbcTemplate.update(sql, flower.getName(),flower.getNumber(),flower.getPrice(),flower.getId());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM flower WHERE id=?";
        jdbcTemplate.update(sql, id);
    }
}
