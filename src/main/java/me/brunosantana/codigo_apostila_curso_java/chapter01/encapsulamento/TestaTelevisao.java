package me.brunosantana.codigo_apostila_curso_java.chapter01.encapsulamento;

public class TestaTelevisao {

	public static void main(String[] args) {
		
		//instanciando objeto
		Televisao tv = new Televisao();
		
		//usando setters
		tv.setLigada(true);
		tv.setCanal(4);
		tv.setVolume(50);
		tv.aumentarVolume();
		
		//usando getters
		System.out.println("Televisao -> ligada=" + tv.isLigada() +
				" canal=" + tv.getCanal() + " volume=" + tv.getVolume());
	}

}
