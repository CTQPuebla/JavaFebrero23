package com;

import java.util.Date;

public class Cajero implements IOperacionesBancarias {

	int folio = 0;
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
		// TODO Auto-generated method stub
		// Exista la cuenta
		// que la cantidad no exceda el máximo de la cuenta
		// Verificar que lo que hay + el depósito no exceda el máximo

		Ticket comprobante = null;
		if (monto > cuenta.getMax()) {
			System.out.println("Cantidad excede el máximo permitido");

		} else if ((cuenta.getSaldoDisponible() + monto) > cuenta.getMax()) {
			System.out.println("Deposito excedería el máximo permitido");
		} else {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() + monto);
			return new Ticket(this.ubicacion, new Date(), monto, cuenta.getNumCuenta(), "Depósito",
					Integer.toString(this.folio++));
		}

		return comprobante;

	}

	@Override
	public Ticket retirar(Cuenta cuenta, double monto) {
		// TODO Auto-generated method stub

		// saldo suficiente
		// que no deje por debajo del mínimo a la cuenta

		Ticket comprobante = null;
		if (cuenta.getSaldoDisponible() < monto) {
			System.out.println("Saldo insuficiente");
		} else if ((cuenta.getSaldoDisponible() - monto) < cuenta.getMin()) {
			System.out.println("Retiro excedería el mínimo permitido");
		} else {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() - monto);
			return new Ticket(this.ubicacion, new Date(), monto, cuenta.getNumCuenta(), "Retiro",
					Integer.toString(this.folio++));
		}

		return comprobante;

	}

	@Override
	public Ticket transferencia(Cuenta origen, Cuenta destino, double monto) {
		// TODO Auto-generated method stub

		
		Ticket comprobante=null;
		if (origen.getSaldoDisponible() < monto) {
			System.out.println("Saldo insuficiente");
		} else if ((origen.getSaldoDisponible() - monto) < origen.getMin()) {
			System.out.println("Retiro excedería el mínimo permitido");
		} else if (monto > destino.getMax()) {
			System.out.println("Cantidad excede el máximo permitido");

		} else if ((destino.getSaldoDisponible() + monto) > destino.getMax()) {
			System.out.println("Deposito excedería el máximo permitido");
		} else {
			// Afectar saldos

			origen.setSaldoDisponible(origen.getSaldoDisponible() + monto);
			destino.setSaldoDisponible(destino.getSaldoDisponible() + monto);

			return new Ticket(this.ubicacion, new Date(), monto, destino.getNumCuenta(), "Transferencia",
					Integer.toString(this.folio++));

		}
		return comprobante;
		
	}

}
