package com;

//Que - metodos abstractos
public interface IOperacionesBancarias {
	
	// cuenta, monto, nip
	Ticket depositar(Cuenta cuenta, double monto);
	Ticket retirar(Cuenta cuenta, double monto);
	Ticket transferir(Cuenta cuentaDestino, Cuenta cuentaOrigen,double monto);
	
	

}
