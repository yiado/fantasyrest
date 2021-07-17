package com.yiado.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.yiado.entity.Torneo;

@Repository("TorneoRepository")
public interface TorneoRepository extends JpaRepository<Torneo, Serializable>, PagingAndSortingRepository<Torneo, Serializable>{
	
	public abstract Torneo findByNombre(String nombre);
	
	public abstract List<Torneo> findByStatus(boolean status);
	
	public abstract Torneo findByNombreAndStatus(String nombre, Boolean Status);
	
	public abstract	Torneo findByNombreAndId(String nombre, long id);
	
	public abstract Torneo findByFecha(String fecha);
	
	public abstract List<Torneo> findByTipo(String tipo);
	
	public abstract Page<Torneo> findAll(Pageable pageable);

}
