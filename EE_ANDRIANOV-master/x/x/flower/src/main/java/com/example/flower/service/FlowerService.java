package com.example.flower.service;

import com.example.flower.model.Flower;

import java.util.List;

public interface FlowerService {

    List<Flower> AllFlower();



    void save (Flower flower);

    Flower getById(int id);

    void update (Flower flower);

    void delete (int id);
}
