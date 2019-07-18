package org.mycompany.myname.service;

import org.mycompany.myname.entity.Flower;

import java.util.List;

public interface FlowerService {

    List<Flower> findAllFlower();

    void save (Flower flower);

    Flower getById(int id);

    void update (Flower flower);

    void delete (int id);

}
