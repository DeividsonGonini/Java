package Interface;

interface Leitor {

	String lendo();
}

interface Programador {
	void pensando(char[] ideias);

	String digitando();
}

class ParticipanteForum implements Leitor, Programador {
	String pensamento;

	// metodo definido na interface Leitor
	public String lendo() {
		return "Forum";
	}

	// metodo definido na interface Programador
	public void pendando(char[] ideias) {
		pensamento = new String(ideias);
	}

	// metodo definido na interface Programador
	public String digitando() {
		return pensamento;
	}

	// metodo exclusivo dessa classe
	private String aprendendo() {
		return "Java";
	}
}