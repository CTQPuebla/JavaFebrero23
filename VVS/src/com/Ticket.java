package com;

import java.util.Date; // se agrega clase Date para la fecha ♥ 

public class Ticket { 
	
	String sucursal;
	Date fecha;
	double montoOperado;
	String numCuenta;
	String tipoOperacion;
int Folio;
	
 public Ticket() { // generacion constructor vacio 
	 
 }

public Ticket(String sucursal, Date fecha, double montoOperado, String numCuenta, String tipoOperacion, String folio) { //generacion constructor con todos los parametros 
	
	this.sucursal = sucursal;
	this.fecha = fecha;
	this.montoOperado = montoOperado;
	this.numCuenta = numCuenta;
	this.tipoOperacion = tipoOperacion;
	
}

public String getSucursal() { // generacion getters y setters 
	return sucursal;
}

public void setSucursal(String sucursal) {
	this.sucursal = sucursal;
}

public Date getFecha() {
	return fecha;
}

public void setFecha(Date fecha) {
	this.fecha = fecha;
}

public double getMontoOperado() {
	return montoOperado;
}

public void setMontoOperado(double montoOperado) {
	this.montoOperado = montoOperado;
}

public String getNumCuenta() {
	return numCuenta;
}

public void setNumCuenta(String numCuenta) {
	this.numCuenta = numCuenta;
}

public String getTipoOperacion() {
	return tipoOperacion;
}

public void setTipoOperacion(String tipoOperacion) {
	this.tipoOperacion = tipoOperacion;
}

@Override // generacion to string 
public String toString() {
	return "Ticket [sucursal=" + sucursal + ", fecha=" + fecha + ", montoOperado=" + montoOperado + ", numCuenta="
			+ numCuenta + ", tipoOperacion=" + tipoOperacion + ", Folio=" + Folio + "]";
}
 

}
