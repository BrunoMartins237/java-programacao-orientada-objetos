package com.java.poo.aula06;

public class aula06 {

	public static void main(String[] args) {
		Lutador l[] = new Lutador[6];
		l[0] = new Lutador("Bruno", "BRA", 23, 70.5f, 90f, 10, 5, 4);
		l[1] = new Lutador("Crhis", "EUA", 27, 78.5f, 80.5f, 13, 5, 6);
		l[2] = new Lutador("Greg", "FRA", 25, 60f, 85f, 5, 3, 1);
		l[3] = new Lutador("Caruzo", "ARG", 26, 65f, 65.4f, 6, 8, 2);
		l[4] = new Lutador("Will", "EUA", 30, 87f, 80.7f, 15, 10, 8);
		l[5] = new Lutador("Calton", "ALE", 29, 50.4f, 81.9f, 4, 6, 4);
		
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[5], l[4]);
		UEC01.lutar();




	}

}
