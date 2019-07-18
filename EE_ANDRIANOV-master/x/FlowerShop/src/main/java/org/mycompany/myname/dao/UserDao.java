package org.mycompany.myname.dao;

import org.mycompany.myname.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao  {

    List<User> findAllUser();

    User getById(int id);
    void save (User user);
    void update (User user);

    void delete (int id);



}
