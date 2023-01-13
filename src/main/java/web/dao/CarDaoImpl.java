package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl {

    public CarDaoImpl() {

    }

    public  List<Car> doCarList(){
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Skoda", "Fabia", "Red"));
        carList.add(new Car("BMW", "X5","Black"));
        carList.add(new Car("Audi", "A5", "Green"));
        carList.add(new Car("Infinity", "XQ50", "Blue"));
        carList.add(new Car("Honda", "Civic", "Yellow"));
        return carList;
    }
}
