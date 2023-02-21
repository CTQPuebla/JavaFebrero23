package com;

public class Cliente {
	
	String nombre;
	int idCliente;
	String direccion;
	String rfc;
	
	
	//Creacion de miembros por default de la clase 
	
	public Cliente () { // Creacion del constructor vacio
		
	}


	public Cliente(String nombre, int idCliente, String direccion, String rfc) { // Creacion del constructor con parametros
		super();
		this.nombre = nombre;
		this.idCliente = idCliente;
		this.direccion = direccion;
		this.rfc = rfc;
	}


	public String getNombre() {// Generacion de getters y setters
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


	@Override  // Generacion del to string 
	public String toString() {
		return "Cliente [nombre=" + nombre + ", idCliente=" + idCliente + ", direccion=" + direccion + ", rfc=" + rfc
				+ "]";
	}
	
	

}
