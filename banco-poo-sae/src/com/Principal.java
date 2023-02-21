package com;

public class Principal {
	
	public static void main (String [] args) {
		/*
		 * REALIZAR LA CREACION Y PRUEBAS DE LOS OBJETOS DE LAS CLASES DEL CAJERO
		 */
		
		Cajero atm = new Cajero ("Avenida Juarez, La Paz");
		
		Cuenta c1 = new Cuenta (50.00 "Debito", "C0001"," RTVGETR", 10.00, 2000.00);
		atm.retirar(c1, 470.00);
		
		System.out.println(c1);
	
	}

}
