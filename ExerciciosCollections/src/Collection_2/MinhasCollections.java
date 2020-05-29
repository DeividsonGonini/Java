package Collection_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MinhasCollections {
	public static void main(String[] args) {
		
		//Instancia o Array List do tipo inteiro
		List<Integer> minhaLista = new ArrayList<Integer>();
		
		//populando o array
		minhaLista.add(1);
		minhaLista.add(2);
		minhaLista.add(2);

		//for para printar os elementos
		for(Integer listaElementos : minhaLista) {
		System.out.println(listaElementos);
		}
		
		//LIstando com Set, com isso serao removidos os repetidos
		Set<Integer> meuSet = new HashSet<Integer>();
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(3);
		//item repetido que sera removido pelo HasSet
		meuSet.add(1);
		
		//Instanciando o Iterator
		Iterator <Integer> iMeuSet = meuSet.iterator();
		//Percorrendo com o hasNext e printando		
		while(iMeuSet.hasNext()){
			System.out.println(iMeuSet.next());
			
  		}
	}
}