package com.example.flower.dao;

import com.example.flower.model.Flower;


import java.util.List;

public interface FlowerDao  {

    List<Flower> AllFlower();



    void save (Flower flower);

    Flower getById(int id);

    void update (Flower flower);

    void delete (int id);
}
