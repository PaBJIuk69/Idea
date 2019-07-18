package org.mycompany.myname.dao;

import org.mycompany.myname.entity.Flower;
import org.mycompany.myname.mapper.FlowerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class FlowerDaoImpl implements FlowerDao {

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public FlowerDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Flower> findAllFlower() {
        String sql = "SELECT * FROM flower";
        return jdbcTemplate.query(sql,new FlowerMapper());
    }

    @Override
    public void buyFlower(Flower flower) {
        String sql = "UPDATE flower  ";
         jdbcTemplate.update(sql, flower.getId(),flower.getName(),flower.getNumber(),flower.getPrice());
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
