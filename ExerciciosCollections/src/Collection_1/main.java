package Collection_1;

import java.util.*;

public class main {

	public static void main(String[] args) {

		// Instanciando os objetos
		Telefone a = new Telefone("95574-1378", 2);
		Telefone b = new Telefone("5032-1190", 0);
		Telefone c = new Telefone("2978-1275", 1);
		Telefone d = new Telefone("9999-1599", 2);

		List<Telefone> lista = new ArrayList<>();

		// Adicionando na lista
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		
		//imprimindo o array
		System.out.println(lista);

		
		//imprimindo pelo Iterator
		Telefone telefone;
		Iterator<Telefone> itr = lista.iterator();
		while (itr.hasNext()) {
			telefone = itr.next();
			System.out.println(telefone.getNrTelefone());
		}

	}

}
