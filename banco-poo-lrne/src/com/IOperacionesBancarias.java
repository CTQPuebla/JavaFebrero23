package com;
//QUE - metodos abstractos te dicen qué vas a hacer pero no cómo lo vas a hacer
public interface IOperacionesBancarias {
	
	//cuenta, monto, ticket
	
	Ticket depositar(Cuenta cuenta, double monto);
	Ticket retirar(Cuenta cuenta, double monto);
	Ticket transferencia(Cuenta origen, Cuenta destino, double monto);
	

}
