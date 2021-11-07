package com.yiado.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
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
	
	/*@Query(value = "SELECT DISTINCT j.jugador_id, j.jugador_name, j.jugador_pais, j.puntos_gobales,\n"
			+ "(select count(posicion) from inscripcion where posicion = 1 and jugador_id = j.jugador_id) AS oro,\n"
			+ "(select count(posicion) from inscripcion where posicion = 2 and jugador_id = j.jugador_id) AS plata,\n"
			+ "(select count(posicion) from inscripcion where posicion = 3 and jugador_id = j.jugador_id) AS bronce,\n"
			+ "(select min(posicion) from inscripcion where jugador_id = j.jugador_id) AS mejorPosicion,\n"
			+ "(select count(torneo_id) from inscripcion where jugador_id = j.jugador_id and puntos != 0) AS temporadas\n"
			+ "FROM jugador AS j WHERE j.status = ?", nativeQuery = true)
	public abstract List<Inscripcion> findByStatus(boolean status);*/
	
	public abstract Inscripcion findByIdAndStatus(long id, Boolean Status);
	
	public abstract	Inscripcion findByIdAndTorneoId(long id, long torneoId);
	
	public abstract Page<Inscripcion> findAll(Pageable pageable);
	
}
