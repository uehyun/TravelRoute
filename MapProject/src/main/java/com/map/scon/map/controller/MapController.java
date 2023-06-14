package com.map.scon.map.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/map")
public class MapController {
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String goMap() {
		return "main";
	}

}
