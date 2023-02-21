package com;


//QUE -metodos abstractos
public interface IOperacionesBancarias {

	// cuenta, monto nip

	Ticket depositar(Cuenta cuenta, double monto);
	Ticket retirar(Cuenta cuenta, double monto);
	Ticket transferir(Cuenta origen, Cuenta destino, double monto);
	
	
}
