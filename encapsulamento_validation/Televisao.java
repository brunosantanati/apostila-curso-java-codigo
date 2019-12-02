package me.brunosantana.codigo_apostila_curso_java.chapter01.encapsulamento_validation;

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
		
		if(volume < 0)
			throw new IllegalArgumentException("Volume não pode ser menor que zero");
		
		this.volume = volume;
	}

	void ligar(){
		System.out.println("Ligar tv");
	}
	
	void desligar(){
		System.out.println("Desligar tv");
	}
	
	void trocarDeCanal(int canal){
		System.out.println("trocar de canal");
	}
	
	void aumentarVolume(){
		volume = volume + 1; 
	}
	
	@Override
	public String toString() {
		return "Televisao [ligada=" + ligada + ", canal=" + canal + ", volume=" + volume + "]";
	}
	
}
