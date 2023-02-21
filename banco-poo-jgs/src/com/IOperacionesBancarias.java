package com;

//QUE - metodos abstractos
public interface IOperacionesBancarias {

	Ticket depositar(Cuenta cuenta, double monto);

	Ticket retirar(Cuenta cuenta, double monto);

	Ticket tranferencia(Cuenta origen, Cuenta destino, double monto);

}
