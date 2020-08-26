package com.avalith.cliente;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.avalith.modelo.Album;

/**
 * Definimos la clase como un componente para utilizarla como un bean de spring
 * @author Paúl Arias
 *
 */
@Component
public class LlamadaServicioRestAlbum {

	/**
	 * Este metodo realiza una llamada al servicio rest de jsonplaceholder y
	 * consumir los datos de los albums.
	 * 
	 * @param id es la llave primaria del album a buscar con el servicio rest
	 * @return Un objeto tipo album
	 */
	public Album llamadaAlbum(String id) {
		RestTemplate template = new RestTemplate();
		Album album = template.getForObject("https://jsonplaceholder.typicode.com/albums/" + id, Album.class);
		return album;
	}
}
