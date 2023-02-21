package com;

public class Cliente {
	
	String nombre;
	int idcliente;
	String direccion;
	String rfc;
	
	public Cliente() {}

	public Cliente(String nombre, int idcliente, String direccion, String rfc) {
		super();
		this.nombre = nombre;
		this.idcliente = idcliente;
		this.direccion = direccion;
		this.rfc = rfc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", idcliente=" + idcliente + ", direccion=" + direccion + ", rfc=" + rfc
				+ "]";
	}
	
	

}
