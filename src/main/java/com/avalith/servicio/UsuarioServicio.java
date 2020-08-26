package com.avalith.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.avalith.modelo.Usuario;
import com.avalith.repo.IUsuarioRepo;

/**
 * Clase que nos permite realizar la interaccion con la base de datos
 * 
 * @author Paúl Arias
 *
 */
@Controller
public class UsuarioServicio {

	/*
	 * Inyectamos la dependencia de la interface usuario
	 */
	@Autowired
	private IUsuarioRepo usuario_repo;

	/*
	 * Metodo para guardar en la bd
	 */
	public void insertar(Usuario p) {
		usuario_repo.save(p);
	}

	/*
	 * Metodo para listar lso objetos
	 */
	public List<Usuario> listar() {
		return usuario_repo.findAll();
	}
}
