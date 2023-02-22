package com;
//EN UNA INTERFACE SOLO SE EXPRESA EL QUE HACER POR MEDIO DE METODOS ABSTRACTOS
public interface IOperacionesBancarias {
	
	Ticket depositar(Cuenta cuenta, double monto );
	Ticket retirar(Cuenta cuenta, double monto);
	Ticket transferencia(Cuenta origen, Cuenta destino, double monto);
	
	
	
	

}
