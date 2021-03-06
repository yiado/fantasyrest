package com.yiado.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.yiado.entity.Jugador;

@Repository("JugadorRepository")
public interface JugadorRepository extends JpaRepository<Jugador, Serializable>, PagingAndSortingRepository<Jugador, Serializable>{

	public abstract Jugador findByNombre(String nombre);
	
	public abstract List<Jugador> findByStatusOrderByPuntosGlobalesDesc(boolean status);
	
	public abstract Jugador findByNombreAndStatus(String nombre, Boolean Status);
	
	public abstract	Jugador findByNombreAndId(String nombre, long id);
	
	public abstract Page<Jugador> findAll(Pageable pageable);
	
	
	
}
