package me.brunosantana.codigo_apostila_curso_java.chapter01.exercicio_encapsulamento_solucao;

import java.math.BigDecimal;

public class Principal {

	public static void main(String[] args) {
		
		HQ hq = new HQ();
		hq.consumirPaniniService("9788583682325");		
		System.out.println(hq);

		hq.setPreco(new BigDecimal("-10.00")); //Isso deve produzir uma IllegalArgumentException
	}

}
