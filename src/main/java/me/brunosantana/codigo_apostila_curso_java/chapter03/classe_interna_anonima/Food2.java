package me.brunosantana.codigo_apostila_curso_java.chapter03.classe_interna_anonima;

interface Cookable{
	public void cook();
}

public class Food2 {
	
	Cookable c = new Cookable() {

		public void cook() {
			System.out.println("anonymous cookable implementer");			
		}
		
	};

	public static void main(String[] args) {
		new Food2().c.cook();
	}

}
