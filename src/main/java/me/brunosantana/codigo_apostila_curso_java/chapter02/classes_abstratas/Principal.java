package me.brunosantana.codigo_apostila_curso_java.chapter02.classes_abstratas;

public class Principal {

	public static void main(String[] args) {
		// Animal a = new Animal(); //Isso resultaria em ERRO de compilação
		
		Cavalo c = new Cavalo();
		c.setMamifero(true);
		c.comer();
		c.fazerSom();
		System.out.println("cavalo eh mamifero? " + c.isMamifero());
		
		Leao l = new Leao();
		l.setMamifero(true);
		l.comer();
		l.fazerSom();
		System.out.println("leao eh mamifero? " + c.isMamifero());
	}

}