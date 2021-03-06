package com.yiado.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="TORNEO")
@Entity
public class Torneo implements Serializable {
	
public Torneo()  {
		
		
	}
	
	public Torneo(long id, String nombre, String tipo, String fecha, boolean status) {

		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.fecha = fecha;
		this.status = status;
	}
	
	@GeneratedValue
	@Id 
	@Column(name="torneo_id")
	private long id;
	@Column(name="torneo_name")
	private String nombre;
	@Column(name="torneo_tipo")
	private String tipo;
	@Column(name="torneo_fecha")
	private String fecha;
	@Column(name="torneo_status")
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
