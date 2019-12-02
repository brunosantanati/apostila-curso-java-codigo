package me.brunosantana.codigo_apostila_curso_java.chapter02.exercicio;

import java.util.Arrays;
import java.util.List;

public class Principal {
	
	private Ordenador ordenador;
	private List<Usuario> listaUsuarios;
	
	public Principal(Ordenador ordenador) {
		Usuario usuario1 = new Usuario("Bruno", 5000);
		Usuario usuario2 = new Usuario("Anderson", 8000);
		Usuario usuario3 = new Usuario("Eliza", 7500);
		listaUsuarios = Arrays.asList(usuario1, usuario2, usuario3);
		
		this.setOrdenador(ordenador);
	}

	public void setOrdenador(Ordenador ordenador) {
		this.ordenador = ordenador;
	}
	
	public void ordenarLista() {
		this.ordenador.ordenar(this.listaUsuarios);
		mostrarListaOrdenada();
	}
	
	private void mostrarListaOrdenada() {
		this.listaUsuarios.forEach(System.out::println);		
	}

	public static void main(String[] args) {
		Principal p = new Principal(new OrdenadorPorNome());
		p.ordenarLista();
		System.out.println("-------------");
		p.setOrdenador(new OrdenadorPorPontos());
		p.ordenarLista();
	}

}
