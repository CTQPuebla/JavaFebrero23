package com;

//QUE --- Metodos abstactos 
// Contrato de acciones que se tienen que realizar 

public interface IOperacionesBancarias {
	
	// cuenta, monto , clase ticket
	// Creacion de metodos 
	Ticket depositar(Cuenta cuenta, double monto); // metodo abstractos te dicen que hacer pero no como hacerlo
	Ticket retirar(Cuenta cuenta, double monto);
	Ticket transferencia(Cuenta cuenta, Cuenta destino, double monto);
	
	
	

}
