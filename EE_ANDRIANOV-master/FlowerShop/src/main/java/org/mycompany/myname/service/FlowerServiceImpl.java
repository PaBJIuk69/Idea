package org.mycompany.myname.service;

import org.mycompany.myname.dao.FlowerDao;
import org.mycompany.myname.entity.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlowerServiceImpl implements FlowerService {

    @Autowired
    public FlowerDao flowerDao;

    public List<Flower> findAllFlower() {
        return flowerDao.findAllFlower();
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
