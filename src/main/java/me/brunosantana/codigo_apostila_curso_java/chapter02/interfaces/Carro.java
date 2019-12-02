package me.brunosantana.codigo_apostila_curso_java.chapter02.interfaces;

public interface Carro {
	
	int quantidadeDeRodas = 4; //é implicitamente public static final
	public static final String paisDeFabricacao = "Brasil"; //declarando de forma mais explícita
	
	void acelerar(); //implicitamente public abstract
	public abstract void freiar(); //declarando de forma mais explícita

}
