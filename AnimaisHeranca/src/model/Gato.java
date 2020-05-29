package model;

public class Gato extends Mamifero {

	private boolean bigode;

	
	//Getters and Setters
	public boolean isBigode() {
		return bigode;
	}

	public void setBigode(boolean bigode) {
		this.bigode = bigode;
	}
	
	//FIM Getters and Setters
	
	
	//Metodos
	public void miar() {
		System.out.println("O gato " + getNome() + " está miando!");
	}
	
}
