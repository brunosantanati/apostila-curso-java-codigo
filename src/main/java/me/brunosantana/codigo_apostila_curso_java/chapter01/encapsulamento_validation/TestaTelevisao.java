package me.brunosantana.codigo_apostila_curso_java.chapter01.encapsulamento_validation;

public class TestaTelevisao {

	public static void main(String[] args) {

		Televisao tv = new Televisao();

		tv.setVolume(-10); //Essa linha agora irá causar o lançamento de uma IllegalArgumentException
		//Exception in thread "main" java.lang.IllegalArgumentException: Volume não pode ser menor que zero
	}

}
