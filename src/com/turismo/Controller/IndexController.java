package com.turismo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.turismo.Service.LugarService;

@Controller
public class IndexController {

	@Autowired
	private LugarService lugarService;
		
	
	@RequestMapping(value = "/", method = RequestMethod.GET) 
	public String showIndex() {
		return "index";
	}
	
	@RequestMapping(value = "/administrador", method = RequestMethod.GET) 
	public String showMenuAdmin() {
		return "/usuario/menuAdmin";
	}
	
	@RequestMapping(value = "/lugares", method = RequestMethod.GET) 
	public String showLugares(Model model) {
		model.addAttribute("lugares",lugarService.findAll());
		return "/lugar/lugaresIndex";
	}
	
}
