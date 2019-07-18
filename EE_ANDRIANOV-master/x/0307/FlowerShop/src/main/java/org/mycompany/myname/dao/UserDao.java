package org.mycompany.myname.dao;

import org.mycompany.myname.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao  {

    List<User> findAllUser();

    User getById(int id);

    User getUsername (String username);

    void save (User user);



}
