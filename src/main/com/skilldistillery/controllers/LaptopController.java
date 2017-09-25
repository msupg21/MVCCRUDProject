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
		mv.setViewName("index");
		return mv;
	}

	@RequestMapping("getLaptop.do")
	public String getLaptop(@RequestParam("id") int id, Model model) {
		Laptop laptopById = dao.getLaptopById(id);
		model.addAttribute("laptop", laptopById);
		return "laptop";
	}

	@RequestMapping("addLaptop.do")
	public ModelAndView addLaptop(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("seller") String seller, @RequestParam("year") int year, @RequestParam("price") double price,
			@RequestParam("ram") String ram, @RequestParam("processor") String processor,
			@RequestParam("hardDrive") String hardDrive) {
		ModelAndView mv = new ModelAndView();
		Laptop laptop = new Laptop(id, name, seller, year, price, ram, processor, hardDrive);
		dao.add(laptop);
		mv.addObject("l", laptop); // 'l' is just a reference to the object
		// when using a jsp view, should always pass a reference to the object and the
		// object.
		List<Laptop> allLaptops = dao.getAllLaptops();
		mv.addObject("laptops", allLaptops);
		mv.setViewName("index");
		return mv;
	}

	@RequestMapping("viewAddLaptop.do") // need a method that leads to each jsp
	public ModelAndView test() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addLaptop");
		return mv;
	}

	@RequestMapping("deleteLaptop.do")
	public ModelAndView deleteLaptop(@RequestParam("id") int id) { // delete by stock number
		ModelAndView mv = new ModelAndView();
		// use the delete method in the dao to remove the object using id/stockNum
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("updateLaptop.do")
	public ModelAndView updateLaptop(@RequestParam("id") int id) { // update by stock number
		ModelAndView mv = new ModelAndView();
		// I think this is work same way the add laptop method works
		// we should requestParam the same laptop attributes, but then have a new laptop
		// created after the old one is deleted and just assign the same stock id so it
		// looks like the same object.  Or maybe you know a better way?
		// we can use same form from addLaptop jsp

		mv.setViewName("index");
		return mv;
	}

}
