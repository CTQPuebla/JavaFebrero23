package com;

import java.util.Date;

public class Ticket {
	
	String sucursal;
	Date fecha;
	double montoOperado;
	String tipoOperacion;
	String numCuenta;
	String folio;
	
	public Ticket() {
		
	}


	public Ticket(String sucursal, Date fecha, double montoOperado, String tipoOperacion, String numCuenta,
			String folio) {

		this.sucursal = sucursal;
		this.fecha = fecha;
		this.montoOperado = montoOperado;
		this.tipoOperacion = tipoOperacion;
		this.numCuenta = numCuenta;
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


	public String getTipoOperacion() {
		return tipoOperacion;
	}


	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}


	public String getNumCuenta() {
		return numCuenta;
	}


	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}


	public String getFolio() {
		return folio;
	}


	public void setFolio(String folio) {
		this.folio = folio;
	}


	@Override
	public String toString() {
		return "Ticket [sucursal=" + sucursal + ", fecha=" + fecha + ", montoOperado=" + montoOperado
				+ ", tipoOperacion=" + tipoOperacion + ", numCuenta=" + numCuenta + ", folio=" + folio + "]";
	}



	
	}
	


