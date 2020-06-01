package Polimorfismo_1;

public class Preguica extends Animal{
	public Preguica() {
		super("Pregui�a");
	}

	public String emitirSom() {
		return "A pregui�a: " + getNome() + " est� bocejando!";
	}
		
	
	public void subirArvore() {
		System.out.println("A pregui�a " + getNome() + " tem " + getIdade() + " anos e esta subindo numa arvore");
	}
}
