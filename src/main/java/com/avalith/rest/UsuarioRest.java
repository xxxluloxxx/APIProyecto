package com.avalith.rest;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.avalith.cliente.LlamadaServicioRestAlbum;
import com.avalith.cliente.LlamadaServicioRestUsuario;
import com.avalith.modelo.Album;
import com.avalith.modelo.AlbumUsuario;
import com.avalith.modelo.Usuario;
import com.avalith.servicio.AlbumServicio;
import com.avalith.servicio.AlbumUsuarioServicio;
import com.avalith.servicio.UsuarioServicio;

/**
 * Clase que maneja los metodos rest que se usaran para los usuarios
 * 
 * @author Paúl Arias
 *
 */
@RestController
@RequestMapping("/usuarios")
public class UsuarioRest {

	/*
	 * Inyeccion de dependecias
	 */
	@Autowired
	private UsuarioServicio usuario_servicio;

	@Autowired
	private AlbumServicio album_servicio;

	@Autowired
	private AlbumUsuarioServicio albumusuario_servicio;

	@Autowired
	private LlamadaServicioRestUsuario usuario_llamada;

	@Autowired
	private LlamadaServicioRestAlbum album_llamada;

	/**
	 * Metodo utilizado para compartir un album a un usuario
	 * 
	 * @param id_usuario al que se le va a compartir un album
	 * @param id_album   compartido
	 */
	@GetMapping("compartir/{idUsuario}/{idAlbum}")
	public String compartir(@PathVariable("idUsuario") String id_usuario, @PathVariable("idAlbum") String id_album) {
		Usuario usuario;
		Album album;
		try {
			usuario = usuario_llamada.llamadaUsuario(id_usuario);
		} catch (Exception e) {
			return "Error con el usuario " + id_usuario;
		}

		try {
			album = album_llamada.llamadaAlbum(id_album);
		} catch (Exception e) {
			return "Error con el album " + id_album;
		}
		try {
			int id = 0;
			ArrayList<Usuario> usuarios = (ArrayList<Usuario>) usuario_servicio.listar();
			for (int i = 0; i < usuarios.size(); i++) {
				if (usuarios.get(i).getId() == usuario.getId()) {
					id = usuarios.get(i).getUser_id();
				}
			}
			if (id == 0) {
				usuario_servicio.insertar(usuario);
			} else {
				usuario.setUser_id(id);
			}

			int id1 = 0;
			ArrayList<Album> albums = (ArrayList<Album>) album_servicio.listar();
			for (int i = 0; i < albums.size(); i++) {
				if (albums.get(i).getId() == album.getId()) {
					id1 = albums.get(i).getAlbum_id();
				}
			}
			if (id1 == 0) {
				album_servicio.insertar(album);
			} else {
				album.setAlbum_id(id1);
			}
			AlbumUsuario a = new AlbumUsuario();
			a.setAlbum_id(album);
			a.setUsuario_id(usuario);
			albumusuario_servicio.insertar(a);
			return "Exitosiso! Album " + id_album + " compartido con el usuario " + id_usuario;

		} catch (Exception e) {
			return "Error compartiendo album";
		}
	}
}
