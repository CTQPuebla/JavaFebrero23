package com;
//Que - Métodos abstractos
public interface IOperacionesBancarias {
	
	//cuenta monto nip
	
	Ticket depositar(Cuenta cuenta, double monto);
	Ticket retirar(Cuenta cuenta, double monto);
	Ticket transferencia(Cuenta origen, Cuenta destino, double monto);
	
}
