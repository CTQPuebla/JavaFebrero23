package com;

public class Principal {
	public static void main(String[] args) {
		
		Cajero cj = new Cajero("Un lugar");
		
		Cuenta cuenta1 = new Cuenta(50.00, "Debito", "C0001", "RTVGETR",
				10.00, 2000.00);
		
		cj.depositar(cuenta1, 470.00);
		
		System.out.println(cj.depositar(cuenta1, 40.00));
	}
}
