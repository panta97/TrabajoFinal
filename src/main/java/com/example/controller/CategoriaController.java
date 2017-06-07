package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.Categoria;
import com.example.service.ICategoriaService;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {
	
	@Autowired
	private ICategoriaService categoriaService;
	
	@GetMapping
	public String findAll(Model model) {
		model.addAttribute("categorias", categoriaService.findAll());
		return "listcategoria";
	}
	
	@PostMapping("/new")
	public String newCategoria(Model model) {
		model.addAttribute("categoria", new Categoria());
		return "newcategoria";
	}
	
	@PostMapping("/search")
	public String findCategoryByName(@RequestParam(name = "texto") String texto, Model model){
		if (texto.equals("") || texto.isEmpty()){
			model.addAttribute("categorias", categoriaService.findAll());
			
		} else {
			model.addAttribute("categorias", categoriaService.findByNombre(texto));
		}
		return "listcategoria";
	}
	
	@PostMapping
	public String save(@Valid Categoria categoria, BindingResult result, Model model) {
		try {
			if (result.hasErrors()) {
				model.addAttribute("/message", result.toString());
				return "newcategoria";
			}
			this.categoriaService.save(categoria);
			return "redirect:/categorias";
			
			
		} catch (Exception e) {
			model.addAttribute("message", result.toString());
			return "error";
		}
	}
	
	@GetMapping("/{id}")
	public String findOnlyJustOneIfPossible(@PathVariable Long id, Model model){
		model.addAttribute("categoria", categoriaService.findOne(id));
		return "newcategoria";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteCategoria(@PathVariable("id") Long id){
		categoriaService.delete(id);
		return "redirect:/categorias";
	}
	
	
}
