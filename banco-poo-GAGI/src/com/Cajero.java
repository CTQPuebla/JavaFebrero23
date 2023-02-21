package com;

import java.util.Date;

public class Cajero implements IOperacionesBancarias{

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
	public Ticket depositar (Cuenta cuenta, double monto) {
		// TODO Auto-generated method stub

		//Existe la cuenta
		//que la cantidad no exceda el maximo de la cuenta
		//verificar que lo hay que no exceda el maximo
		Ticket comprobante = null;
		
		if(monto>cuenta.getMax()) {
			System.out.println("Cantidad excede el maximo permitido");
		}else if ((cuenta.getSaldoDis()+monto)>cuenta.getMax()){
			System.out.println("Depostio excederia el maximo permitido");
		} else {
			cuenta.setSaldoDis(cuenta.getSaldoDis()+monto);
			return new Ticket(this.ubicacion,
					new Date(), monto, cuenta.getNumCuenta(),
					"Deposito", Integer.toString(this.folio++));
		}
		return null;
	}

	@Override
	public Ticket retirar(Cuenta cuenta, double monto) {
		// TODO Auto-generated method stub
		//saldo suficiente
		//que no deje por debajo del minimo de la cuenta
		
		Ticket comprobante = null;
		
		if(monto<cuenta.getMax()) {
			System.out.println("Saldo insuficiente");
		}else if ((cuenta.getSaldoDis()-monto)<cuenta.getMax()){
			System.out.println("Cantidad no alcanza el minimmo permitidoo");
		}else {
			cuenta.setSaldoDis(cuenta.getSaldoDis()-monto);
			return new Ticket(this.ubicacion,
					new Date(), monto, cuenta.getNumCuenta(),
					"Retiro", Integer.toString(this.folio++));
		}
		
		
		
		return null;
	}

	@Override
	public Ticket trasnferencia(Cuenta origen, Cuenta destino, double monto) {
		Ticket comprobante = null;
		if(origen.getSaldoDis()<monto) {
			System.out.println("Saldo insuficiente");
		}else if ((origen.getSaldoDis()-monto)<origen.getMax()){
			System.out.println("Retiro excederia el minimo permitido");
		}else if(monto>destino.getMax()) {
			System.out.println("Saldo insuficiente");
		}else if ((destino.getSaldoDis()+monto)>destino.getMax()){
			System.out.println("Deposito excederia el maximo permitido");
		}else {
			//Afectar saldos
			origen.setSaldoDis(origen.getSaldoDis()-monto);
			destino.setSaldoDis(destino.getSaldoDis()+monto);
			
			return new Ticket(this.ubicacion,
					new Date(), monto, destino.getNumCuenta(),
					"Transferencia", Integer.toString(this.folio++));

		}
		return comprobante;
	}
	
}
