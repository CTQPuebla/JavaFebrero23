package com;

//QUE - Se expresa con metodos abstractos
public interface IOperacionesBancarias {

	//cuenta, monto, tixket
	Ticket depositar(Cuenta cuenta, double monto) ;
	Ticket retirar(Cuenta cuenta, double monto) ;
	Ticket transferencia(Cuenta origen, Cuenta destino, double monto) ;
	
	
}
