package org.mycompany.myname.dao;

import org.mycompany.myname.entity.Flower;

import java.util.List;

public interface FlowerDao {

    List<Flower> findAllFlower();

    void save (Flower flower);

    Flower getById(int id);

    void update (Flower flower);

    void delete (int id);


}
