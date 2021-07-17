package com.yiado.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="INSCRIPCION")
@Entity
public class Inscripcion implements Serializable{
	
	public Inscripcion()  {
			
			
		}
	
	public Inscripcion(long id, long jugador_id, long torneo_id, long posicion, long puntos,  boolean status) {

		this.id = id;
		this.jugador_id = jugador_id;
		this.torneo_id = torneo_id;
		this.posicion = posicion;
		this.puntos = puntos;
		this.status = status;
	}
	
	@GeneratedValue
	@Id 
	@Column(name="inscripcion_id")
	private long id;
	@Column(name="jugador_id")
	private long jugador_id;
	@Column(name="torneo_id")
	private long torneo_id;
	@Column(name="puntos")
	private long puntos;
	@Column(name="posicion")
	private long posicion;
	@Column(name="inscripcion_status")
	private boolean status;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getJugador_id() {
		return jugador_id;
	}

	public void setJugador_id(long jugador_id) {
		this.jugador_id = jugador_id;
	}

	public long getTorneo_id() {
		return torneo_id;
	}

	public void setTorneo_id(long torneo_id) {
		this.torneo_id = torneo_id;
	}

	public long getPuntos() {
		return puntos;
	}

	public void setPuntos(long puntos) {
		this.puntos = puntos;
	}

	public long getPosicion() {
		return posicion;
	}

	public void setPosicion(long posicion) {
		this.posicion = posicion;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
