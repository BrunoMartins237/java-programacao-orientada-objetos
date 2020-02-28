package com.java.poo.aula12;

public class Reptil extends Animal {

	protected String corPele;
	

	@Override
	public void locomover() {
		System.out.println("Rastejar");
	}
	@Override
	public void alimentar() {
		System.out.println("Comer insetos");
	}
	@Override
	public void emitirSom() {
		System.out.println("Som de réptil");
	}
}
