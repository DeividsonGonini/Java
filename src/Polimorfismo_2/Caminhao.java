package Polimorfismo_2;

public class Caminhao extends Veiculo {

	float tonelada;
	int alturaMax;
	int comprimento;

	public Caminhao() {
		super("Caminhao");
	}

	public float getTonelada() {
		return tonelada;
	}

	public void setTonelada(float tonelada) {
		this.tonelada = tonelada;
	}

	public int getAlturaMax() {
		return alturaMax;
	}

	public void setAlturaMax(int alturaMax) {
		this.alturaMax = alturaMax;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}


	public void EntrCam(float tonelada, int alturaMax, int comprimento) {
		this.tonelada = tonelada;
		this.alturaMax = alturaMax;
		this.comprimento = comprimento;
	};

	
	public void MostrCam() {
		System.out.println("Peso caminhao: " + getTonelada() + " toneladas/n" + "Altura Max. do caminhao: "
				+ getAlturaMax() + " metros /n" + "Comprimento maximo do caminhao: " + getComprimento() + "metros");

	};

}
