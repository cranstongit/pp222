package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("Alex - top JAVA Proger");
		messages.add("Тест кириллицы");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}
	
}
//Коллекция должна находиться в ДАО, дао должно возвращать неизменяемые списки для того чтобы юзер не повлиял на нашу “базу” в виде коллекции.
//		Дао, никаких статиков, должно быть два метода получения полного списка и части.
//Логика с “больше 5, значит все” не должна находиться в дао.
//Контроллер count должен быть не обязательным параметром. После чего смотрим, если есть данный параметр тогда отдается в один сервис дао, если нету то в другой.