package spring.bolsadeideas.springboot.form.app.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.bolsadeideas.springboot.form.app.model.domain.Usuario;

@Controller
public class FormControllers {
	
	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("titulo", "Form Usuario");
		return "form";
	}
	
	@PostMapping("/form")
	public String procesar(@Valid Usuario usuario ,Model model) {
		
		model.addAttribute("titulo", "Resultado del Form");
		model.addAttribute("usuario", usuario);
		return "resultado";
	}
}
