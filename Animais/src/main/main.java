package main;

import model.Cachorro;

public class main {

	public static void main(String[] args) {

		// instanciando o Objeto (só temos acesso pois a classe Cachorro é Pública)
		Cachorro cachorro = new Cachorro();

		// Setando os atributos (preenchendo)
		cachorro.setNome("Lulu");
		cachorro.setCorPelo("Preto");
		cachorro.setMama(true);
		cachorro.setFocinho(true);
		cachorro.setPorte("Grande");
		cachorro.setTipo("Doméstico");
		
		
		//Utilizando os métodos
		cachorro.andar();
		cachorro.latir();
		cachorro.fazerBarulho();
	}

}
