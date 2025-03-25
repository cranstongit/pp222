//package web.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Controller
//public class CarController {
//
//	@GetMapping(value = "/cars")
//	public String printCar(ModelMap model) {
//		List<String> cars = new ArrayList<>();
//		cars.add("Hello!");
//		cars.add("Alex - top JAVA Proger");
//		cars.add("Тест кириллицы");
//		cars.add("I'm Spring MVC application");
//		cars.add("5.2.0 version by sep'19 ");
//		model.addAttribute("cars", cars);
//		return "index";
//	}
//
//}