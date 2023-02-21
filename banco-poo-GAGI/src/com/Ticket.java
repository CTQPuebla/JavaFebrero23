package com;

import java.util.Date;

public class Ticket {

	
	String sucursal;
	Date fecha;
	double montoOperado;
	String numCuenta;
	String tipOperacion;
	String folio="0";
	
	
	public Ticket() {
		
	}
	public Ticket(String sucursal, Date fecha, double montoOperado, String numCuenta, String tipOperacion,
			String folio) {
		this.sucursal = sucursal;
		this.fecha = fecha;
		this.montoOperado = montoOperado;
		this.numCuenta = numCuenta;
		this.tipOperacion = tipOperacion;
		this.folio = folio;
	}
	public String getSucursal() {
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
	public String getTipOperacion() {
		return tipOperacion;
	}
	public void setTipOperacion(String tipOperacion) {
		this.tipOperacion = tipOperacion;
	}
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	@Override
	public String toString() {
		return "Ticket [sucursal=" + sucursal + ", fecha=" + fecha + ", montoOperado=" + montoOperado + ", numCuenta="
				+ numCuenta + ", tipOperacion=" + tipOperacion + ", folio=" + folio + "]";
	}
	
}
