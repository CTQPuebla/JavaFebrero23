package com;
//QUE - metodos abstractos te dicen qu� vas a hacer pero no c�mo lo vas a hacer
public interface IOperacionesBancarias {
	
	//cuenta, monto, ticket
	
	Ticket depositar(Cuenta cuenta, double monto);
	Ticket retirar(Cuenta cuenta, double monto);
	Ticket transferencia(Cuenta origen, Cuenta destino, double monto);
	

}
