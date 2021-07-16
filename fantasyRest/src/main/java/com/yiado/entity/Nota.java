package com.yiado.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="NOTA")
@Entity
//@XmlRootElement //Esto permite recibir peticiones xml
public class Nota implements Serializable {
	
	public Nota() {
		
		
	}
	
	public Nota(long id, String nombre, String titulo, String contenido) {

		this.id = id;
		this.nombre = nombre;
		this.titulo = titulo;
		this.contenido = contenido;
	}
	@GeneratedValue
	@Id 
	@Column(name="id_nota")
	private long id;
	@Column(name="name")
	private String nombre;
	@Column(name="titulo_nota")
	private String titulo;
	@Column(name="contenido_nota")
	private String contenido;
	
	
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
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	

}