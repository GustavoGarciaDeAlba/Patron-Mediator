package com.arquitectura.mediator;

public class Main {

	public static void main(String[] args) {
		
		Mediador mediador = new MediadorConcreto();
		Tele tele = new Tele(mediador);
		Despertador despertador = new Despertador(mediador);
		
		despertador.suena();
		tele.enciende();
	}

}
