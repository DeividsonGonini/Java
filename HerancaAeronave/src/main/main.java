package main;

import model.Aviao;
import model.Helicoptero;

public class main {


	public static void main(String[] args) {

		Helicoptero helicoptero = new Helicoptero();
		
		helicoptero.setTipo("Militar");
		helicoptero.setModelo("Apache");
		helicoptero.setPaisOrigem("Estados Unidos");
		helicoptero.setHeliceLigada(true);
		
		
		helicoptero.helicopteroLigado();
		

		System.out.println("\n --------------------------\n");

		Aviao aviao = new Aviao();
		
		aviao.setTipo("Cargueiro");
		aviao.setModelo("BelugaXL");
		aviao.setTurbinaLigada(false);
		
		aviao.aviaoLigado();
		
	}

}
