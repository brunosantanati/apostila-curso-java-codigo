package me.brunosantana.codigo_apostila_curso_java.chapter01.classes_e_objetos;

public class Televisao{

	//os campos abaixo representam o estado
	boolean ligada;
	int canal;
	int volume;
	
	//os métodos abaixo representam os comportamentos
	void ligar(){
		//código para ligar a TV
	}
	
	void desligar(){
		//código para desligar a TV
	}
	
	void trocarDeCanal(int canal){
		//código para trocar de canal
	}
	
	void aumentarVolume(){
		volume = volume + 1; 
	}
	
	@Override
	public String toString() {
		return "Televisao [ligada=" + ligada + ", canal=" + canal + ", volume=" + volume + "]";
	}
	
}
