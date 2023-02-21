package com;

//QUE - metodos abstractos
public interface IOperacionesBancarias {
	
	//cuenta, monto, ticket
	Ticket depositar (Cuenta cuenta, double monto);
	Ticket retirar(Cuenta cuenta, double monto);
	Ticket transferencia (Cuenta origen, Cuenta destino, double monto);
	
	

}
