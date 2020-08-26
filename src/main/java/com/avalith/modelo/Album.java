package com.avalith.modelo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * Definimos la clase Album como una entidad para su creacion en la base de
 * datos
 * 
 * @author Paúl Arias
 *
 */
@Entity
public class Album {

	/*
	 * LLave primaria de la entidad de bd
	 */
	@Id
	@GeneratedValue
	private Integer album_id;

	/*
	 * Id del album
	 */	
	private int id;

	/*
	 * Titulo del album
	 */
	@Column(name = "title", length = 200)
	private String title;

	/*
	 * Relacion con la tabla AlbumUsuarios para guardar los ids
	 */
	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "album_id")
	private List<AlbumUsuario> albums;

	/*
	 * Metodos getters and setters
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getAlbum_id() {
		return album_id;
	}

	public void setAlbum_id(Integer album_id) {
		this.album_id = album_id;
	}

	public List<AlbumUsuario> getAlbums() {
		return albums;
	}

	public void setAlbums(List<AlbumUsuario> albums) {
		this.albums = albums;
	}
}
