package com.arquitectura.mediator;

public abstract class Articulo {
	protected Mediador mediador;

	public Articulo(Mediador mediador) {
		this.mediador = mediador;
	}
	
	public Mediador getMediador() {
		return mediador;
	}

	public void setMediador(Mediador mediador) {
		this.mediador = mediador;
	}
}
