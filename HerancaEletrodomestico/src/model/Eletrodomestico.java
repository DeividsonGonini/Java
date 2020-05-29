package model;

public class Eletrodomestico {

	private String nome;
	private float voltagem;
	private String cor;
	
	
	//metodo construtor
	public Eletrodomestico(String nome, float voltagem, String cor) {
		this.nome = nome;
		this.voltagem = voltagem;
		this.cor = cor;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public float getVoltagem() {
		return voltagem;
	}


	public void setVoltagem(float voltagem) {
		this.voltagem = voltagem;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public void descricaoEletrodomestico() {
		System.out.println("O eletrodomestico " + getNome() + " tem que ser ligado na voltagem " + getVoltagem() + " e é da cor " + getCor());
	}
	
	
	
	
	
}
