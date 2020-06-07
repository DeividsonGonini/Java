package Polimorfismo_2;

public class CarroPasseio extends Veiculo{

	String cor;
	String modelo;
	
	public CarroPasseio() {
		super("Carro Passeio");
		
		
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	

	public void EntrPass(String cor, String modelo) {
		this.cor = cor;
		this.modelo = modelo;
		
		
	};

	
	
	public void MostrPass() {
		System.out.println("Cor do carro " + getCor() + 
				" modelo do carro " + getModelo()
				);
		
		
	};




}
