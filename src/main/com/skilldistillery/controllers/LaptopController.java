package com.skilldistillery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.data.Laptop;
import com.skilldistillery.data.LaptopDAO;

@Controller
public class LaptopController {
	@Autowired
	LaptopDAO dao;

	@RequestMapping("index.do")
	public ModelAndView getIndex() {
		// get inventory of laptops
		// add them to model
		ModelAndView mv = new ModelAndView();
		List<Laptop> allLaptops = dao.getAllLaptops();
		mv.addObject("laptops", allLaptops);
		mv.setViewName("WEB-INF/index.jsp");

		return mv;
	}

	@RequestMapping("getLaptop.do")
	public String getLaptop(@RequestParam("id") int id, Model model) {
		Laptop laptopById = dao.getLaptopById(id);
		model.addAttribute("laptop", laptopById);
		return "WEB-INF/laptop.jsp";
	}
	
	@RequestMapping("addLaptop.do")
	public String addLaptop(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("seller") String seller,
			@RequestParam("year") int year, @RequestParam("price") double price, @RequestParam("ram") String ram,
			@RequestParam("processor") String processor, @RequestParam("hardDrive") String hardDrive) {
		//dao.add(new Laptop(id, name, seller, year, price, ram, processor, hardDrive));
		return "WEB-INF/addLaptop.jsp";
	} 
	
	@RequestMapping("deleteLaptop.do")
	public String deleteLaptop() {
		//Laptop laptopById = dao.getLaptopById(id);
		//model.addAttribute("laptop", laptopById);
		return "WEB-INF/deleteLaptop.jsp";
	}
	
	@RequestMapping("updateLaptop.do")
	public String updateLaptop() {
		//Laptop laptopById = dao.getLaptopById(id);
		//model.addAttribute("laptop", laptopById);
		return "WEB-INF/updateLaptop.jsp";
	}
	
	
	
	//public String addLaptop(@ModelAttribute ("laptop") Laptop laptop)
	// delete
	// edit

}
