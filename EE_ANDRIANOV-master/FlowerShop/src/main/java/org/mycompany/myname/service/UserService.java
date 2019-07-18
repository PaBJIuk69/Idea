package org.mycompany.myname.service;

import org.mycompany.myname.entity.User;

import java.util.List;

public interface UserService  {

    List<User> findAllUser();

    User getById(int id);

    User getUsername (String username);

    User getPassword (String password);

    void save (User user);






}
