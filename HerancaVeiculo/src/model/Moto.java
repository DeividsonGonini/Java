package model;

public class Moto extends Veiculo{


	
	private int cilindrada;

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public void descricaoMoto() {
		System.out.println("Moto " + getModelo() + " da marca " + getFabricante() + " ano " + getAno() + " e tem " + getCilindrada() + " cilindradas");

	}

}
