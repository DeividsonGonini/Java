package Polimorfismo_1;

public class Cachorro extends Animal{

	public Cachorro() {
		super("Cavalo");

	}
	
	
@Override
	public String emitirSom() {
		return "o cachorro: " + getNome() + " est� latindo!";
	}
	
	
	public void correr() {
		System.out.println("O cachorro " + getNome() + " tem " + getIdade() + " anos e esta correndo");
	}

}
