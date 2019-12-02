package me.brunosantana.codigo_apostila_curso_java.chapter01.classes_e_objetos;

public class TestaTelevisao {

	public static void main(String[] args) {
		// criando um objeto, ou seja, instanciando a classe Televisao
		Televisao tv1 = new Televisao();
		// mudando o estado do objeto
		tv1.ligada = true;
		tv1.canal = 4;
		tv1.volume = 50;
		// chamando método para executar um comportamento/ação
		tv1.aumentarVolume();
		// imprime objeto no console
		System.out.println(tv1);
	
		// criando outro objeto, ou seja, criando outra instância
		Televisao tv2 = new Televisao();
		// mudando o estado do objeto, ou seja,
		// alterando os valores das variáveis de instância
		tv2.ligada = true;
		tv2.canal = 5;
		tv2.volume = 70;
		// imprime objeto no console
		System.out.println(tv2);
	}

}
