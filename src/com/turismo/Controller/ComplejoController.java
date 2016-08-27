package com.turismo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.turismo.Pojo.Complejo;
import com.turismo.Pojo.Usuario;
import com.turismo.Service.ComplejoService;
import com.turismo.Service.LugarService;
import com.turismo.Service.UsuarioService;

@Controller
@RequestMapping(value = "/complejo")
public class ComplejoController {

	@Autowired
	private ComplejoService complejoService;

	@Autowired
	private LugarService lugarService;

	@Autowired
	private UsuarioService usuarioService;

	@RequestMapping(value = "/mostrar", method = RequestMethod.GET)
	public String showComplejo(Model model) {
		model.addAttribute("usuarios", usuarioService.findAll());
		model.addAttribute("formComplejo", new Complejo());
		model.addAttribute("lugares", lugarService.findAll());
		return "/complejo/cargarComplejo";
	}

	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String cargarComplejo(Model model, @ModelAttribute("formComplejo") Complejo complejo) {
		complejoService.saveOrUpdate(complejo);
		return "redirect:/complejo/mostrar";
	}

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String updateComplejo(Model model) {

		model.addAttribute("complejos", complejoService.findAll());
		return "/complejo/listarComplejo";
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String updateUsuario(Model model, @PathVariable("id") int id) {
		Complejo complejo = complejoService.findById(id);
		model.addAttribute("formComplejo", complejo);
		model.addAttribute("usuarios", usuarioService.findAll());
		model.addAttribute("lugares", lugarService.findAll());
		return "/complejo/cargarComplejo";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteComplejo(Model model, @PathVariable("id") int id) {
		complejoService.delete(complejoService.findById(id));
		return "redirect:/complejo/listar";
	}
}
