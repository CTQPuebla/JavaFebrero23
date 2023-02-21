package com;

import java.util.Date;

public class Cajero implements IOperacionesBancarias{

	String ubicacion;
	int folio=0;
	
	public Cajero() {
		
	}

	public Cajero(String ubicacion) {
		//super();
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
		Ticket comprobante=null;
		if (monto>cuenta.getMax()) {
			System.out.println("la cantidad exede el maximo permitido");
			
		}else if((cuenta.getSaldoDisponible()+monto)>cuenta.getMax()) {
			System.out.println("el deposito exederia el maximo permitido");
		}else  {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible()+monto);
			return new Ticket(this.ubicacion,new Date(),monto,cuenta.getNumCuenta(),"Deposito",Integer.toString(this.folio++));
		}
		
		
		
		
		return comprobante;
	}

	@Override
	public Ticket retirar(Cuenta cuenta, double monto) {
		Ticket comprobante=null;
		if (monto>cuenta.getSaldoDisponible()) {
			System.out.println("la cantidad exede el monto disponible");
			
		}else if((cuenta.getSaldoDisponible()-monto)<cuenta.getMin()) {
			System.out.println("el retiro no se puede realizar porque exede el minimo disponible");
		}else  {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible()-monto);
			return new Ticket(this.ubicacion,new Date(),monto,cuenta.getNumCuenta(),"Retiro",Integer.toString(this.folio++));
		}
		
		
		
		
		return comprobante;
	}

	@Override
	public Ticket transferencia(Cuenta origen, Cuenta destino, double monto) {
		Ticket comprobante=null;
		if (monto>origen.getSaldoDisponible()) {
			System.out.println("la cantidad exede el monto disponible");
			
		}else if((origen.getSaldoDisponible()-monto)<origen.getMin()) {
			System.out.println("el retiro no se puede realizar porque exede el minimo disponible");
		}
		else if (monto>destino.getMax()) {
			System.out.println("la cantidad exede el maximo permitido");
			
		}else if((destino.getSaldoDisponible()+monto)>destino.getMax()) {
			System.out.println("el deposito exederia el maximo permitido");
		}
		else {
			origen.setSaldoDisponible(origen.getSaldoDisponible()-monto);
			destino.setSaldoDisponible(destino.getSaldoDisponible()+monto);
			return new Ticket(this.ubicacion,new Date(),monto,destino.getNumCuenta(),"Transferencia",Integer.toString(this.folio++));
		
		}
		return comprobante;
	}
	
	
}
