package com.avalith.modelo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Definimos la clase Album como una entidad para su creacion en la base de
 * datos
 * 
 * @author Paúl Arias
 *
 */
@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
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

}
