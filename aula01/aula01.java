package com.bruno.java.poo.aula01;

public class aula01 {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		c1.modelo = "esferográfica";
		c1.cor = "azul";
		c1.ponta = 1.3f;
		c1.carga = 80;
		c1.tampar();

		c1.status();
		c1.escrever();

	}

}
