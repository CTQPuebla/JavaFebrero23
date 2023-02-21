package com;

import java.util.Arrays;

public class Cuenta {
	
	double saldoDisp;
	String tipoCuenta;
	String numCuetna;
	String clabe;
	

	
	double min;
	double max;
	
	public Cuenta(){}

	public Cuenta(double saldoDisp, String tipoCuenta, String numCuetna, String clabe, double min,
			double max) {
		super();
		this.saldoDisp = saldoDisp;
		this.tipoCuenta = tipoCuenta;
		this.numCuetna = numCuetna;
		this.clabe = clabe;
		this.min = min;
		this.max = max;
	}

	public double getSaldoDisp() {
		return saldoDisp;
	}

	public void setSaldoDisp(double saldoDisp) {
		this.saldoDisp = saldoDisp;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getNumCuetna() {
		return numCuetna;
	}

	public void setNumCuetna(String numCuetna) {
		this.numCuetna = numCuetna;
	}

	public String getClabe() {
		return clabe;
	}

	public void setClabe(String clabe) {
		this.clabe = clabe;
	}



	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	@Override
	public String toString() {
		return "Cuenta [saldoDisp=" + saldoDisp + ", tipoCuenta=" + tipoCuenta + ", numCuetna=" + numCuetna + ", clabe="
				+ clabe + ",  min=" + min + ", max=" + max + "]";
	}
	

}
