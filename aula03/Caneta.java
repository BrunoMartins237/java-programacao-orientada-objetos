package com.bruno.java.poo.aula03;

public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String m, String c, float p) { //método construtor
    	this.tampar();
        this.setmodelo(m);
        this.setCor(c);
        this.setPonta(p);
    	
    }
    public String getCor() {
    	return this.cor;
    }
    public void setCor(String c) {
    	this.cor = c;
    }
    
    
    public String getmodelo() {
    	return this.modelo;
    }
    public void setmodelo(String m) {
    	this.modelo = m;
    }
    public float getPonta() {
    	return this.ponta;
    }
    public void  setPonta (float p) {
    	this.ponta = p;
    }
    public void tampar(){
    	this.tampada = true;    	
    }
    public void destampar() {
    	this.tampada = false;
    }
    public void status() {
    	System.out.println("SOBRE A CANETA");
    	System.out.println("modelo: "+this.getmodelo());
    	System.out.println("ponta: "+this.getPonta());
    	System.out.println("cor: "+this.cor);
    	System.out.println("está tampada? "+this.tampada);
    	
    }
}
