package com.java.poo.aula12;

public class Ave extends Animal {
	
	protected String corPena;
	
	@Override
	public void locomover() {
		System.out.println("Voar");
	}
	@Override
	public void alimentar() {
		System.out.println("Comer Plantas");
	}
	@Override
	public void emitirSom() {
		System.out.println("Som de ave");
	}

}
