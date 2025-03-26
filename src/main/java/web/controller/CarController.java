package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.CarService;

import java.util.List;

@Controller
public class CarController {

	private final CarService carService;

	@Autowired
	public CarController(CarService carService) {
		this.carService = carService;
	}

	@GetMapping(value = "/cars") //browser address
	public String printAllCars(ModelMap model) {
		model.addAttribute("allCars", carService.getAllCars()); //attribute in the totalcars.html
		return "/totalcars"; //spring will be looking for a totalcars.html file
	}

	@GetMapping(value = "/cars")
	public String printSomeCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
		if (count >= 5) {
			model.addAttribute("allCars", carService.getAllCars());
		} else {
			model.addAttribute("countCars", carService.getSomeCars(count));
		}
		return "/somecars";
	}
}
//Коллекция должна находиться в ДАО, дао должно возвращать неизменяемые списки для того чтобы юзер не повлиял на нашу “базу”
// в виде коллекции. Дао, никаких статиков, должно быть два метода получения полного списка и части.
//Логика с “больше 5, значит все” не должна находиться в дао.
//Контроллер count должен быть не обязательным параметром. После чего смотрим,
// если есть данный параметр тогда отдается в один сервис дао, если нету то в другой.