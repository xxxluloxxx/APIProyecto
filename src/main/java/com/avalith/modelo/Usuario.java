package com.avalith.modelo;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Definimos la clase Uusario como una entidad para su creacion en la base de datos
 * @author Paúl Arias
 *
 */
@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
	
	/*
	 * LLave primaria de la entidad de bd
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	
	/*
	 * Id del usuario
	 */
	private int id;

	/*
	 * Nombres de la persona
	 */
	@Column(name = "name", length = 50)	
	private String name;
	
	/*
	 * Usuario de la persona
	 */
	@Column(name = "username", length = 50)	
	private String username;

	/*
	 * Email de la persona
	 */
	@Column(name = "email", length = 50)	
	private String email;
	
	/*
	 * Relacion con la tabla AlbumUsuarios para guardar los ids
	 */
	@OneToMany(cascade = javax.persistence.CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="usuario_id")
	private List<AlbumUsuario> usuario_id;

}
