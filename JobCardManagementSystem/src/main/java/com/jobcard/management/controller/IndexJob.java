package com.jobcard.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobcard.management.dto.ServiceEngineer;

@Controller
public class IndexJob {

	@RequestMapping(value = "/")
	public String indexPage(@ModelAttribute("serviceEngineer") ServiceEngineer serviceEngineer) {
		return "index-page";
	}
	
}
