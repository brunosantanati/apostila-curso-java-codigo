package me.brunosantana.codigo_apostila_curso_java.chapter01.exercicio_encapsulamento_enunciado;

import java.util.HashMap;
import java.util.Map;

public class PaniniService {
	
	private final static String O_REI_DA_COZINHA_DO_INFERNO_ISBN = "9788583681595";
	private final static String BATMAN_ANO_ZERO = "9788583682325";
	
	public Map<String, String> getDadosHQByIsbn(String IsbnHQ) {
		
		Map<String, String> infoHQ = new HashMap<>();
		
		switch (IsbnHQ) {
		case O_REI_DA_COZINHA_DO_INFERNO_ISBN:
			infoHQ.put("nome", "O Rei da Cozinha do Inferno");
			infoHQ.put("preco", "50.00");
			infoHQ.put("roteirista", "Brian Michael Bendis");
			infoHQ.put("artista", "Alex Maleev");
			infoHQ.put("ISBN", O_REI_DA_COZINHA_DO_INFERNO_ISBN);
			break;
		case BATMAN_ANO_ZERO:
			infoHQ.put("nome", "Batman: Ano Zero");
			infoHQ.put("preco", "70.00");
			infoHQ.put("roteirista", "Scott Snyder");
			infoHQ.put("artista", "Greg Capullo");
			infoHQ.put("ISBN", BATMAN_ANO_ZERO);
			break;
		}
		
		return infoHQ;
	}

}
