package model;

public class Carro extends Veiculo{

	private int qtdPortas;

	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	
	public void descricaoCarro() {
		System.out.println("Carro " + getModelo() + " da marca " + getFabricante() + " ano " + getAno() + " e tem " + getQtdPortas() + " portas");

	}
}
