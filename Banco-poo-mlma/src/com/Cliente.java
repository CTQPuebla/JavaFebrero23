package com;

public class Cliente {
	String nombre;
	int idCliente;
	String telefono;
	String direccion;
	String RFC;
	String fechaNacimiento;
	Cuenta cuenta;
	
	public Cliente() {
		
	}

	public Cliente(String nombre, int idCliente, String telefono, String direccion, String rFC,
			String fechaNacimiento, Cuenta cuenta) {
		super();
		this.nombre = nombre;
		this.idCliente = idCliente;
		this.telefono = telefono;
		this.direccion = direccion;
		RFC = rFC;
		this.fechaNacimiento = fechaNacimiento;
		this.cuenta = cuenta;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRFC() {
		return RFC;
	}

	public void setRFC(String rFC) {
		RFC = rFC;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", idCliente=" + idCliente + ", telefono=" + telefono + ", direccion="
				+ direccion + ", RFC=" + RFC + ", fechaNacimiento=" + fechaNacimiento + ", cuenta=" + cuenta + "]";
	}
	
}
