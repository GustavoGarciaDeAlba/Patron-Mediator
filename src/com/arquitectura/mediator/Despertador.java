package com.arquitectura.mediator;


public class Despertador extends Articulo{
	
	public Despertador(Mediador mediador) {
		super(mediador);
	}
	public void suena() {
		System.out.println("Se enciende el despertador");
		mediador.notificar("Despertador ON");
	}
	public void apaga() {
		System.out.println("Se apago el despertador");
		mediador.notificar("Despertador OFF");
	}
}
