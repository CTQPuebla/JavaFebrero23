package com;

public class Principal {
	public static void main(String[] args) {
		/*
		 * realizar las creacion y pruebas de los objetos de las clases del cajero
		 */
		
		Cajero atm = new Cajero("avenida juarez, la paz");
		
		Cuenta c1 = new Cuenta(50.00, "debito", "C0001", "RTVGETR", 10.00, 2000.00);
		atm.retirar(c1, 470.00);
		
		
		System.out.println(c1);
	}

}
