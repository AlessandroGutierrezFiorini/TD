package com.turismo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.turismo.Pojo.Cabana;
import com.turismo.Service.CabanaService;
import com.turismo.Service.ComplejoService;
import com.turismo.Service.ImagenService;

@Controller
@RequestMapping(value="/cabana")
public class CabanaController {

	@Autowired
	private CabanaService cabanaService;
	
	@Autowired
	private ComplejoService complejoService;
	
	@Autowired
	private ImagenService imagenService;
	
	@RequestMapping(value = "/cargar",method = RequestMethod.GET) 
	public String cargarCabanas(Model model){
		model.addAttribute("formCabana",new Cabana());
		model.addAttribute("complejos", complejoService.findAll());
		model.addAttribute("imagenes", imagenService.findAll());
		return "/cabana/cargarCabana";
	}
	
	@RequestMapping(value = "/guardar",method = RequestMethod.POST) 
	public String cargarCabanas(Model model, @ModelAttribute("formCabana") Cabana cabana){
		cabanaService.saveOrUpdate(cabana);
		return "redirect:/cabana/cargar";
	}
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listarCabana(Model model){
		model.addAttribute("cabanas", cabanaService.findAll());
		return "/cabana/listarCabana";
	}
	
	@RequestMapping(value = "/update/{id}",method = RequestMethod.GET) 
	public String updateCabanas(Model model, @PathVariable("id") int id){
		Cabana cabana = cabanaService.findById(id);
		model.addAttribute("formCabana", cabana);
		model.addAttribute("complejos", complejoService.findAll());
		model.addAttribute("imagenes", imagenService.findAll());
		return "/cabana/updateCabana";
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteComplejo(Model model, @PathVariable("id") int id) {
		cabanaService.delete(cabanaService.findById(id));
		return "redirect:/cabana/listar";
	}
	
}
