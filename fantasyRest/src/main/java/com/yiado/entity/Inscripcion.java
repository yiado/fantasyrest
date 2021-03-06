package com.yiado.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="INSCRIPCION")
@Entity
public class Inscripcion implements Serializable{
	
	public Inscripcion()  {
			
			
		}
	
	public Inscripcion(long id, Jugador jugadorId, Torneo torneoId, long posicion, long puntos,  boolean status) {

		this.id = id;
		this.jugadorId = jugadorId;
		this.torneoId = torneoId;
		this.posicion = posicion;
		this.puntos = puntos;
		this.status = status;
	}
	
	@GeneratedValue
	@Id 
	@Column(name="inscripcion_id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name="jugador_id")
	Jugador jugadorId;
	
	@ManyToOne
	@JoinColumn(name="torneo_id")
	Torneo torneoId;
	
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
