package com;

public interface IOperacionesBancarias {

	Ticket depositar(Cuenta cuenta,double monto);
	Ticket retirar(Cuenta cuenta,double monto);
	Ticket transferencia(Cuenta origen,Cuenta destino,double monto);
	
}
