package com;

public class principal {
	public static void main(String[] args) {
		/*
		 * Realizar la creacion y pruebas de los bjetos de las clases del cajero
		 */
		
		Cajero atm = new Cajero ("Avenida Juárez, La Paz");
		
		Cuenta c1 = new Cuenta (50.00, "Debito", "C0001", "RTVGETR", 10.00, 2000.00);
		atm.retirar(c1, 470.00); // aqui mismo se puede cambiar a depositar.
		
		System.out.println(c1);
		
		
		
		
		
	}
}
