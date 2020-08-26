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

/**
 * Definimos la clase Uusario como una entidad para su creacion en la base de datos
 * @author Paúl Arias
 *
 */
@Entity
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

	/*
	 * Metodos getters and setters
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<AlbumUsuario> getUsuario_id() {
		return usuario_id;
	}

	public void setUsuario_id(List<AlbumUsuario> usuario_id) {
		this.usuario_id = usuario_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
}
