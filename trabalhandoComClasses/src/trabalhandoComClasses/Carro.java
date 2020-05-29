package trabalhandoComClasses;

public class Carro {

	// Atributos
	//Lembrar encapsulamento (deixar private)
	private String cor;
	private String marca;
	// fim dos atributos

	// M�todo Construtor - tem sempre o mesmo nome da Classe
	public Carro(String cor, String marca) {
		this.cor = cor;
		this.marca = marca;
	}
	// fim do m�todo construtor - ser� executado no momento em que a classe for instanciada


	// inicio Getters and Setters
	// Gerado automadico atravez do caminho - Source > Generate Getters and Setters
	public String getCor() {
		return cor;
	}

	// void = n�o retorna nada, pois ira enviar pelo String cor,nao retornar nada
	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// fim Getters and Setters

	// Outros M�todos da Classe carro

	public void mostraMarca() {
		System.out.println("A marca do carro � " + getMarca());
	}

	public void mostraMarcaCor() {
		System.out.println("Meu carro � " + getCor() + " e a marca do carro � " + getMarca());
	}

}
