package com;

//Qué--(Qué tienes que hacer?)-Métodos abstractos
public interface IOperacionesBancarias {

	// cuenta, monto, nip, ticket

	// Este método es abstarcto y terminan en punto y como en vez de llave
	Ticket depositar(Cuenta cuenta, double monto);

	Ticket retirar(Cuenta cuenta, double monto);

	Ticket transferencia(Cuenta origen, Cuenta destino, double monto);

}
