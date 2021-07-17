package com.yiado.model;

import com.yiado.entity.Inscripcion;

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
	 
	public InscripcionModel(long id, long jugadorId, long torneoId, long posicion, long puntos, boolean status) {
		this.id = id;
		this.jugadorId = jugadorId;
		this.torneoId = torneoId;
		this.posicion = posicion;
		this.puntos = puntos;
		this.status = status;
	}

	private long id;
	private long jugadorId;
	private long torneoId;
	private long posicion;
	private long puntos;
	private boolean status;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getJugadorId() {
		return jugadorId;
	}

	public void setJugadorId(long jugadorId) {
		this.jugadorId = jugadorId;
	}

	public long getTorneoId() {
		return torneoId;
	}

	public void setTorneoId(long torneoId) {
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
