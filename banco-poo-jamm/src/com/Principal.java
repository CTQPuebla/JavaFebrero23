package com;

public class Principal {

	public static void main(String[] args) {
		
		Cajero atm = new Cajero("Avenida Juarez, La Paz");
		
		Cuenta c1 = new Cuenta(50.00, "Debito", "C00001", "sadfvdgr", 10.00, 2000.00);
		atm.depositar(c1, 1000.00);
		
		System.out.println(c1);
		
		
		
	}
}


//cajero, cliente, ticket