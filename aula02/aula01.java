package com.bruno.java.poo.aula02;

public class aula01 {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
         c1.modelo = "esferográfica";
         c1.cor = "azul";
         //c1.ponta = 0.3f;
         c1.carga = 70;
         c1.tampado = true;
         
		c1.status();
		c1.escrever();

	}

}
