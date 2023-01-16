package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
@Component("car")
public class CarServiceImpl implements CarService {

    final private CarDao dao;

    public CarServiceImpl(@Autowired CarDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Car> getListCars(int count) {
        List<Car> car = dao.doCarList();
        if (count > car.size())
            return car;
        else return car.subList(0, count);
    }
}
