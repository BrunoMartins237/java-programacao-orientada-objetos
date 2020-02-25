package com.java.poo.aula06;

public class Lutador {
	
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	//metodos publicos
	public void apresentar() {
		System.out.println("--------------------------------------------");
		System.out.println("Apresentamos o lutador " + this.getNome());
		System.out.println("que veio do " + this.getNacionalidade());
		System.out.println("com apenas " + this.getIdade() + " anos");
		System.out.println("Medindo " + this.getAltura() + "m de altura");
		System.out.println("Pesando " + this.getPeso() + "Kg");
		System.out.println("Com " + this.getVitorias() + " vitorias");
		System.out.println( this.getDerrotas() + " derrotas");
		System.out.println("e " + this.getEmpates() + " empates");
	}
	public void status() {
		System.out.println("----------------------------------------");
		System.out.println(this.getNome());
		System.out.println("é um peso " +this.getCategoria());
		System.out.println("Com " + this.getVitorias() + " vitorias");
		System.out.println( this.getDerrotas() + " derrotas");
		System.out.println("e " + this.getEmpates() + " empates");
		
	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	public void perderLuta() {
		this.derrotas = this.derrotas + 1;
	}
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	//metodos especiais
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {
		
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();

	}
	public String getCategoria() {
		return categoria;
	}
private void setCategoria() {
	if (this.peso < 52.3f) {
		this.categoria = "invalido";
	}else if (this.peso <= 70.5f){
		this.categoria = "leve";
	}else if (this.peso <= 88.8f) {
		this.categoria = "Medio";
	}else if(this.peso <=120.9f) {
		this.categoria = "Pesado";
	}else {
		this.categoria = "invalido";}
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}

	
	
	

}
