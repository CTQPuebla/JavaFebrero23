package com;

public class Principal {
	public static void main(String[] args) {
		/*
		 * Realizar la creacion y pruebas de los objetos de las clases del cajero
		 * 
		 */
		
		
		Cajero atm = new Cajero("Avenida Juárez, La Paz");
		Cuenta c1 = new Cuenta(50, "Débito", "C0001", "RTVGETR", 10.00, 2000.00);
		atm.depositar(c1, 2000);
		System.out.println(c1);
		}

}
