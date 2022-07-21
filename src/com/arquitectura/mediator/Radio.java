package com.arquitectura.mediator;

public class Radio extends Articulo{
	
	public Radio(Mediador mediador) {
		super(mediador);
	}
	public void enciende() {
		System.out.println("Se encendio la radio");
		mediador.notificar("Radio ON");
	}
	public void apaga() {
		System.out.println("Se apago la radio");
		mediador.notificar("Radio OFF");
	}
}
