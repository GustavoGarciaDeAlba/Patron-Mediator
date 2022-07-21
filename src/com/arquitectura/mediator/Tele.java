package com.arquitectura.mediator;

public class Tele extends Articulo{
	
	public Tele(Mediador mediador) {
		super(mediador);
	}

	public void enciende() {
		System.out.println("Se encendio la tele");
		mediador.notificar("Tele ON");
	}
	public void apaga() {
		System.out.println("Se apago la tele");
		mediador.notificar("Tele OFF");
	}
	public void bajaVolumen() {
		System.out.println("Se bajo el volumen de la tele");
		mediador.notificar("Tele --");
	}
	public void subeVolumen() {
		System.out.println("Tele ++");
	}
}
