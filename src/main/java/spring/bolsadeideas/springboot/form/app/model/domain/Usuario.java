package spring.bolsadeideas.springboot.form.app.model.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Usuario {
	
	@NotEmpty(message = "el nombre no puede estar vacio")
	private String nombre;
	@NotEmpty()
	private String apellido;
	@Pattern(regexp = "[0-9]{2}[.][0-9]{3}[.][0-9]{3}[-][aA-zZ]{1}")
	private String identificador;
	@NotEmpty()
	@Size(min = 3, max = 8)
	private String username;
	@NotEmpty()
	private String password;
	@NotEmpty(message = "el email no puede estar vacio")
	@Email
	private String email;
	
	public Usuario() {
	}
	
	
	public String getIdentificador() {
		return identificador;
	}


	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
