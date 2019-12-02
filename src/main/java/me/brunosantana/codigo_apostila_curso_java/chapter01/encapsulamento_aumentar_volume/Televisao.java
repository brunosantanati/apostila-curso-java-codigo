package me.brunosantana.codigo_apostila_curso_java.chapter01.encapsulamento_aumentar_volume;

public class Televisao{

	private boolean ligada;
	private int canal;
	private int volume = 10;
	
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
	
	public void aumentarVolume(){
		volume = volume + 1; 
	}
	
	public void diminuirVolume() {
		volume = volume - 1;
	}

	//outros métodos
	
}
