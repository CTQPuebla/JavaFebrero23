package com;

import java.util.Date;

public class Cajero implements IOperacionesBancarias {
	String ubicacion;
	int folio = 0;

	public Cajero() {

	}

	public Cajero(String ubicacion) {
		super();
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
		// Exista la cuenta
		// que la cantidad no exceda el maximo de la cuenta
		// Verificar que lo que hay mas el deposito no exceda el maximo
		Ticket comprobante = null;

		if (monto > cuenta.getMax()) {
			System.out.println("Cantidad exede el maximo permitido");
		} else if ((cuenta.getSaldoDisponible() + monto) > cuenta.getMax()) {
			System.out.println("Deposito exederia el maximo permitido");
		} else {
			//
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() + monto);
			return new Ticket(this.ubicacion, new Date(), monto, cuenta.getNumCuenta(), "Deposito",
					Integer.toString(this.folio++));
		}
		return comprobante;

	}

	@Override
	public Ticket retirar(Cuenta cuenta, double monto) {
		// TODO Auto-generated method stub

		// saldo suficiente
		// que no deje por debajo del minimo a la cuenta

		Ticket comprobante = null;

		if (cuenta.getSaldoDisponible() < monto) {
			System.out.println("Saldo insuficiente");
		} else if ((cuenta.getSaldoDisponible() - monto) < cuenta.getMin()) {
			System.out.println("Retiro execderia el minimo permitido");
		} else {
			//
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() - monto);
			return new Ticket(this.ubicacion, new Date(), monto, cuenta.getNumCuenta(), "Retiro",
					Integer.toString(this.folio++));

		}
		return null;
	}

	@Override
	public Ticket transferencia(Cuenta origen, Cuenta destino, double monto) {
	
		if (origen.getSaldoDisponible() < monto) {
			System.out.println("Saldo insuficiente");
		} else if ((origen.getSaldoDisponible() - monto) < cuenta.getMin()) {
			System.out.println("Retiro execderia el minimo permitido");
		}else if (monto > destino.getMax()) {
			System.out.println("Cantidad exede el maximo permitido");
		} else if ((destino.getSaldoDisponible() + monto) > destino.getMax()) {
			System.out.println("Deposito exederia el maximo permitido");
		}else {
			//Afectar saldos
			origen.setSaldoDisponible(origen.getSaldoDisponible() - monto);
			destino.setSaldoDisponible(destino.getSaldoDisponible() + monto);
			
			return new  Ticket(this.ubicacion, new Date(),
				monto, destino.getNumCuenta(), "Transferencia",	
				Integer.toString(this.folio++));	
					
		}
		
		
		
		return null;

	}

}
