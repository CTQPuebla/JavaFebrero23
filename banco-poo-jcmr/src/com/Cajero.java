package com;

import java.util.Date;

public class Cajero implements IOperacionesBancarias{
	
	String ubicacion;
	int folio;
	
	
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
		//Exista la cuenta
		// que la cantidad no exceda el maximo de la cuenta
		//verificar que lo que hay + el deposito no exceda el maximo
		// TODO Auto-generated method stub
		
		Ticket comprobante = null;
		
		if(monto>cuenta.getMax()) {
			System.out.println("Cantidad excede el maximo permitido");
		}else if((cuenta.getSaldoDisponible()+monto)> cuenta.getMax()) {
			System.out.println("Deposito excederia el maximo permitido");
		}else {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() + monto);
			return new Ticket(this.ubicacion, 
					new Date(), monto, cuenta.getNumCuenta(), 
					"Deposito", Integer.toString(this.folio++));
		}

		
		return comprobante;
	}


	@Override
	public Ticket retirar(Cuenta cuenta, double monto) {
		//saldo suficiente
		//que no deje por debajo del minimo a la cuenta
		// TODO Auto-generated method stub
		
		Ticket comprobante = null;
		
		if(monto > cuenta.getSaldoDisponible()) {
			System.out.println("Cantidad excede el maximo disponible");
		}else if((cuenta.getSaldoDisponible()-monto)< cuenta.getMin()) {
			System.out.println("Deposito excederia el minimo permitido");
		}else {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() - monto);
			return new Ticket(this.ubicacion, 
					new Date(), monto, cuenta.getNumCuenta(), 
					"Retiro", Integer.toString(this.folio++));
		}

		
		return comprobante;
		
		
		
		
		
	}


	@Override
	public Ticket transferir(Cuenta cuentaDestino, Cuenta cuentaOrigen, double monto) {
		//
		// TODO Auto-generated method stub
		
		Ticket comprobante = null;
		if(monto > cuentaOrigen.getSaldoDisponible()) {
			System.out.println("Cantidad excede el maximo disponible");
		}else if((cuentaOrigen.getSaldoDisponible()-monto)< cuentaOrigen.getMin()) {
			System.out.println("Deposito excederia el minimo permitido");
		}else if(monto>cuentaDestino.getMax()) {
			System.out.println("Cantidad excede el maximo permitido");
		}else if((cuentaDestino.getSaldoDisponible()+monto)> cuentaDestino.getMax()) {
			System.out.println("Deposito excederia el maximo permitido");
		}else {
			cuentaOrigen.setSaldoDisponible(cuentaOrigen.getSaldoDisponible()-monto);
			cuentaDestino.setSaldoDisponible(cuentaDestino.getSaldoDisponible()+monto);
			return new Ticket(this.ubicacion, 
					new Date(), monto, cuentaDestino.getNumCuenta(), 
					"Transferencia", Integer.toString(this.folio++));
		}
		return comprobante;
		
		
		
		
	}
	
	
	
}
