package me.brunosantana.codigo_apostila_curso_java.chapter01.exercicio_encapsulamento_solucao;

import java.math.BigDecimal;
import java.util.Map;

public class HQ {
	
	private String nome;
	private BigDecimal preco;
	private String roteirista;
	private String artista;
	private String ISBN;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		
		if(preco.compareTo(BigDecimal.ZERO) == -1) {
			throw new IllegalArgumentException("Preço inválido");
		}
		
		this.preco = preco;
	}

	public String getRoteirista() {
		return roteirista;
	}

	public void setRoteirista(String roteirista) {
		this.roteirista = roteirista;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	@Override
	public String toString() {
		return "HQ: \nnome=" + nome + "\npreco=" + preco + "\nroteirista=" + roteirista + "\nartista=" + artista
				+ "\nISBN=" + ISBN + "";
	}
	
	public void consumirPaniniService(String IsbnHQ) {
		
		PaniniService service = new PaniniService();
		Map<String, String> dadosHQ = service.getDadosHQByIsbn(IsbnHQ);
		
		this.nome = dadosHQ.get("nome");
		this.preco = new BigDecimal(dadosHQ.get("preco"));
		this.roteirista = dadosHQ.get("roteirista");
		this.artista = dadosHQ.get("artista");
		this.ISBN = dadosHQ.get("ISBN");
	}

}
