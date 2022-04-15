package com.example.demo.controlleer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
		public class MainController {
			
			//
			// inject from application.properties.
			@Value("${welcome.message}")
			private String message;
			
			@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
			//обработка запросов к коренному или index методом get
			//и передает модель методу
			public String index(Model model) {
				//добавить в модель атрибут
				model.addAttribute("message", message);
				//чтение будет их ресурсов
				return "index";
				//возврат имени файла - html
			}
		}