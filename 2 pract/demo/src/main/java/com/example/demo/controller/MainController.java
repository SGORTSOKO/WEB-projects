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
			
			@RequestMapping(value = { "/", "index" }, method = RequestMethod.GET)
			public String index(Model model) {
				
				model.addAttribute("message", message);
				
				return "index";
			}
		}