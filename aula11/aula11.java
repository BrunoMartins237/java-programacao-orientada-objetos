package com.java.poo.aula11;

public class aula11 {

	public static void main(String[] args) {
		
		// Pessoa p1 = new Pessoa(); não pode instaciar
        
		Visitante v1 = new Visitante();
		v1.setNome("Carnavrau");
		v1.setIdade(15);
		v1.setSexo("M");
		System.out.println(v1.toString());
		//visitante é uma herança pobre.. herança de implementação,sub-classe
		
		Aluno a1 = new Aluno();
		a1.setCurso("Informatica");
		a1.setMatricula(123);
		a1.setNome("Jose");
		a1.pagarMensalidade();
		// Herança pra diferença
		// Aluno é especialização de Pessoa
		// Pessoa é a generalização de Aluno
		
		Bolsista b1 = new Bolsista();
		b1.setNome("Cristofo");
		b1.setMatricula(12354);
		b1.pagarMensalidade();
		// pagarMensalidade é sobreposto
		
		Tecnico t1 = new Tecnico();
		t1.setNome("Craudio");
		t1.setRegistroProfissional(8794);
		t1.praticar();
		
		
		Professor p1 = new Professor();
		p1.setNome("Regis");
		p1.receberAumento(500);
		System.out.println(p1.toString());
	}

}
