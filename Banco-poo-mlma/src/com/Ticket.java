package com;

import java.util.Date;

public class Ticket {
	String sucursal;
	Date fecha;
	double montoOperado;
	int numCuenta;
	String operacion;
	int folio;
	
	public Ticket() {
		
	}

	public Ticket(String sucursal, Date fecha, double montoOperado, int numCuenta,String operacion, int folio) {
		super();
		this.sucursal = sucursal;
		this.fecha = fecha;
		this.montoOperado = montoOperado;
		this.numCuenta = numCuenta;
		this.operacion=operacion;
		this.folio = folio;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
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

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	@Override
	public String toString() {
		return "Ticket [sucursal=" + sucursal + ", fecha=" + fecha + ", montoOperado=" + montoOperado + ", numCuenta="
				+ numCuenta + ", folio=" + folio + "]";
	}
	
	
}
