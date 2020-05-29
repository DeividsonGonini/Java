package Collection_1;


public class Telefone {

	private String nrTelefone;
	private int tipoTelefone; //int {0=residencial,1=comercial,2=celular}.
	
	
	//construtor
	
	Telefone(String nrTelefone, int tipoTelefone){
		this.nrTelefone = nrTelefone;
		this.tipoTelefone = tipoTelefone;
		
	}
	
	//atribuindo o retorno para a String
	public String toString(){
		return this.nrTelefone;
	}
	
	
	//getters and setters
	public String getNrTelefone() {
		return nrTelefone;
	}
	public void setNrTelefone(String nrTelefone) {
		this.nrTelefone = nrTelefone;
	}
	public int getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(int tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	
	
	
}
