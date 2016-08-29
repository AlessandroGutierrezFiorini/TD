package com.turismo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.turismo.Pojo.Lugar;
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
	public String showLugares(Model model, @RequestParam(value = "page",defaultValue="0",required=false) int page) {
		//model.addAttribute("lugares",lugarService.findAll());
		List<Lugar> lugares = lugarService.ListAllPage(page);
		int numList = lugares.size()/5;
		int startpage = (int) (page - 5 > 0?page - 5:1);
	    int endpage = startpage + numList;
	    //lugares.toString();
	    model.addAttribute("lugares",lugares);
	    //model.addAttribute("employees", this.employeeService.getEmployees(page));

	    model.addAttribute("startpage",startpage);
	    model.addAttribute("endpage",endpage);
	    model.addAttribute("page",page);

		
		return "/lugar/lugaresIndex";
	}
	
}
