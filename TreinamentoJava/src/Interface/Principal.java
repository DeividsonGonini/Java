package Interface;

public class Principal {

	public static void main(String[] args) {
		//instanciando
		ParticipanteForum participante = new ParticipanteForum();
		//Upcast para Programador
		Leitor leitor = participante;
		System.out.println("O participante esta lendo " + leitor.lendo());
		
		//upcast para Programador
		Programador programador = participante;
		String java = "Java";
		programador.pensando(java.toCharArray());
		System.out.println("E o programador " + programador.digitando());
	}

}
