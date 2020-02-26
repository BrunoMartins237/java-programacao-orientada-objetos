package com.java.poo.projetoPessoas;

public class ProjetoPessoas {

	public static void main(String[] args) {
		// Programa Principal
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("joao");
		p2.setNome("Maria");
		p3.setNome("Chicão");
		p4.setNome("Joana");
		
		p1.setSexo("M");
		p2.setSexo("F");
		p3.setSexo("F");
		p4.setSexo("M");
		
		p2.setIdade(45);
		p2.setCurso("Engenharia");
		p3.receberAumento(500);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		
		

	}

}
