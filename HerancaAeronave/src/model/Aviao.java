package model;

public class Aviao extends Aeronave {

	private boolean turbinaLigada;
	

	public boolean isTurbinaLigada() {
		return turbinaLigada;
	}

	public void setTurbinaLigada(boolean turbinaLigada) {
		this.turbinaLigada = turbinaLigada;
	}

	public void aviaoLigado() {
		if (this. turbinaLigada== true) {
			System.out.println("O avião " + getModelo() +  " do tipo " + getTipo() + " esta Voando" );
		}else {
			System.out.println("O avião " + getModelo() + " do tipo " + getTipo() +  " não esta Voando" );
		}
	}

	
}
