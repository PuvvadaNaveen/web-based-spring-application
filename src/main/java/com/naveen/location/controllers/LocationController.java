package com.naveen.location.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.naveen.location.entities.Location;
import com.naveen.location.service.LocationService;

@Controller
public class LocationController {

	@Autowired
	LocationService service;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}

	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap map) {
		Location locationSaved = service.saveLocation(location);
		String msg = "Location saved with id: " + locationSaved.getId();
		map.addAttribute("msg", msg);
		return "createLocation";
	}
}