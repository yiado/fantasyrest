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
	
	public Jugador(long id, String nombre, boolean status, String pais, String residencia, long puntosGlobales, long oro, long plata, long bronce, long mejorPosicion, long temporadas) {

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
	@Column(name="oro")
	private long oro;
	@Column(name="plata")
	private long plata;
	@Column(name="bronce")
	private long bronce;
	@Column(name="mejor_posicion")
	private long mejorPosicion;
	@Column(name="tempradas")
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

	public void setMejorPosicion(long mejor_posicion) {
		this.mejorPosicion = mejor_posicion;
	}

	public long getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(long temporadas) {
		this.temporadas = temporadas;
	}
}
