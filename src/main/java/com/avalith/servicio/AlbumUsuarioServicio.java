package com.avalith.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.avalith.modelo.AlbumUsuario;
import com.avalith.repo.IAlbumUsuarioRepo;

/**
 * Clase que nos permite realizar la interaccion con la base de datos 
 * @author Paúl Arias
 *
 */
@Controller
public class AlbumUsuarioServicio {

	/*
	 * Inyectamos la dependencia de la interface albumusuario
	 */
	@Autowired
	private IAlbumUsuarioRepo album_usuario_repo;
	
	/*
	 * Metodo para guardar en la bd
	 */
	public void insertar(AlbumUsuario a){
		album_usuario_repo.save(a);
	}
	
	/*
	 * Metodo para listar los objetos
	 */
	public List<AlbumUsuario> listar(){	
		return album_usuario_repo.findAll();
	}
}
