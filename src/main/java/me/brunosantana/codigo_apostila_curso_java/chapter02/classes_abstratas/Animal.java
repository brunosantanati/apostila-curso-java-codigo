package me.brunosantana.codigo_apostila_curso_java.chapter02.classes_abstratas;

public abstract class Animal {
	
	private boolean mamifero;

	public boolean isMamifero() {
		return mamifero;
	}

	public void setMamifero(boolean mamifero) {
		this.mamifero = mamifero;
	}
	
	public void comer() {
		System.out.println("comendo...");
	}
	
	public abstract void fazerSom();

}
