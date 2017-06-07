package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.Servicio;
import com.example.service.ICategoriaService;
import com.example.service.IServicioService;

@Controller
@RequestMapping("/servicios")
public class ServicioController {
	
	@Autowired
	private IServicioService servicioService;
	
	@Autowired
	private ICategoriaService categoriaService;
	
	
	@GetMapping
	public String findAll(Model model){
		model.addAttribute("servicios", servicioService.findAll());
		return "listservicio";
	}
	
	
	@PostMapping("/new")
	public String newServicio(Model model){
		model.addAttribute("categorias", categoriaService.findAll());
		model.addAttribute("servicio", new Servicio());
		return "newservicio";
	}
	
	@PostMapping
	public String save(@Valid Servicio servicio, BindingResult result, Model model){
		try {
			if(result.hasErrors()){
				model.addAttribute("message", result.toString());
				model.addAttribute("categorias", categoriaService.findAll());
				
				return "newservicio";
			}
			
			this.servicioService.save(servicio);
			return "redirect:/servicios";
		} catch (Exception e) {
			model.addAttribute("message", result.toString());
			return "error";
		}
	}
	
	@GetMapping("/{id}")
	public String findOne(@PathVariable Long id, Model model){
		model.addAttribute("categorias", categoriaService.findAll());
		model.addAttribute("servicio", servicioService.findOne(id));
		return "newservicio";
	}
	
	@PostMapping("/search")
	public String findAllCategoriaNombre(@RequestParam(name="texto") String texto, Model model){
		
		model.addAttribute("servicios", servicioService.findByServicioCategoria(texto));
		
		return "listservicio";
	}
}
