package me.brunosantana.codigo_apostila_curso_java.chapter01.encapsulamento_aumentar_volume;

public class TestaTelevisao {

	public static void main(String[] args) {

		Televisao tv = new Televisao();
		System.out.println("volume: " + tv.getVolume());
		
		tv.aumentarVolume();
		tv.aumentarVolume();
		System.out.println("volume: " + tv.getVolume());
		
		tv.diminuirVolume();
		System.out.println("volume: " + tv.getVolume());
	}

}
