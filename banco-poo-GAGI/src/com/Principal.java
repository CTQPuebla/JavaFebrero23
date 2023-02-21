package com;

public class Principal {
public static void main(String[] args) {
	
	Cajero atm = new Cajero("Avenida Juárez, La Paz");
	
	Cuenta c1 = new Cuenta(50.00, "Débito", "C0001", "RTVGETR", 10.000, 2000.00);
	atm.depositar(c1, 457);
	
	System.out.println(c1);
}
}
