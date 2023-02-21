package com;

// QUE - metodos abstractos

public interface IOperacionesBancarias {

	
	//cuenta, monto, ticket
	// creacion de metodos
	Ticket depositar(Cuenta cuenta, double monto);
	
	Ticket retirar(Cuenta cuenta, double monto);
	
	Ticket transferencia(Cuenta origen, Cuenta destino, double monto);


}