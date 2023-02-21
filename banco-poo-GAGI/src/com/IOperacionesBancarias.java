package com;

public interface IOperacionesBancarias {

	
	
	Ticket depositar(Cuenta cuenta, double monto);
	Ticket retirar(Cuenta cuenta, double monto);
	Ticket trasnferencia(Cuenta origen, Cuenta destino, double monto);
}
