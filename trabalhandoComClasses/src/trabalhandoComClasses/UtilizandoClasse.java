package trabalhandoComClasses;

public class UtilizandoClasse {

	public static void main(String[] args) {
		
		//Vari�veis que ser�o par�metro do m�todo Construtor
		String cor = "n�o sei a cor";
		String marca = "n�o sei a Marca";
		//Fim das vari�veis que ser�o par�metro do m�todo Construtor
		
		
		//instanciando a classe Carro
		//criando objeto meucarro
		//a ordem tem que ser a mesma do construtor!!!!!
		Carro meucarro = new Carro(cor, marca);
		
		//Executando o m�todo
		meucarro.mostraMarcaCor();
		
		
		//trocando a cor do carro
		meucarro.setCor("vermelho");
		
		//executando o metodo
		meucarro.mostraMarcaCor();
		
		marca="Fiat";
		meucarro.setMarca(marca);
		meucarro.mostraMarca();
	}

}
