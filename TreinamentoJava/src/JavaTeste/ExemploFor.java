package JavaTeste;

import java.util.Scanner;

public class ExemploFor {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int i, somapar = 0, somaimpar = 0, valor;
		System.out.println("Entre com um valor: ");
		valor = leitor.nextInt();

		// Estrutura do For
		for (i = 0; i <= valor; i++) {
			// % = mod, traz o resto da divisao, se dividido por 2 for igual a 0, o numero é
			// par
			if (i % 2 == 0) {
				somapar = somapar + i;
			} else {
				somaimpar = somaimpar + i;
			}
		}

		// fora do for porque se nao ira rodar todas as vezes que o for ocorrer
		System.out.println("Soma de pares: " + somapar);
		System.out.println("Soma de impares: " + somaimpar);
	}

}
