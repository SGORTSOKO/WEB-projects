package com.example.demo.controlleer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.example.demo.Phone;


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
	    	List<Phone> lp = new ArrayList<>();
	    	lp.add(new Phone("Абросимов", "111111"));
	    	lp.add(new Phone("Нечаев", "22222"));
	    	lp.add(new Phone("Васильев", "33333"));
	    	
	        model.addAttribute("message", message);
	        model.addAttribute("phones", lp);
	 
	        return "index";
	    }

		}