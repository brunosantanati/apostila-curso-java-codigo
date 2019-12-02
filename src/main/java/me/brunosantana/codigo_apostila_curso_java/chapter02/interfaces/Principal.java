package me.brunosantana.codigo_apostila_curso_java.chapter02.interfaces;

public class Principal {

	public static void main(String[] args) {
		Ferrari f = new Ferrari();
		System.out.printf("Qtde. de rodas: %d, País de Fabricação: %s\n", 
				Ferrari.quantidadeDeRodas, Ferrari.paisDeFabricacao);
		f.acelerar();
		f.freiar();
	}

}
