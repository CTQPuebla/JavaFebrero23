package com;

import java.util.Date;

public class Cajero implements IOperacionesBancarias {
	
	String ubicacion;
	int folio=0;
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
		Ticket comprobante =null;
		if(monto>cuenta.getMax()) {
			System.out.println("Cantidad excede el maximo permitido");
			
		}else if((cuenta.getSaldoDis()+monto)>cuenta.getMax()) {
			System.out.println("Deposito excederia el maximo permitido");
		}else {
			cuenta.setSaldoDis(cuenta.getSaldoDis()+monto);
			return new Ticket(this.ubicacion,new Date(),monto,cuenta.getNumCuenta(),"Deposito",this.folio);			
		}
		
		return comprobante;
		
	}
	@Override
	public Ticket retirar(Cuenta cuenta, double monto) {
		Ticket comprobante =null;
		if(monto<cuenta.getSaldoDis()) {
			System.out.println("No tienes suficientes fondos para retirar esa cantidad");
			
		}else if((cuenta.getSaldoDis()-monto)<cuenta.getMin()) {
			System.out.println("Si retiras esa cantidad escedeerias la cantidad minima");
		}else {
			cuenta.setSaldoDis(cuenta.getSaldoDis()+monto);
			comprobante=new Ticket();			
			comprobante.setSucursal(this.ubicacion);
			comprobante.setFecha(new Date());
			comprobante.setMontoOperado(monto);
			comprobante.setNumCuenta(cuenta.getNumCuenta());
			comprobante.setOperacion("Retiro");
			comprobante.setFolio(this.folio++);
		}
		return comprobante;
	}
	@Override
	public Ticket transferencia(Cuenta origen, Cuenta destino, double monto) {
		
		if(monto<origen.getSaldoDis()) {
			System.out.println("No tienes suficientes fondos para retirar esa cantidad");
			
		}else if((origen.getSaldoDis()-monto)<origen.getMin()) {
			System.out.println("Si retiras esa cantidad escedeerias la cantidad minima");
		}else
		if(monto>destino.getMax()) {
			System.out.println("Cantidad excede el maximo permitido");
			
		}else if((destino.getSaldoDis()+monto)>destino.getMax()) {
			System.out.println("Deposito excederia el maximo permitido");
		}else {
			origen.setSaldoDis(origen.getSaldoDis() - monto);
			destino.setSaldoDis(destino.getSaldoDis() + monto);
			return new Ticket(this.ubicacion, new Date(),monto, destino.getNumCuenta(),"TRansferecia",folio++);
		}
		return null;
	}
	
}
