package com.yiado.model;

import com.yiado.entity.Torneo;

public class TorneoModel {
	
	public TorneoModel() {
		
	}

	public TorneoModel(Torneo torneo) {
		this.id = torneo.getId();
		this.nombre = torneo.getNombre();
		this.tipo = torneo.getTipo();
		this.fecha = torneo.getFecha();
		this.status = torneo.getStatus();
		
	}
	 
	public TorneoModel(long id, String nombre, String tipo, String fecha, boolean status) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.fecha = fecha;
		this.status = status;
	}

	private long id;
	private String nombre;
	private String tipo;
	private String fecha;
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
