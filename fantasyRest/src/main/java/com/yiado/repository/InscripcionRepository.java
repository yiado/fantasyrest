package com.yiado.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.yiado.entity.Inscripcion;
import com.yiado.entity.Torneo;

@Repository("InscripcionRepository")
public interface InscripcionRepository extends JpaRepository<Inscripcion, Serializable>, PagingAndSortingRepository<Inscripcion, Serializable>{

	
	public abstract Inscripcion findById(long id);
	
	public abstract List<Inscripcion> findByStatus(boolean status);
	
	public abstract List<Inscripcion> findByStatusAndTorneoId(boolean status, @RequestParam("torneo_id") Torneo torneoId);
	
	public abstract Inscripcion findByIdAndStatus(long id, Boolean Status);
	
	public abstract	Inscripcion findByIdAndTorneoId(long id, long torneoId);
	
	public abstract Page<Inscripcion> findAll(Pageable pageable);
	
}
