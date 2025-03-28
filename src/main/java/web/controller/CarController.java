package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarController {

	private final CarService carService;

	public CarController(CarService carService) {
		this.carService = carService;
	}

	@GetMapping(value = "/cars") //browser address
	public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
		if (count >= 5) {
			model.addAttribute("allCars", carService.getAllCars()); //attribute in the carsview.html
		} else {
			model.addAttribute("countCars", carService.getSomeCars(count)); //attribute in the carsview.html
		}
		return "/carsview"; //spring will be looking for a carsview.html file
	}
}