package com.java.poo.projetoLivro;

public class projetoLivro {

	public static void main(String[] args) {
		
		Pessoa p[] = new Pessoa[3];
		Livro l[] = new Livro[3];
		p[0] = new Pessoa("João", 45, "Masculino");
		p[1] = new Pessoa("Maria", 12, "Feminino");
		p[2] = new Pessoa("Guilherme", 26, "Feminino");
		l[0] = new Livro("Auto da compadecida", "Ariano", 300, p[2]);
		l[1] = new Livro("poo para iniciantes", "Joao toicinho", 200, p[0]);
		l[0].folhear(400);
	    System.out.println(l[0].detalhes());
	  
	    
		
		
		
		

	}

}
