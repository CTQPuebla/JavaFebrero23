package com;

import java.util.Date;

public class Cajero implements IOperacionesBancarias{ // 
	
	String ubicacion;
int folio;
	
	public Cajero() { // Creacion del constructor vacio
		
		
	}


	public Cajero(String ubicacion) { // Generacion del constructor con parametros
		super();
		this.ubicacion = ubicacion;
	}


	public String getUbicacion() { // Generacion getters y setters
		return ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}


	@Override // generacion to string 
	public String toString() {
		return "Cajero [ubicacion=" + ubicacion + "]";
	}

// Se trajeron las implementaciones de IOperacionesBancarias
	
	
	@Override
	public Ticket depositar(Cuenta cuenta, double monto) {
		//Exista la cuenta
		//Que la cantidad no exceda el maximo de la cuenta
		// Verificar que lo que ya hay + el deposito no exceda el maximo 
		
		Ticket comprobante = null;
		
		//VALIDACIONES
		
		if(monto>cuenta.getMax()) {
			System.out.println("Cantidad excede el maximo permitido");
			
			
		}else if ((cuenta.getSaldoDisponible() + monto) > cuenta.getMax()) {
			System.out.println("Deposito excederia el maximo permitido");
		}else {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() + monto); // SE PASA EL VALOR DE LA SUMA DE ASLDO DISPONIBLE MAS MONTO ENVIADO A SET SALDO
			return new Ticket(this.ubicacion,
					new Date(), monto, cuenta.getNumCuenta(), 
					"Deposito", Integer.toString(this.folio ++));
			
		}
		return comprobante; // Cuando no pueda hacerse la operacion , regrese null, cuando si, saque el folio
		

	}


	@Override
	public Ticket retirar(Cuenta cuenta, double monto) {
		// Saldo suficiente
		// Validar que no deje por debajo del minimo a la cuenta
		
		double saldoMinimo = 500;
		
		if(monto>cuenta.getMax()) {   // cuenta.getSaldoDisponible() < monto
			System.out.println("Cantidad excede el maximo permitido");
		}else if (cuenta.getSaldoDisponible() - monto <= saldoMinimo ) { // cuenta.getSaldoDisponible()-monto < cuenta.getMin()
			System.out.println("Cantidad rebasa el saldo disponible");
			
		}else {
			cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() - monto);
			
			return new Ticket(this.ubicacion,
					new Date(), monto, cuenta.getNumCuenta(),
					"Retiro", Integer.toString(this.folio++));
		}
		
		
		return null;
	}


	@Override
	public Ticket transferencia(Cuenta origen, Cuenta destino, double monto) {
		// Existen ambas cuentas 
		
		//ENTREGA DE TICKET NULO SET A 0
		
		Ticket comprobante = null;
		
		
		//RETIRO
		if(monto>origen.getMax()) {   // cuenta.getSaldoDisponible() < monto
			System.out.println("Cantidad excede el maximo permitido");
		}else if (origen.getSaldoDisponible() - monto <= origen.getMin() ) { // cuenta.getSaldoDisponible()-monto < cuenta.getMin()
			System.out.println("Cantidad rebasa el saldo disponible");
	    //DEPOSITO
		}else if(monto>destino.getMax()) {
			System.out.println("Cantidad excede el maximo permitido");
			
			
		}else if ((destino.getSaldoDisponible() + monto) > destino.getMax()) {
			System.out.println("Deposito excederia el maximo permitido");
		} else {
			//AFECTACION DE SALDOS 
			origen.setSaldoDisponible(origen.getSaldoDisponible() - monto);
			origen.setSaldoDisponible(destino.getSaldoDisponible() + monto);
			
  //REGRESAR TICKET
			return new Ticket(this.ubicacion,
					new Date(), monto, destino.getNumCuenta(),
					"Transferencia", Integer.toString(this.folio++));  // dato que se ejecuta desde esta clase. no necesita ser llamado desde otro lugar , otra clase
		}
		
		
		return comprobante;
	}


	//
	
	
}
