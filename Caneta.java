package com.bruno.java.poo.aula01;

public class Caneta {
	 
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampado;
	void status() {
		System.out. println("modelo: "+this.modelo);
		System.out. println("cor: "+this.cor);
		System.out. println("ponta: "+this.ponta);
		System.out. println("carga: "+this.carga);
		System.out. println("Está tampado? "+this.tampado);
	}
	void tampar() {
		this.tampado = true;
	}
	void destampado() {
		this.tampado = false;
	}
	void escrever() {
		if(this.tampado == true) {
			System.out. println("ERRO!! está tampado");
		}else {
			System.out. println("ESCREVENDO");
		}
	}

}
