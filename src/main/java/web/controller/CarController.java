package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;


@Controller
public class CarController {
    @Autowired
    public CarServiceImpl cars;
    @GetMapping(value = "/cars")
    public String getCars(Model model, @RequestParam(value = "count", defaultValue = "5") int count){
        model.addAttribute("cars", cars.getListCars(count));
        return "cars";
    }
}
