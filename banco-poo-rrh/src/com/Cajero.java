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
		// que la cantidad no exceda el m�ximo de la cuenta
		// Verificar que lo que hay + el dep�sito no exceda el m�ximo

		Ticket comprobante = null;
		if (monto > cuenta.getMax()) {
			System.out.println("Cantidad excede el m�ximo permitido");

		} else if ((cuenta.getSaldoDisponible() + monto) > cuenta.getMax()) {
			System.out.println("Deposito exceder�a el m�ximo permitido");
		} else {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() + monto);
			return new Ticket(this.ubicacion, new Date(), monto, cuenta.getNumCuenta(), "Dep�sito",
					Integer.toString(this.folio++));
		}

		return comprobante;

	}

	@Override
	public Ticket retirar(Cuenta cuenta, double monto) {
		// TODO Auto-generated method stub

		// saldo suficiente
		// que no deje por debajo del m�nimo a la cuenta

		Ticket comprobante = null;
		if (cuenta.getSaldoDisponible() < monto) {
			System.out.println("Saldo insuficiente");
		} else if ((cuenta.getSaldoDisponible() - monto) < cuenta.getMin()) {
			System.out.println("Retiro exceder�a el m�nimo permitido");
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
			System.out.println("Retiro exceder�a el m�nimo permitido");
		} else if (monto > destino.getMax()) {
			System.out.println("Cantidad excede el m�ximo permitido");

		} else if ((destino.getSaldoDisponible() + monto) > destino.getMax()) {
			System.out.println("Deposito exceder�a el m�ximo permitido");
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
