package me.brunosantana.codigo_apostila_curso_java.chapter01.encapsulamento;

public class Televisao{

	private boolean ligada;
	private int canal;
	private int volume;
	
	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void ligar(){
		System.out.println("Ligar tv");
	}
	
	public void desligar(){
		System.out.println("Desligar tv");
	}
	
	public void trocarDeCanal(int canal){
		System.out.println("trocar de canal");
	}
	
	public void aumentarVolume(){
		volume = volume + 1; 
	}
	
	@Override
	public String toString() {
		return "Televisao [ligada=" + ligada + ", canal=" + canal + ", volume=" + volume + "]";
	}
	
}
