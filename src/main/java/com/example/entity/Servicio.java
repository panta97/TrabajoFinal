package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Servicio {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String nombre;
	
	private String descripcion;
	
	@ManyToOne
	private Empresa empresa;
	
	@ManyToOne
	private Categoria categoria;
	
	public Servicio() {
		// TODO Auto-generated constructor stub 
	}

	
	public Servicio(Long id, String nombre, String descripcion, Empresa empresa, Categoria categoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.empresa = empresa;
		this.categoria = categoria;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Servicio [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", empresa=" + empresa
				+ ", categoria=" + categoria + "]";
	}
	
	
}
