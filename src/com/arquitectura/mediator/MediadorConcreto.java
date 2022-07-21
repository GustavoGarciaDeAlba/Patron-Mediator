package com.arquitectura.mediator;

public class MediadorConcreto implements Mediador{
	
	private Lampara lampara;
	private Tele tele;
	private Radio radio;
	private Despertador despertador;
	
	public MediadorConcreto() {
		this.lampara = new Lampara(this);
		this.tele = new Tele(this);
		this.radio = new Radio(this);
		this.despertador = new Despertador(this);
	}
	@Override
	public void notificar(String mensaje) {
		if (mensaje == "Despertador ON") {
			this.lampara.enciende();
		} else if (mensaje == "Despertador OFF") {
			this.radio.enciende();
		} else if (mensaje == "Lampara ON") {
			this.despertador.apaga();
		} else if (mensaje == "Radio ON") {
			this.tele.bajaVolumen();
		} else if (mensaje == "Tele ON") {
			this.radio.apaga();
			this.lampara.apaga();
		} 
	}
}