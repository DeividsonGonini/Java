package JavaTeste;

import java.util.Scanner;

public class EntradaSaidaJava {
	public static void main(String args[]) {
		System.out.println("Entre com a idade do seu cachorro: ");
		//instanciando a classe Scanner par entrada de dados.
		Scanner in = new Scanner(System.in);
		//criando variavel e atribuindo a tipagem que ira receber da entrada do usuario
		int idadeCachorro = in.nextInt();
		idadeCachorro = idadeCachorro * 7;
		System.out.println("Meu cachorro tem: " + idadeCachorro + " anos de vida.");
	}

}
