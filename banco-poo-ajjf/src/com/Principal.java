package com;

public class Principal {
	
	public static void main(String[] args) {
		
		
		
		/*Realizar la creacion y pruebas de los objetos del cajero
		 * 
		 */
		Cajero cajero=new Cajero("Avenida Juarez, La Paz");
		Cuenta cuenta= new Cuenta(50.00,"debito","C0001","1234",10.00,2000.00);
		
		cajero.depositar(cuenta, 400.00);
		System.out.println(cuenta);
	}

}
