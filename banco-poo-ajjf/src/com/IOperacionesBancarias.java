package com;

//QUE- metodos abstractos
public interface IOperacionesBancarias {
	
//	cuenta, monto
	Ticket depositar(Cuenta cuenta,double monto);
	Ticket retirar(Cuenta cuenta,double monto);
	
	Ticket trasnferencia(Cuenta origen,Cuenta destino,double monto);

}
