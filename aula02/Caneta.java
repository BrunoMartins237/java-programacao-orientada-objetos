package com.bruno.java.poo.aula02;

public class Caneta {
	 
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampado;
	public void status() {
		System.out. println("modelo: "+this.modelo);
		System.out. println("cor: "+this.cor);
		System.out. println("ponta: "+this.ponta);
		System.out. println("carga: "+this.carga);
		System.out. println("Está tampado? "+this.tampado);
	}
	protected void tampar() {
		this.tampado = true;
	}
	protected void destampado() {
		this.tampado = false;
	}
	public void escrever() {
		if(this.tampado == true) {
			System.out. println("ERRO!! está tampado");
		}else {
			System.out. println("ESCREVENDO");
		}
	}

}
