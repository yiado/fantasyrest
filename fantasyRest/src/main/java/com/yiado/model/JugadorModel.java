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
		this.oro = jugador.getOro();
		this.plata = jugador.getPlata();
		this.bronce = jugador.getBronce();
		this.mejorPosicion = jugador.getMejorPosicion();
		this.temporadas = jugador.getTemporadas();
		
		
	}
	 
	public JugadorModel(long id, String nombre, boolean status, String pais, String residencia, long puntosGlobales, long oro, long plata, long bronce, long mejorPosicion, long temporadas) {
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.residencia = residencia;
		this.status = status;
		this.puntosGlobales = puntosGlobales;
		this.oro = oro;
		this.plata = plata;
		this.bronce = bronce;
		this.mejorPosicion = mejorPosicion;
		this.temporadas = temporadas;
	}
	
	private long id;
	private String nombre;
	private String pais;
	private String residencia;
	private boolean status;
	private long puntosGlobales;
	private long oro;
	private long plata;
	private long bronce;
	private long mejorPosicion;
	private long temporadas;
	
	
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

	public long getOro() {
		return oro;
	}

	public void setOro(long oro) {
		this.oro = oro;
	}

	public long getPlata() {
		return plata;
	}

	public void setPlata(long plata) {
		this.plata = plata;
	}

	public long getBronce() {
		return bronce;
	}

	public void setBronce(long bronce) {
		this.bronce = bronce;
	}

	public long getMejorPosicion() {
		return mejorPosicion;
	}

	public void setMejorPosicion(long mejorPosicion) {
		this.mejorPosicion = mejorPosicion;
	}

	public long getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(long temporadas) {
		this.temporadas = temporadas;
	}


}
