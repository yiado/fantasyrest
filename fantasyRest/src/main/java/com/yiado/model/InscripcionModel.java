package com.yiado.model;

import com.yiado.entity.Inscripcion;
import com.yiado.entity.Jugador;
import com.yiado.entity.Torneo;

public class InscripcionModel {
	
	
	public InscripcionModel() {
		
	}

	public InscripcionModel(Inscripcion inscripcion) {
		
		this.id = inscripcion.getId();
		this.jugadorId = inscripcion.getJugadorId();
		this.torneoId = inscripcion.getTorneoId();
		this.posicion = inscripcion.getPosicion();
		this.puntos = inscripcion.getPuntos();
		this.status = inscripcion.getStatus();
		
	}
	 
	public InscripcionModel(long id, Jugador jugadorId, Torneo torneoId, long posicion, long puntos, boolean status) {
		this.id = id;
		this.jugadorId = jugadorId;
		this.torneoId = torneoId;
		this.posicion = posicion;
		this.puntos = puntos;
		this.status = status;
	}

	private long id;
	private Jugador jugadorId;
	private Torneo torneoId;
	private long posicion;
	private long puntos;
	private boolean status;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public Jugador getJugadorId() {
		return jugadorId;
	}

	public void setJugadorId(Jugador jugadorId) {
		this.jugadorId = jugadorId;
	}


	public Torneo getTorneoId() {
		return torneoId;
	}

	public void setTorneoId(Torneo torneoId) {
		this.torneoId = torneoId;
	}

	public long getPosicion() {
		return posicion;
	}

	public void setPosicion(long posicion) {
		this.posicion = posicion;
	}

	public long getPuntos() {
		return puntos;
	}

	public void setPuntos(long puntos) {
		this.puntos = puntos;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
