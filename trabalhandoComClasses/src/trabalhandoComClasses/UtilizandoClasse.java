package trabalhandoComClasses;

public class UtilizandoClasse {

	public static void main(String[] args) {
		
		//Variáveis que serão parâmetro do método Construtor
		String cor = "não sei a cor";
		String marca = "não sei a Marca";
		//Fim das variáveis que serão parâmetro do método Construtor
		
		
		//instanciando a classe Carro
		//criando objeto meucarro
		//a ordem tem que ser a mesma do construtor!!!!!
		Carro meucarro = new Carro(cor, marca);
		
		//Executando o método
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
