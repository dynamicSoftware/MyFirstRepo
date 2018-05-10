package com.jobcard.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobcard.management.dto.ServiceEngineer;

@Controller
public class UserRegistrationController {

	@Autowired
	private CityController cityController;
	
	@RequestMapping(value = "/engineer-registration-form")
	public String serviceEngineerRegister(ModelMap modelMap , @ModelAttribute("serviceEngineer")ServiceEngineer serviceEngineer) {
		modelMap.addAttribute("listOfCities", cityController.getListOfCities());
		
		return "service-engineer-registration";
	}

	@RequestMapping(value = "/engineer-registered",method=RequestMethod.POST)
	public String serviceEngineer(ModelMap modelMap,@ModelAttribute("serviceEngineer") ServiceEngineer serviceEngineer) {
		modelMap.addAttribute("info","This is my Registration");
		modelMap.addAttribute("service",serviceEngineer);
		System.out.println("Service Engineer Info : "+serviceEngineer);
		return "welcome";
	}
	
	/*@RequestMapping(value = "/operator-registration-form")
	public String operatorRegister1(@ModelAttribute("serviceEngineer") ServiceEngineer serviceEngineer) {
		return "service-engineer-registration";
	}

	@RequestMapping(value = "/service",method=RequestMethod.POST)
	public String operatorRegister(ModelMap modelMap,@ModelAttribute("serviceEngineer") ServiceEngineer serviceEngineer) {
		
		modelMap.addAttribute("info","This is my Registration");
		System.out.println("Service Engineer Info : "+serviceEngineer);
		return "welcome";
	}*/
	
}
