package org.mycompany.myname.service;

import org.mycompany.myname.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser();

    void save (User user);

    User getById(int id);

    void update (User user);

    void delete (int id);



}
