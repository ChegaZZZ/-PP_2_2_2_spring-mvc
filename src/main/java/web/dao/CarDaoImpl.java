package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW", "E60", 2010));
        cars.add(new Car("BMW", "E39", 2003));
        cars.add(new Car("AUDI", "A4", 2015));
        cars.add(new Car("AUDI", "A4", 2007));
        cars.add(new Car("Mercedes", "W205", 2021));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}