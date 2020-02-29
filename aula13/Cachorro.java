package com.java.poo.aula13;

public class Cachorro extends Lobo {
    
	public void reagir(boolean d) {
		if(d == true) {
			System.out.println("Abanar o rabo");
		}else {
			System.out.println("Rosnar");
		}
	}
	
	public void reagir(int id, float peso) {
		if(id < 12 && peso < 5) {
			System.out.println("Abanar o rabo");
		}else if(id >= 12 && peso >=10) {
			System.out.println("Rosnar e latir");
			this.emitirSom();
		}
	}
	@Override
	public void emitirSom() {
		System.out.println("AU AU AU");
	}
}
