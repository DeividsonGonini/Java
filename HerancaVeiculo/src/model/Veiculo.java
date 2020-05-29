package model;

public class Veiculo {
	
	private String modelo;
	private String fabricante;
	private int ano;
	private float velocidadeAtual;
	private float acelera;
	private float freia;
	
/*
	public Veiculo(String modelo,String fabricante, float velocidadeAtual ) {
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.velocidadeAtual = velocidadeAtual;
			}
*/
	
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public float getVelocidadeAtual() {
		return velocidadeAtual;
	}


	public void setVelocidadeAtual(float velocidade) {
		this.velocidadeAtual = velocidade;
	}
	
	
	public float getAcelera() {
		return acelera;
	}
	public void setAcelera(float acelera) {
		this.acelera = acelera;
	}
	public float getFreia() {
		return freia;
	}
	public void setFreia(float freia) {
		this.freia = freia;
	}
	

	
	
	
	
	public void radar() {
		System.out.println("O veículo " + getModelo() + " da marca " + getFabricante() + " passou numa velocidade de " + getVelocidadeAtual() + " km/h");
	}
	
	
	
	public void acelerar() {
	float novaVelocidade = getVelocidadeAtual() + getAcelera();
	setVelocidadeAtual(novaVelocidade);
	System.out.println("O veiculo acelerou e agora encontra-se em " + getVelocidadeAtual() + "km/h");
	}
	
	
	public void frear() {
		float novaVelocidade = getVelocidadeAtual() - getFreia();
		setVelocidadeAtual(novaVelocidade);
		System.out.println("O veiculo freou e agora encontra-se em " + getVelocidadeAtual() + "km/h");
	}
	
	
	
	
	public void fazerCurva() {
		if(getVelocidadeAtual() >= 70) {
			System.out.println("O veículo " + getModelo() + " capotou, pois estava em uma velocidade de " + getVelocidadeAtual() + "km/h, onde poderia estar no maximo a 69 km/h");
		}else {
			System.out.println("Curva realizada com sucesso!");
		}
	}
	

}
