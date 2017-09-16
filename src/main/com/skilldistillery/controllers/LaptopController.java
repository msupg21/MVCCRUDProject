package com.skilldistillery.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LaptopController {

	@RequestMapping("index.do")
	public String getIndex() {

		return "WEB-INF/index.jsp";
	}

}
