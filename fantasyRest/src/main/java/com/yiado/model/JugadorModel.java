package com.yiado.model;

import com.yiado.entity.Jugador;

public class JugadorModel {
	
	public JugadorModel() {
			
		}
	
	public JugadorModel(Jugador jugador) {
		this.id = jugador.getId();
		this.nombre = jugador.getNombre();
		this.pais = jugador.getPais();
		this.residencia = jugador.getResidencia();
		this.status = jugador.getStatus();
		this.puntosGlobales = jugador.getPuntosGlobales();
		
	}
	 
	public JugadorModel(long id, String nombre, boolean status, String pais, String residencia, long puntosGlobales) {
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.residencia = residencia;
		this.status = status;
		this.puntosGlobales = puntosGlobales;
	}
	
	private long id;
	private String nombre;
	private String pais;
	private String residencia;
	private boolean status;
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
