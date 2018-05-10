package com.jobcard.management.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;

@Controller
public class CityController {

	private static List<String> listOfCities=null;
	
	static{
		listOfCities=new ArrayList<String>();
		listOfCities.add("Indore");
		listOfCities.add("Bhopal");
		listOfCities.add("Jabalpur");
		listOfCities.add("Barwani");
		listOfCities.add("Manawar");
		listOfCities.add("Dhar");
	}
	
//	@RequestMapping("/")
	public List<String> getListOfCities() {
		return listOfCities;
	}
	
}
