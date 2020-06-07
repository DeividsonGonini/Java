package Polimorfismo_2;

public abstract class Veiculo {


	float peso;
	float velMax;
	float preco;
	String tipo;
	
	public Veiculo(String tipo) {
		this.tipo = tipo;
	}
	
				
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getVelMax() {
		return velMax;
	}

	public void setVelMax(float velMax) {
		this.velMax = velMax;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

		
	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public void EntrVeic(float peso, float velMax,	float preco) {
		this.peso = peso;
		this.velMax = velMax;
		this.preco = preco;
		
	};

	
	
	public void MostrVeic() {
		System.out.println("O veículo pesa " + getPeso() + 
				"KG, chega a uma velocidade maxima de " + getVelMax() +
				"k/h e custa " + getPreco());
		
		
	};
}
