package Polimorfismo_1;

public abstract class Animal {

	private String nome;
	private int idade;
	private String tipo;
	

	public Animal(String tipo) {
		this.tipo = tipo;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public abstract String emitirSom();
	
}
