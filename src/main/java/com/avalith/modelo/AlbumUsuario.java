package com.avalith.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Definimos la clase AlbumUsuario como una entidad para su creacion en la base de datos y a su vez tabla intermedia para guardar los albumes compartidos
 * @author Paúl Arias
 *
 */
@Entity
public class AlbumUsuario {

	/*
	 * LLave primaria de la entidad de bd
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	/*
	 * Relacion con la tabla Albums para guardar los ids
	 */
	@ManyToOne
	@JoinColumn(name="album_id")
	private Album album_id;
	
	/*
	 * Relacion con la tabla Usuarios para guardar los ids
	 */
	@ManyToOne
	@JoinColumn(name="usuario_id")
	private Usuario usuario_id;

	/*
	 * Metodos getters and setters
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Album getAlbum_id() {
		return album_id;
	}

	public void setAlbum_id(Album album_id) {
		this.album_id = album_id;
	}

	public Usuario getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(Usuario usuario_id) {
		this.usuario_id = usuario_id;
	}
	
	
}
