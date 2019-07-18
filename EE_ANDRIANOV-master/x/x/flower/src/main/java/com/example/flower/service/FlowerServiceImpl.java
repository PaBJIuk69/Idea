package com.example.flower.service;

import com.example.flower.dao.FlowerDao;
import com.example.flower.model.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlowerServiceImpl implements FlowerService {

    @Autowired
    public FlowerDao flowerDao;

    @Override
    public List<Flower> AllFlower() {
        return flowerDao.AllFlower();
    }

    @Override
    public void save(Flower flower) {
        flowerDao.save(flower);
    }

    @Override
    public Flower getById(int id) {
        return flowerDao.getById(id);
    }

    @Override
    public void update(Flower flower) {
        flowerDao.update(flower);
    }

    @Override
    public void delete(int id) {
    flowerDao.delete(id);
    }

}
