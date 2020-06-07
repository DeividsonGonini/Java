package Polimorfismo_2;

public class main {

	public static void main(String[] args) {

		CarroPasseio fox = new CarroPasseio();
		
		fox.EntrVeic(1072, 220, 43000);
		fox.EntrPass("preto", "Automatco");
		
		
		fox.MostrVeic();
		fox.MostrPass();
		
		
	System.out.println("----------------------");
	
		Caminhao constellation = new Caminhao();
		
		constellation.EntrVeic(16000, 120, 230000);
		constellation.EntrCam(16, 5, 15);
		
		constellation.MostrVeic();
		constellation.MostrCam();
		
		
		
		
		
	}

}
