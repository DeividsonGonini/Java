package model;

public class Helicoptero extends Aeronave{

	private boolean heliceLigada;

	public boolean isHeliceLigada() {
		return heliceLigada;
	}

	public void setHeliceLigada(boolean heliceLigada) {
		this.heliceLigada = heliceLigada;
	}

	public void helicopteroLigado() {
		if (this.heliceLigada == true) {
			System.out.println("O helicoptero " + getModelo() +  " do tipo " + getTipo() + " esta Ligado" );
		}else {
			System.out.println("O helicoptero " + getModelo() + " do tipo " + getTipo() +  " esta desligado" );
		}
	}

}
