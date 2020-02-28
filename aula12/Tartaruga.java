package com.java.poo.aula12;

public class Tartaruga extends Reptil {
	
	public void esconderNoCasco() {
		System.out.println("Escondendo no casco");
	}
	@Override
	public void locomover() {
		System.out.println("Andando devagar");
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo alface");
	}
	@Override
	public void emitirSom() {
		System.out.println("Barulho estranho de tartaruga");
	}


}
