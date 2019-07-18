package org.mycompany.myname.dao;

import org.mycompany.myname.entity.User;
import org.mycompany.myname.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public class UserDaoImpl implements UserDao {

    public final JdbcTemplate jdbcTemplate;

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
    public void save(User user) {
        String sql = "INSERT INTO user(login, password, full_name, address, phone, sale, cash) VALUES (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql,user.getLogin(),user.getPassword(),user.getFull_name(),user.getAddress(),user.getPhone(),user.getSale(),user.getCash());
    }

    @Override
    public User getById(int id) {
        String sql = "SELECT * FROM user WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    @Override
    public void update(User user) {
        String sql = "UPDATE user SET login = ?, password = ?, full_name = ?, address = ?, phone = ?, sale = ?, cash = ? WHERE id = ?";
        jdbcTemplate.update(sql, user.getId(),user.getLogin(),user.getPassword(),user.getFull_name(),user.getAddress(),user.getPhone(),user.getSale(),user.getCash());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM user WHERE id=?";
        jdbcTemplate.update(sql, id);
    }



}
