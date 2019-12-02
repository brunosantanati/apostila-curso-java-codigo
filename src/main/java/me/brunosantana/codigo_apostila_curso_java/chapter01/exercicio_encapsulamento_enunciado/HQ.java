package me.brunosantana.codigo_apostila_curso_java.chapter01.exercicio_encapsulamento_enunciado;

import java.math.BigDecimal;

public class HQ {
	
	public String nome;
	public BigDecimal preco;
	public String roteirista;
	public String artista;
	public String ISBN;
	
	@Override
	public String toString() {
		return "HQ: \nnome=" + nome + "\npreco=" + preco + "\nroteirista=" + roteirista + "\nartista=" + artista
				+ "\nISBN=" + ISBN + "";
	}

}
