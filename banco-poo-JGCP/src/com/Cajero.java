package com;

import java.util.Date;

public class Cajero implements IOperecionesBancarias{

	String ubicacion;
	int folio = 0;
	
	public Cajero(String string) {}
	
	public Cajero(String ubicacion, int folio) {
	
		this.ubicacion = ubicacion;
		this.folio = folio;
	

	}

	
	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	
		
	@Override
	public String toString() {
		return "Cajero [ubicacion=" + ubicacion + ", folio=" + folio + "]";
	







	}
	@Override
	public Ticket depositar(Cuenta cuenta, double monto) {
		//exista la cuenta
		//que la cantidad no exceda el maximo de la cuenta
		//verificar que lo que ya hay + el deposito no exceda el maximo
		Ticket comprobante = null ;
		
		if (monto>cuenta.getMax()) {
			System.out.println("cantidad excede el maxico permitido");
		}else if ((cuenta.getSaldodisponible()+monto) > cuenta.getMax()) {
			System.out.println("deposito excede el maximo permitido");
		}else {
			//							1000		5000			500
			cuenta.setSaldodisponible(cuenta.getSaldodisponible()+monto);
			
			
			return new Ticket(this.ubicacion, new Date(), monto, cuenta.getNumCuenta(),
					"deposito", Integer.toString(this.folio++));
		}

		return null;
	}
	@Override
	public Ticket retirar(Cuenta cuenta, double monto) {
		//saldo sufuciente
		//que no deje por el bajo del minimo de la cuenta
Ticket comprobante = null ;
		
		if (cuenta.getMax()<monto) {
			System.out.println("saldo insuficiente");
		}else if ((cuenta.getSaldodisponible()-monto) < cuenta.getMax()) {
			System.out.println("retiro excederia el monto permitido");
		}else {
			//							1000		5000			500
			cuenta.setSaldodisponible(cuenta.getSaldodisponible()-monto);
			
			
			return new Ticket(this.ubicacion, new Date(), monto, cuenta.getNumCuenta(),
					"retiro", Integer.toString(this.folio++));
			}
		

		return null;
	}
	@Override
	public Ticket transferencia(Cuenta origen, Cuenta destino, double monto) {
		//
		Ticket comprobante = null ;
		if (origen.getMax()<monto) {
			System.out.println("saldo insuficiente");
		}else if ((origen.getSaldodisponible()-monto) < origen.getMax()) {
			System.out.println("retiro excederia el minimo permitido");
		}else if (monto>destino.getMax()) {
			System.out.println("cantidad excede el maxico permitido");
		}else if ((destino.getSaldodisponible()+monto) > destino.getMax()) {
			System.out.println("deposito excede el maximo permitido");
		}else {
			
			//afectar saldo
			
			origen.setSaldodisponible(origen.getSaldodisponible()-monto);
			destino.setSaldodisponible(destino.getSaldodisponible()+monto);
			
			return new Ticket(this.ubicacion, new Date(),
					monto, destino.getNumCuenta(), "Transferencia",
					Integer.toString(this.folio++));
			
		}


		return comprobante;
	}
	
}
