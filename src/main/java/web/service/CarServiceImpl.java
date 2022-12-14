package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private final CarDaoImpl carDao;

    @Autowired
    public CarServiceImpl(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}