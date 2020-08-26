package com.avalith.cliente;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.avalith.modelo.Usuario;

/**
 * Definimos la clase como un componente para utilizarla como un bean de spring
 * @author Paúl Arias
 *
 */
@Component
public class LlamadaServicioRestUsuario {

	/**
	 * Este metodo realiza una llamada al servicio rest de jsonplaceholder y
	 * consumir los datos de los usuarios.
	 * 
	 * @param id es la llave primaria del usuario a buscar con el servicio rest
	 * @return Un objeto tipo usuario
	 */
	public Usuario llamadaUsuario(String id) {
		RestTemplate template = new RestTemplate();
		Usuario usuario = template.getForObject("https://jsonplaceholder.typicode.com/users/" + id, Usuario.class);
		return usuario;
	}
}
