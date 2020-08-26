package com.avalith.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.avalith.modelo.Album;
import com.avalith.repo.IAlbumRepo;

/**
 * Clase que nos permite realizar la interaccion con la base de datos 
 * @author Paúl Arias
 *
 */
@Controller
public class AlbumServicio {

	/*
	 * Inyectamos la dependencia de la interface album
	 */
	@Autowired
	private IAlbumRepo album_repo;
	
	/*
	 * Metodo para guardar en la bd
	 */
	public void insertar(Album a){
		album_repo.save(a);
	}
		
	/*
	 * Metodo para listar los objetos
	 */
	public List<Album> listar(){	
		return album_repo.findAll();
	}
}
