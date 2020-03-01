package com.java.poo.projetoYouTube;

public class ProjetoYouTube {

	public static void main(String[] args) {
		
		Video v[] = new Video[3];
		v[0] = new Video("Como fazer amoeba");
		v[1] = new Video("Aula de poo");
		v[2] = new Video("Calculo 1");
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Jubilei", 23, "M", "Juba");
		g[1] = new Gafanhoto("Carlos", 21, "F", "carlota");
		
		Visualizacao vis[] = new Visualizacao[3];
		vis[0] = new Visualizacao(g[0],v[1]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		vis[1] = new Visualizacao(g[0],v[2]);
		vis[1].avaliar(87.5f);
		System.out.println(vis[1].toString());
		
		
		/*System.out.println("Videos\n**********");
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		System.out.println("Gafanhotos\n**********");
		System.out.println(g[0].toString());
		System.out.println(g[1].toString());*/
		
	


		
		
		

	}

}
