package Polimorfismo_1;

public class Preguica extends Animal{
	public Preguica() {
		super("Preguiça");
	}

	public String emitirSom() {
		return "A preguiça: " + getNome() + " está bocejando!";
	}
		
	
	public void subirArvore() {
		System.out.println("A preguiça " + getNome() + " tem " + getIdade() + " anos e esta subindo numa arvore");
	}
}
