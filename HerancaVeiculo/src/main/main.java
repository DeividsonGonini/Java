package main;

import model.Carro;
import model.Moto;

public class main {

	public static void main(String[] args) {

		Carro carro = new Carro ();
		
		carro.setModelo("Cobalt");
		carro.setFabricante("Chevrolet");
		carro.setVelocidadeAtual(50);
		carro.setAno(2015);
		carro.setQtdPortas(4);

		carro.descricaoCarro();
		carro.radar();
		carro.setAcelera(23);
		carro.acelerar();
		carro.fazerCurva();
		
		
		System.out.println("\n --------------------------\n");

		
		Moto moto = new Moto();
		moto.setModelo("PCX");
		moto.setFabricante("Honda");
		moto.setVelocidadeAtual(90);
		moto.setAno(2018);
		moto.setCilindrada(150);
		
		moto.radar();
		moto.descricaoMoto();
		moto.setFreia(25);
		moto.frear();
		moto.fazerCurva();
	}

}
