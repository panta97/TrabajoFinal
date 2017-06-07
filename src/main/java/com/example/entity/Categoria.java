package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	@Column(name="NNOMBRE")
	@Size(min=4, max=45, message="nombre debe tener mas de 4 letras y menos de 45")
	private String nombre;
	
	public Categoria() {
		// TODO Auto-generated constructor stub
	}
	

	public Categoria(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
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

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
