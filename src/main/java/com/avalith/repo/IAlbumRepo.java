package com.avalith.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avalith.modelo.Album;

/**
 * Interfaz que extiende de JPA para utilizarla como repositorio de base de datos
 * @author Paúl Arias
 *
 */
public interface IAlbumRepo extends JpaRepository<Album, Integer>{

}
