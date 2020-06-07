package Polimorfismo_1;

public class main {
	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro();
		cachorro.setIdade(3);
		cachorro.setNome("Pluto");
		
		Preguica preguica = new Preguica();
		preguica.setNome("Jose");
		preguica.setIdade(21);		
		
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Yoda");
		
		System.out.println(emitirSomAnimal(cachorro));
		System.out.println(emitirSomAnimal(preguica));
		System.out.println(emitirSomAnimal(cavalo));
	
	
preguica.subirArvore();		




Veterinario vet = new Veterinario();

vet.examinar(cavalo);
vet.examinar(preguica);
vet.examinar(cachorro);
}

	
	
	
	
	
	
	
	
	public static String emitirSomAnimal(Animal animal) {
		return animal.emitirSom();
	}
	
	
	

}
