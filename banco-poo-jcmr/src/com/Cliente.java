package com;

public class Cliente {

	String nombre;
	int idCliente;
	String direccion;
	String rfc;
	
	public Cliente() {
		
	}

	public Cliente(String nombre, int idCliente, String direccion, String rfc) {
		super();
		this.nombre = nombre;
		this.idCliente = idCliente;
		this.direccion = direccion;
		this.rfc = rfc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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
		return "Cliente [nombre=" + nombre + ", idCliente=" + idCliente + ", direccion=" + direccion + ", rfc=" + rfc
				+ "]";
	}
	
	
	
}
