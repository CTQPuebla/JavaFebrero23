package com;

public class Principal {
	/*
	 * Realizar la creacion y pruebas de los objetos de las clases del cajero
	 */

	public static void main(String[] args) {
		
		Cajero atm  = new Cajero("Avenida Juarez, La Paz");
		Cuenta c1 = new Cuenta(50.00, "Debito","C0001", "RTVGETR",10.00,2000.00);
		atm.depositar(c1, 220.00);
		System.out.println(c1);
		
		
	}
}
