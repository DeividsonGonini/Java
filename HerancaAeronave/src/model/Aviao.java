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
			System.out.println("O avi�o " + getModelo() +  " do tipo " + getTipo() + " esta Voando" );
		}else {
			System.out.println("O avi�o " + getModelo() + " do tipo " + getTipo() +  " n�o esta Voando" );
		}
	}

	
}
