package com;

//EN UNA INTERFACE SOLO SE PRESENTA EL "QUÉ"
public interface IOperacionesBancarias {
	
//CUENTA, MONTO , TICKET
	Ticket depositar (Cuenta cuenta, double monto);
	Ticket retirar (Cuenta cuenta, double monto);
	Ticket transferencia (Cuenta cuenta, Cuenta destino, double monto);

}
