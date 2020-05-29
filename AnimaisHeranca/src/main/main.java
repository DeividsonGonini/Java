package main;

import model.Cachorro;
import model.Gato;

public class main {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro();

		//Atributos HERDADOs da Classe Pai Mamifero
		cachorro.setNome("Lulu");
		cachorro.setMama(false);
		cachorro.setFocinho(true);

		//Atributo exclusivo da classe filho Cachorro
		cachorro.setPorte("Médio");

		//Metodos HERDADO da Classe Pai Mamifero
		cachorro.andar();
		cachorro.fazerBarulho();
		
		//Metodos unicos da classe Filho Cachorro
		cachorro.latir();
		
		System.out.println("\n --------------------------\n");

		
		//instanciando o Objeto Gato
		Gato gato = new Gato();

		//Atributos HERDADOS da Classe Pai Mamifero
		gato.setNome("Mingal");
		gato.setMama(true);
		gato.setFocinho(true);
		
		//Atributos exclusivos da Classe Filho Gato
		gato.setBigode(true);
		
		
		//Metodos HERDADO da Classe Pai Mamifero
		gato.andar();
		gato.fazerBarulho();
		
		//Metodos exclusivos da Classe Filho Gato
		gato.miar();
				
		
	}

}
