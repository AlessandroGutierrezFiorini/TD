package com.turismo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = "/") 
	public String showIndex() {
		return "index";
	}
	
	@RequestMapping(value = "/administrador") 
	public String showMenuAdmin() {
		return "/usuario/menuAdmin";
	}
	
	@RequestMapping(value = "/imagenUp") 
	public String showMenuImage() {
		return "/fileUpload";
	}
	
}
