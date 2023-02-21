package com;

import java.util.Date; //UTIL

//EL IMPLEMENTS SIRVE PARA-

public class Cajero implements IOperacionesBancarias{
	
	String ubicacion;
	int folio =0;
	
	
	
	public Cajero () {	
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
	public Ticket depositar (Cuenta cuenta, double monto) {
	
		
Ticket comprobante = null;
		
		if(monto>cuenta.getMax() ) {
			System.out.println("Cantidad excede el maximo permitido");
		} else {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible()+ monto);
			return new Ticket (this.ubicacion,
					new Date(), monto, cuenta.getNumCuenta(), "Deposito", Integer.toString(this.folio));
		}
		return comprobante;
		
		
	}

	@Override
	public Ticket retirar(Cuenta cuenta, double monto) {
		//saldo suficiente
		//que no deje por debajo del minimo de la cuenta
	
Ticket comprobante = null;
		
		if(cuenta.getSaldoDisponible()<monto ) {
			System.out.println("Saldo insuficiente");
		} else if ((cuenta.getSaldoDisponible()-monto) <cuenta.getMin()); {
			System.out.println("Retiro excederia el minimo permitido");
		} else {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible()-monto);
		
			
			
			return new Ticket (this.ubicacion, new Date(), monto, cuenta.getNumCuenta(), "Retiro", Integer.toString(this.folio++));
			
		}
		return comprobante;
	}

	@Override
	public Ticket transferencia (Cuenta origen, Cuenta destino, double monto) {
		// TODO Auto-generated method stub
		Ticket comprobante = null;
		
		if(origen.getSaldoDisponible()<monto ) {
			System.out.println("Saldo insuficiente");
		}else if ((origen.getSaldoDisponible()-monto) < origen.getMin()) {
			System.out.println("Retiro excederia el minimo permitido");
		}else if(monto>destino.getMax()) {
			System.out.println("Cantidad excede el maximo permitido");
		}else if((destino.getSaldoDisponible()+monto) > destino.getMax()) {
			System.out.println("Deposito excederia el maximo permitido");
		}else {
			origen.setSaldoDisponible(origen.getSaldoDisponible()- monto);
			destino.setSaldoDisponible(destino.getSaldoDisponible()+monto);
			return new Ticket (this.ubicacion, new Date(),
					monto, destino.getNumCuenta(), "Transferencia",
					Integer.toBinaryString(this.folio++)
			
		}
		}
		return null;
		
		
		
		}
	}

