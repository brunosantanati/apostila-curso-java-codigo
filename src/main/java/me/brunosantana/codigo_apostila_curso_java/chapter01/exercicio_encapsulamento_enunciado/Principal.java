package me.brunosantana.codigo_apostila_curso_java.chapter01.exercicio_encapsulamento_enunciado;

import java.math.BigDecimal;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		
		PaniniService service = new PaniniService();
		Map<String, String> dadosHQ = service.getDadosHQByIsbn("9788583681595");
		
		HQ hq = new HQ();
		hq.nome = dadosHQ.get("nome");
		hq.preco = new BigDecimal(dadosHQ.get("preco"));
		hq.roteirista = dadosHQ.get("roteirista");
		hq.artista = dadosHQ.get("artista");
		hq.ISBN = dadosHQ.get("ISBN");
		
		System.out.println(hq);

	}

}
