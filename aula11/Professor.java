package com.java.poo.aula11;

public class Professor extends Pessoa {
	private String especialidade;
	private float salario;
	
	public void receberAumento(float novo) {
		this.setSalario(this.getSalario() + novo);
		System.out.println("Salário ajustado " +this.getSalario());
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
