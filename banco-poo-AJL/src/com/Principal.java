package com;

public class Principal {

	public static void main(String[] args) {
		
		//realizar las pruebas de los objetos de 
		// las clases del cajero
		
		Cajero atm = new Cajero ("Avenida Juárez, la Paz");
		Cuenta c1= new Cuenta(50, "Debito", "C0001", "RTVGETR", 10.00, 2000.00);
		
		atm.retirar(c1, 470.00);
		
		
	}
}
