package spring.bolsadeideas.springboot.form.app.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import spring.bolsadeideas.springboot.form.app.model.domain.Usuario;

@Controller
@SessionAttributes("usuario") //se modifica la clase paraque pueda paasar al formulario atributos/propiedades que no hayan sido pasadas al form, ej:id. Del otro caso se pasará como null.
public class FormControllers {
	
	@GetMapping("/form")
	public String form(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Agustin");
		usuario.setApellido("Galarza");
		usuario.setIdentificador("70.808.014-k");
		model.addAttribute("titulo", "Form Usuario");
		model.addAttribute("usuario",usuario);
		return "form";
	}
	
	@PostMapping("/form")
	public String procesar(@Valid Usuario usuario , BindingResult result, Model model, SessionStatus status) {
		
		model.addAttribute("titulo", "Resultado del Form");
		
		if (result.hasErrors()) {
//			1- manejo de errores de forma manual, se encuentra en el punto de abajo
			return "form";
		}
		
		model.addAttribute("usuario", usuario);
		status.setComplete();
		return "resultado";
	}
}


//1.
//Map<String, String> errores = new HashMap<>();
//result.getFieldErrors().forEach(err ->{
//	errores.put(err.getField(),"El campo ".concat(err.getField()).concat(" ").concat(err.getDefaultMessage()));
//});
//model.addAttribute("error",errores);
