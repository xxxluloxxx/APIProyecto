package com.avalith.rest;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.avalith.modelo.Album;
import com.avalith.modelo.AlbumUsuario;
import com.avalith.modelo.Usuario;
import com.avalith.servicio.AlbumServicio;
import com.avalith.servicio.AlbumUsuarioServicio;

/**
 * Clase que maneja los metodos rest que se usaran para los albums
 * 
 * @author Paúl Arias
 *
 */
@Slf4j
@Validated
@RestController
@RequestMapping("/albums")
public class AlbumRest {

	/*
	 * Inyeccion de dependecias
	 */
	@Autowired
	private AlbumServicio album_servicio;

	@Autowired
	private AlbumUsuarioServicio albumusuario_servicio;

	@GetMapping("usuarios/{idAlbum}")
	public List<Usuario> usuarioAlbum(@PathVariable("idAlbum") String id_album) {
		String album = "";
		ArrayList<Album> albums = (ArrayList<Album>) album_servicio.listar();
		for (int i = 0; i < albums.size(); i++) {
			if ((albums.get(i).getId() + "").equals(id_album)) {
				album = albums.get(i).getTitle();
			}
		}
		ArrayList<AlbumUsuario> au = (ArrayList<AlbumUsuario>) albumusuario_servicio.listar();
		ArrayList<Usuario> usuarios = new ArrayList<>();
		for (int i = 0; i < au.size(); i++) {
			if (au.get(i).getAlbum_id().getTitle().equals(album)) {				
				Usuario us = Usuario.builder()
						.email(au.get(i).getUsuario_id().getEmail())
						.id(au.get(i).getUsuario_id().getId())
						.name(au.get(i).getUsuario_id().getName())
						.username(au.get(i).getUsuario_id().getUsername())
						.build();
				usuarios.add(us);
			}
		}
		return usuarios;
	}
}
