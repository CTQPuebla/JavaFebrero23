package com;

//QUE - metodos abstractos(
public interface iOperacionesBnacaria {
	
	// cuenta, monto,nip, ticket
	Ticket depositar(Cuenta cuenta, double monto);
	Ticket retirar(Cuenta cuenta,double monto);
	Ticket transferencia(Cuenta origen, Cuenta destino, double monto);
	
}
