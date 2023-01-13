package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
@Component("car")
public class CarService {

    final private CarDao dao;

    public CarService(@Autowired CarDao dao) {
        this.dao = dao;
    }


    public List<Car> getListCars(int count) {
        List<Car> car = dao.doCarList();
        switch (count) {
            case 1 -> {
                return car.subList(0, 1);
            }
            case 2 -> {
                return car.subList(0, 2);
            }
            case 3 -> {
                return car.subList(0, 3);
            }
            case 4 -> {
                return car.subList(0, 4);
            }
            default -> {
                return car;
            }
        }
    }
}
