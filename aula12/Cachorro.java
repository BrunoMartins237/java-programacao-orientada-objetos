package com.java.poo.aula12;

public class Cachorro extends Mamifero {
	
	public void abanarRabo() {
		System.out.println("Abanando o rabo");
		
	}
	@Override
	public void locomover() {
		System.out.println("Correndo");
	}
	@Override
	public void alimentar() {
		System.out.println("Comendo Ração");
	}
	public void emitirSom() {
		System.out.println(" AU AU AU ");
	}

}
