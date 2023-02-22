package com;

public class Principal {
	public static void main(String[] args) {
		
		/*
		 * Realizar la ceracion y pruebas de los objetos de las clases del cajero.
		 */
		
		
		
		
		Cajero atm = new Cajero("Avenida Juárez, La Paz");
		Cuenta c1 = new Cuenta(500.00,"Débito","AH0420","PIZDIETZ",10.00,2000.00);
		atm.depositar(c1, 1000);
		
		
		
		
		System.out.println(c1);
		
		
	}

}
