package me.brunosantana.codigo_apostila_curso_java.chapter01.encapsulamento;

public class TestaTelevisao {

	public static void main(String[] args) {
		Televisao tv1 = new Televisao();
		tv1.setLigada(true);
		tv1.setCanal(4);
		tv1.setVolume(50);
		tv1.aumentarVolume();
		System.out.println(tv1);
	}

}
