package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String getCars(Model model, @RequestParam(value = "count", defaultValue = "5") int count){
        List<Car> car = new ArrayList<>();
        car.add(new Car("Skoda", "Fabia", "Red"));
        car.add(new Car("BMW", "X5","Black"));
        car.add(new Car("Audi", "A5", "Green"));
        car.add(new Car("Infinity", "XQ50", "Blue"));
        car.add(new Car("Honda", "Civic", "Yellow"));
        switch (count) {
            case 1 -> model.addAttribute("cars", car.subList(0, 1));
            case 2 -> model.addAttribute("cars", car.subList(0, 2));
            case 3 -> model.addAttribute("cars", car.subList(0, 3));
            case 4 -> model.addAttribute("cars", car.subList(0, 4));
            default -> model.addAttribute("cars", car);
        }
        return "cars";
    }
}
