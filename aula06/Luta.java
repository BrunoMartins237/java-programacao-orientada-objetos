package com.java.poo.aula06;

	import java.util.Random;

	public class Luta {
		//atributos
		private Lutador desafiado;
		private Lutador desafiante;
		private int rounds;
		private boolean aprovada;
		//Métodos publicos
		public void marcarLuta(Lutador l1, Lutador l2) {
			if (l1.getCategoria().equals(l2.getCategoria())
					&& l1 != l2) {
				this.setAprovada(true);
				this.setDesafiado(l1);
				this.setDesafiante(l2);
			}else {
				this.aprovada = false;
				this.setDesafiante(null);
				this.setDesafiado(null);
			}
			
		}
		public void lutar() {
			if (this.aprovada) {
				System.out.println("*** DESAFIADO ***");
				this.desafiado.apresentar();
				System.out.println("*** DESAFIANTE ***");
				this.desafiante.apresentar();
				
				Random aleatorio = new Random();
				int vencedor = aleatorio.nextInt(3);// 0 1 2
				System.out.println("===== RESULTADO =====");
				switch(vencedor) {
				        // EMPATE
				case 0: System.out.println("A luta ficou empatada");
					    this.desafiante.empatarLuta();
				        this.desafiado.empatarLuta();
				        break;
				        // DESAFIANTE GANHA
				case 1: System.out.println("Vitoria do desafiante " + this.getDesafiante().getNome());
					    this.desafiante.ganharLuta();
				        this.desafiado.perderLuta();
				        break;
				        // DESAFIADO GANHA
				case 2: System.out.println("VItoria do desafiado " + this.getDesafiado().getNome());
					    this.desafiado.ganharLuta();
				        this.desafiante.perderLuta();
				        break;
				
				}System.out.println("=====================");
				
				
			}else {
				System.out.println("A luta não pode acontecer");
			}
			
		}
		//métodos especiais
		public Lutador getDesafiado() {
			return desafiado;
		}
		public void setDesafiado(Lutador desafiado) {
			this.desafiado = desafiado;
		}
		public Lutador getDesafiante() {
			return desafiante;
		}
		public void setDesafiante(Lutador desafiante) {
			this.desafiante = desafiante;
		}
		public int getRounds() {
			return rounds;
		}
		public void setRounds(int rounds) {
			this.rounds = rounds;
		}
		public boolean getAprovada() {
			return aprovada;
		}
		public void setAprovada(boolean aprovada) {
			this.aprovada = aprovada;
		}
		

	}



