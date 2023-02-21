package com;

import java.util.Date;

public class Cajero implements  IOperacionesBancarias {

	int folio=0;
	String ubicacion;

		
	public Cajero() {
	}

	public Cajero(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	@Override
	public String toString() {
		return "Cajero [ubicacion=" + ubicacion + "]";
	}

	
	
	@Override
	public Ticket depositar(Cuenta cuenta, double monto) {
		//Exista la cuenta
		//La cantidad no exceda al maximo de la cuenta
		//Verificar que lo que ya hay+ el deposito no exceda el maximo
		
		Ticket comprobante = null;
		
		if (monto>cuenta.getMax()) {
			System.out.println("Cantidad excede el maximo permitido");	
		} else if ((cuenta.getSaldoDisponible()+ monto) >cuenta.getMax()) {
			System.out.println("Deposito exederia el maximo permitido");
			
		} else {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() + monto);
			return new Ticket (this.ubicacion, new Date (), monto, cuenta.getNumCuenta(),"Deposito", Integer.toString(this.folio ++));
		}
		return comprobante;
	}

	
	
	@Override
	public Ticket retirar(Cuenta cuenta, double monto) {
		
		Ticket comprobante = null;
		
		//Saldo suficiente
		//que no deje por debajo del minimo a la cuenta
		
		double saldoMinimo = 500;
		
		if (monto > cuenta.getMax()) {
			System.out.println("Cantidad excede el maximo permitido");
		} else if ((cuenta.getSaldoDisponible() - monto) <= saldoMinimo) {
			System.out.println("Cantidad rebasa el saldo disponible");
			
		} else {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() - monto);
			return new Ticket (this.ubicacion, new Date(), monto, cuenta.getNumCuenta(),"Retiro", Integer.toString(this.folio++));
		}

		return comprobante;
	}

	
	
	@Override
	public Ticket transferencia(Cuenta origen, Cuenta destino, double monto) {
		
		Ticket comprobante = null;
		
		// RETIRO
		if (monto > origen.getMax()) {
			System.out.println("Cantidad excede el maximo permitido");
		} else if ((origen.getSaldoDisponible() - monto) <= origen.getMin()) {
			System.out.println("Cantidad rebasa el saldo disponible");
		
		// DEPOSITO
		} else if (monto > destino.getMax()) {
			System.out.println("Cantidad excede el maximo permitido");
		} else if ((destino.getSaldoDisponible() + monto) > destino.getMax()) {
			System.out.println("Deposito excederia el maximo permitido");
		} else {
		
		// AFECTAR SALDOS
			origen.setSaldoDisponible(origen.getSaldoDisponible() - monto);
			origen.setSaldoDisponible(destino.getSaldoDisponible() + monto);
			
		// REGRESAR TICKET	
			return new Ticket (this.ubicacion,new Date(), monto, destino.getNumCuenta(), "Transferencia", Integer.toString(this.folio++));
		}
		return comprobante;
	}

}