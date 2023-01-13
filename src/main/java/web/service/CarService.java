package web.service;

import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

public class CarService {

    final private CarDaoImpl dao;

    public CarService(CarDaoImpl dao) {
        this.dao = dao;
    }

    public List<Car> getDaoCars(){
        return dao.doCarList();
    }
}
