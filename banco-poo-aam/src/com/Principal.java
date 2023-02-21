package com;

public class Principal {

	public static void main(String[] args) {
		
		Cajero atm = new Cajero("avenida Juarez, La Paz");
		Cuenta c1=new Cuenta(50.00,"debito","C0001","RTVGTR",10.00,2000.00);
		atm.depositar(c1, 1000);
		System.out.println(c1);
	}
}
