package com.turismo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.turismo.Pojo.Lugar;
import com.turismo.Service.LugarService;

@Controller
@RequestMapping(value="/lugar")
public class LugarController {
	
	@Autowired
	private LugarService lugarService;
	
	@RequestMapping(value="/listar",method = RequestMethod.GET)
	public String listarLugar(@RequestParam(value = "page", required = false) int page, Model model, @ModelAttribute("resultado") String resultado){
		
		
		int startpage = (int) (page - 5 > 0?page - 5:1);
	    int endpage = startpage + 10;
	    List<Lugar> lugares = lugarService.ListAllPage(page);
	    lugares.toString();
	    model.addAttribute("lugares",lugares);
	    //model.addAttribute("employees", this.employeeService.getEmployees(page));

	    model.addAttribute("startpage",startpage);
	    model.addAttribute("endpage",endpage);
		return "/lugar/listarLugar";
	}
	
	@RequestMapping(value="/cargar", method = RequestMethod.GET)
	public String cargarLugar(Model model){
		
		model.addAttribute("formLugar", new Lugar());
		
		return "/lugar/cargarLugar";
	}

	@RequestMapping(value="/cargar", method= RequestMethod.POST)
	public String cargarLugar(Model model, @ModelAttribute("formLugar") Lugar lugar){
		
		lugarService.saveOrUpdate(lugar);
		return "redirect:/lugar/listar";
	}
	
	@RequestMapping(value="/update/{id}", method =RequestMethod.GET)
	public String updateLugar(Model model, @PathVariable("id") int id){
		model.addAttribute("formLugar",lugarService.findById(id));
		return "/lugar/updateLugar";
	}
	
	@RequestMapping(value="/delete/{id}",method= RequestMethod.GET)
	public String deleteLugar(Model model, @PathVariable("id") int id, RedirectAttributes re){
		try {
			lugarService.delete(lugarService.findById(id));	
		} catch (Exception e) {
			re.addFlashAttribute("resultado","ERROR al eliminar -> (ver complejos)");
		}
		
		return "redirect:/lugar/listar";
	}

}
