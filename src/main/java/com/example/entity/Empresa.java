package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Empresa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@JoinColumn(name="idEmpresa")
	private Long id;
	@JoinColumn(name="NNombre")
	private String nombre;
	@JoinColumn(name="RazonSocial")
	private String razonSocial;
	@JoinColumn(name="RUC")
	private String ruc;
	@JoinColumn(name="E_mail")
	private String email;
	@JoinColumn(name="Direccion")
	private String direccion;
	@JoinColumn(name="Telefono")
	private String telefono;
	@JoinColumn(name="PaginaWeb")
	private String pagWeb;
	@JoinColumn(name="Contraseña")
	private String password;

	
	public Empresa() {
		// TODO Auto-generated constructor stub
	}

	public Empresa(Long id, String nombre, String razonSocial, String ruc, String email, String direccion,
			String telefono, String pagWeb, String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.razonSocial = razonSocial;
		this.ruc = ruc;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.pagWeb = pagWeb;
		this.password = password;
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


	public String getRazonSocial() {
		return razonSocial;
	}


	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}


	public String getRuc() {
		return ruc;
	}


	public void setRuc(String ruc) {
		this.ruc = ruc;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getPagWeb() {
		return pagWeb;
	}


	public void setPagWeb(String pagWeb) {
		this.pagWeb = pagWeb;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nombre=" + nombre + ", razonSocial=" + razonSocial + ", ruc=" + ruc + ", email="
				+ email + ", direccion=" + direccion + ", telefono=" + telefono + ", pagWeb=" + pagWeb + ", password="
				+ password + "]";
	}
	
	
}
