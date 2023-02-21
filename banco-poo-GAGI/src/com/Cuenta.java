package com;

public class Cuenta {
 double saldoDis;
 String tipoCuenta;
 String NumCuenta;
 String clabe;
 double min;
	 double max;
	 
	 public Cuenta() {
		 
	 }

	public Cuenta(double saldoDis, String tipoCuenta, String numCuenta, String clabe, double min, double max) {
		this.saldoDis = saldoDis;
		this.tipoCuenta = tipoCuenta;
		NumCuenta = numCuenta;
		this.clabe = clabe;
		this.min = min;
		this.max = max;
	}

	public double getSaldoDis() {
		return saldoDis;
	}

	public void setSaldoDis(double saldoDis) {
		this.saldoDis = saldoDis;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getNumCuenta() {
		return NumCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		NumCuenta = numCuenta;
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
		return "Cuenta [saldoDis=" + saldoDis + ", tipoCuenta=" + tipoCuenta + ", NumCuenta=" + NumCuenta + ", clabe="
				+ clabe + ", min=" + min + ", max=" + max + "]";
	}
	
	 
}
