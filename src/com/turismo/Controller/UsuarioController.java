package com.turismo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.turismo.Pojo.Usuario;
import com.turismo.Service.UsuarioService;

@Controller
@RequestMapping(value = "/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value = "/mostrar",method = RequestMethod.GET) 
	public String showUsuario(Model model) {
		model.addAttribute("formUsuario",new Usuario());
		return "/usuario/cargarUsuario";
	}
	
	@RequestMapping(value = "/guardar",method = RequestMethod.POST) 
	public String showUsuario(Model model,@ModelAttribute("formUsuario") Usuario usuario) {
		usuarioService.saveOrUpdate(usuario);
		return "redirect:/usuario/mostrar";
	}
	
	@RequestMapping(value = "/listar",method = RequestMethod.GET) 
	public String showUsuarioList(Model model) {
		model.addAttribute("usuarios",usuarioService.ListAll());
		return "/usuario/listarUsuario";
	}
	
	@RequestMapping(value="/update/{id}",method = RequestMethod.GET)
	public String updateUsuario(Model model, @PathVariable("id") int id){
		Usuario usuario = usuarioService.findById(id);
		model.addAttribute("formUsuario",usuario);
		
		return "/usuario/cargarUsuario";
	}
	
	@RequestMapping(value="/enable/{id}",method = RequestMethod.GET)
	public String enableUsuario(Model model, @PathVariable("id") int id){

		usuarioService.enableUsuario(id);
		return "redirect:/usuario/listar";
	}
	
	@RequestMapping(value="/disable/{id}",method = RequestMethod.GET)
	public String disableUsuario(Model model, @PathVariable("id") int id){
		usuarioService.disableUsuario(id);
		
		return "redirect:/usuario/listar";
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteUsuario(Model model,@PathVariable("id") int id){
		Usuario usuario = usuarioService.findById(id);
		usuarioService.delete(usuario);
		return "redirect:/usuario/mostrar";
	}
}
