package com.yiado.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="Usuario") 
public class Usuario implements Serializable {
	
	@GeneratedValue
	@Id
	@Column(name="usuario_id")
	private long id;
	
	@Column(name="usuario_nombre", unique =  true)
	private String nombre;
	
	@Column(name="usuario_pass")
	private String pass;
	
	@Column(name="usuario_rol")
	private Byte rol;
	
	@Column(name="usuario_status")
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

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Byte getRol() {
		return rol;
	}

	public void setRol(Byte rol) {
		this.rol = rol;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
