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
	
	public Jugador(long id, String nombre, boolean status, String pais, String residencia, long puntosGlobales) {

		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.residencia = residencia;
		this.status = status;
		this.puntosGlobales = puntosGlobales;
	}
	
	@GeneratedValue
	@Id 
	@Column(name="jugador_id")
	private long id;
	@Column(name="jugador_name")
	private String nombre;
	@Column(name="jugador_pais")
	private String pais;
	@Column(name="residencia_name")
	private String residencia;
	@Column(name="jugador_status")
	private boolean status;
	@Column(name="puntos_gobales")
	private long puntosGlobales;
	
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

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getResidencia() {
		return residencia;
	}

	public void setResidencia(String residencia) {
		this.residencia = residencia;
	}

	public long getPuntosGlobales() {
		return puntosGlobales;
	}

	public void setPuntosGlobales(long puntosGlobales) {
		this.puntosGlobales = puntosGlobales;
	}
}
