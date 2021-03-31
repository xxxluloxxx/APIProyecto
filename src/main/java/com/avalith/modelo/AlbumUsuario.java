package com.avalith.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Definimos la clase AlbumUsuario como una entidad para su creacion en la base de datos y a su vez tabla intermedia para guardar los albumes compartidos
 * @author Paúl Arias
 *
 */
@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
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
	
}
