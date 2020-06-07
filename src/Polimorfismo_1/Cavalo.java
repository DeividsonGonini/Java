package Polimorfismo_1;

public class Cavalo extends Animal{
public Cavalo() {
	super("Cavalo");
}
	

public String emitirSom() {
	return "o cavalo: " + getNome() + " está relinchando!";
}
	
	
	
	public void correr() {
		System.out.println("O cavalo " + getNome() + " tem " + getIdade() + " anos e esta correndo");
	}
}
