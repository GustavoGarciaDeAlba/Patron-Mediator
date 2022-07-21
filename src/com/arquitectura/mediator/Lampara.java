package com.arquitectura.mediator;

public class Lampara extends Articulo{
	
	public Lampara(Mediador mediador) {
		super(mediador);
	}

	public void enciende() {
		System.out.println("Se encendio la lampara");
		mediador.notificar("Lampara ON");
	}
	public void apaga() {
		System.out.println("Se apago la lampara");
		mediador.notificar("Lampara OFF");
	}
}
