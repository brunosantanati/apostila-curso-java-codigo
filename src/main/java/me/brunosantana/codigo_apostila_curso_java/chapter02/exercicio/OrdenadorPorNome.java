package me.brunosantana.codigo_apostila_curso_java.chapter02.exercicio;

import java.util.Comparator;
import java.util.List;

public class OrdenadorPorNome implements Ordenador {

	public void ordenar(List<Usuario> listaUsuarios) {
		listaUsuarios.sort(Comparator.comparing(Usuario::getNome));
	}

}
