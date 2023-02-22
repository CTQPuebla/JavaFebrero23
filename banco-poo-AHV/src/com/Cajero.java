package com;

import java.util.Date;

public class Cajero  implements IOperacionesBancarias {
	
	String ubicacion;
	int folio=0;
	
	public Cajero(){
		
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
		//que la cantidad no exceda el maximo de la cuenta
		//verificar que lo que ya hay más el depósito no exceda el máximo.
		
		Ticket comprobante = null;
		
		if (monto>cuenta.getMax()) {
			System.out.println("Cantidad excede el máximo permitido.");
		}else if((cuenta.getSaldoDisponible()+monto)>cuenta.getMax()) {
			System.out.println("Deposito excederia el máximo permitido");
		}else {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible()+monto);
			return new Ticket(this.ubicacion, new Date(),
					monto, cuenta.getNumCuenta(), "Depósito", Integer.toString(this.folio++));
		
		}
		
		return comprobante;
	}

	@Override
	public Ticket retirar(Cuenta cuenta, double monto) {
		// saldo suficiente
		//que no se deje por debajo del minimo a la cuenta
	Ticket comprobante = null;
		
		if (monto<cuenta.getSaldoDisponible()) {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible()-monto);
			return new Ticket(this.ubicacion, new Date(),
					cuenta.getSaldoDisponible(), cuenta.getNumCuenta(), "Retiro", Integer.toString(this.folio++));
			
		}else if((cuenta.getSaldoDisponible()-monto)<cuenta.getMin()) {
			System.out.println("Retiro excederia el mínimo permitido");
		}else {
			System.out.println("Saldo insuficiente.");
		
		}
		return comprobante;
	}

	@Override
	public Ticket transferencia(Cuenta origen, Cuenta destino, double monto) {
		Ticket comprobante = null;
		if (origen.getSaldoDisponible()<monto){
			System.out.println("Saldo insuficiente.");
		}else if((origen.getSaldoDisponible()-monto)<origen.getMin()) {
			System.out.println("Retiro excedería el mínimo permitido.");
		}else if(monto>destino.getMax()) {
			System.out.println("Cantidad excede el máximo permitido.");
		}else if((destino.getSaldoDisponible()+monto)>destino.getMax()) {
			System.out.println("Depósito excedería el máximo permitido.");
		}else {
				origen.setSaldoDisponible(origen.getSaldoDisponible()-monto);
				destino.setSaldoDisponible(destino.getSaldoDisponible()+monto);
				return new Ticket(this.ubicacion, new Date(),
						monto, destino.getNumCuenta(), "Transferencia.", 
						Integer.toString(this.folio++));//folio no cuenta con un Setter o Getter porque es un dato interno que se origina dentor con cada ejecución
				
		}
		return comprobante;
	}
	
	
	
	
	

}
