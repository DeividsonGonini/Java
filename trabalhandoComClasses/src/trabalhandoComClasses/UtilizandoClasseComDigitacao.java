package trabalhandoComClasses;
import java.util.Scanner;

public class UtilizandoClasseComDigitacao {

	public static void main(String[] args) {
		//criando variaveis de memoria
		String cor = "";
		String marca = "";
		
		
		
		//instanciando a Classe Carro
		//Criar o objeto carroaluno
		
		Carro carroaluno = new Carro("","");

		//instanciando a classe Scanner
		Scanner entrada = new Scanner(System.in);
		
		
		//recebendo digitação do usuario
		System.out.print("Informe a cor: ");
		cor = entrada.nextLine();
		carroaluno.setCor(cor);
		
		System.out.print("Informe a marca: ");
		marca = entrada.nextLine();
		carroaluno.setMarca(marca);
		
		//mostrando os resultados
		
		carroaluno.mostraMarcaCor();
				
	}

}
