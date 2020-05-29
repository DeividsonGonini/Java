package JavaTeste;

import java.util.Scanner;

public class Controle1 {
	public static void main(String args[]) {
		double nota;
		System.out.println("Entre com a sua nota: ");
		Scanner nt = new Scanner(System.in);
		nota = nt.nextDouble();
		
		//Estrutura de controle
		if(nota >6) 
			System.out.println("Aluno Aprovado");
		else 
			System.out.println("Aluno Reprovado");
	
	}
}
