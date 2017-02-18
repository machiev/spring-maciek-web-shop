package com.machiev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.machiev.domain.Car;
import com.machiev.service.CarService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {
	@Autowired
	private CarService carService;

	@RequestMapping(value = "/car/list", method = RequestMethod.GET)
	public void carList(Model model) {
		List<Car> carList = carService.findAll();
		model.addAttribute("carList", carList);
	}

	@RequestMapping(value = "/car/{id:.+}", method = RequestMethod.GET)
	public ModelAndView hello(@PathVariable("id") Long id) {
		Car car = carService.getById(id);

		ModelAndView model = new ModelAndView();
		model.setViewName("car/details");
		model.addObject("car", car);

		return model;
	}
}