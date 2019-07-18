package org.mycompany.myname.dao;


import org.mycompany.myname.entity.User;
import org.mycompany.myname.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {



    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> findAllUser() {
        String sql = "SELECT * FROM user";
        return jdbcTemplate.query(sql, new UserMapper());
    }

    @Override
    public User getById(int id) {
        String sql = "SELECT * FROM user WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    @Override
    public User getUsername(String username) {
        String sql = "SELECT * FROM user WHERE username = ?";

        return jdbcTemplate.queryForObject(sql, new UserMapper(), username);
    }

    @Override
    public User getPassword(String password) {
        String sql = "SELECT * FROM user WHERE password = ?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), password);
    }

    @Override
    public void save(User user) {
        String sql = "INSERT INTO user(username, password, full_name, address, phone) VALUES (?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getFull_name(), user.getAddress(), user.getPhone());

    }


}
