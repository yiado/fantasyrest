package com.yiado.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="JUGADOR")
@Entity
public class Jugador implements Serializable {
	
public Jugador()  {
		
		
	}
	
	public Jugador(long id, String nombre, boolean status) {

		this.id = id;
		this.nombre = nombre;
		this.status = status;
	}
	
	@GeneratedValue
	@Id 
	@Column(name="jugador_id")
	private long id;
	@Column(name="jugador_name")
	private String nombre;
	@Column(name="jugador_status")
	private boolean status;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
