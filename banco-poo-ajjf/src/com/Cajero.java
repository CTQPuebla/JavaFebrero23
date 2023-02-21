package com;

import java.util.Date;

public class Cajero implements IOperacionesBancarias{
	
	String ubicacion;
	
	int folio;
	
	public Cajero() {}

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
		// TODO Auto-generated method stub
		
		
//		Validacion de data, cuenta exista, cantidad maxima no sobrepase,		
		
		Ticket comprobante=null;
		
		if (monto>cuenta.getMax()) {
			System.out.println("Cantidad excede el maximo permitido");
		}else if ((cuenta.getSaldoDisp()+monto)>cuenta.getMax()) {
			System.out.println("Deposito excederia el maximo permitido");
		}else {
			cuenta.setSaldoDisp(cuenta.getSaldoDisp()+monto);
			return new Ticket(this.ubicacion,
					new Date(),monto,cuenta.getNumCuetna(),"Deposito", Integer.toString(this.folio++));	
		}
		return comprobante;
		
	}

	@Override
	public Ticket retirar(Cuenta cuenta, double monto) {
		// TODO Auto-generated method stub
		
		//saldo suficiente, que no deje por debajo del minimo
		
		Ticket comprobante=null;
		
		if (monto>cuenta.getSaldoDisp()) {
			System.out.println("Saldo insuficiente");
		}else if ((cuenta.getSaldoDisp()-monto)<cuenta.getMin()) {
			System.out.println("Deposito violaria el minimo permitido");
		}else {
			cuenta.setSaldoDisp(cuenta.getSaldoDisp()-monto);
			return new Ticket(this.ubicacion,
					new Date(),-monto,cuenta.getNumCuetna(),"Retiro", Integer.toString(this.folio++));	
		}
		return comprobante;
	}

	@Override
	public Ticket trasnferencia(Cuenta origen, Cuenta destino, double monto) {
		// TODO Auto-generated method stub
		Ticket comprobante=null;
		
		//exitan ambas cuentas, que no se violen las demmas validaciones la mover montos
		if (monto>destino.getMax()) {
			System.out.println("Cantidad excede el maximo permitido");
		}else if ((destino.getSaldoDisp()+monto)>destino.getMax()) {
			System.out.println("Deposito excederia el maximo permitido");
		}else if (monto>origen.getSaldoDisp()) {
			System.out.println("Saldo insuficiente");
		}else if ((origen.getSaldoDisp()-monto)<origen.getMin()) {
			System.out.println("Deposito violaria el minimo permitido");
		}else {
			
			origen.setSaldoDisp(origen.getSaldoDisp()-monto);
			destino.setSaldoDisp(destino.getSaldoDisp()+monto);
			return new Ticket(this.ubicacion,
					new Date(),-monto,origen.getNumCuetna(),"Transferencia", Integer.toString(this.folio++));
		}
		
		
		
		return comprobante;
	}
	
	

}
