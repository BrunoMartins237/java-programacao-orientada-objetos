package com.java.poo.aula12;

public class aula12 {

	public static void main(String[] args) {
		//Programa Principal
		//Animal a1 = new Animal(); Classe abstrata/mae
		
		Cachorro c1 = new Cachorro();
		c1.peso = 78.6f;
		c1.corPelo = "Caramelo";
		c1.emitirSom();
		
		Reptil r1 = new Reptil();
		r1.idade = 100;
		r1.emitirSom();
		r1.locomover();
		
		Tartaruga t = new Tartaruga();
		t.alimentar();
		t.emitirSom();
		t.locomover();
		
		// Polimorfismo sobreposição

	}

}
