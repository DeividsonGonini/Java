package main;

import model.Cachorro;

public class main {

	public static void main(String[] args) {

		// instanciando o Objeto (s� temos acesso pois a classe Cachorro � P�blica)
		Cachorro cachorro = new Cachorro();

		// Setando os atributos (preenchendo)
		cachorro.setNome("Lulu");
		cachorro.setCorPelo("Preto");
		cachorro.setMama(true);
		cachorro.setFocinho(true);
		cachorro.setPorte("Grande");
		cachorro.setTipo("Dom�stico");
		
		
		//Utilizando os m�todos
		cachorro.andar();
		cachorro.latir();
		cachorro.fazerBarulho();
	}

}
