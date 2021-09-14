package ProjetoCestaMae;

public class TesteCesta2  {

	
	public static void mostracestas() {
	

	
		CestaP cestap = new CestaP();
		CestaM cestam = new CestaM();
		CestaG cestag = new CestaG();
		
			
		 
		System.out.println("\nAlimentos da cesta P: "+cestap.getAlimentos()); cestap.adicional("adicional");
		
	
		System.out.println("\nAlimentos da cesta M: "+cestam.getAlimentos()); cestam.adicional("adicional");
		
		
		System.out.println("\nAlimento da cesta Gs: "+cestag.getAlimentos()); cestag.adicional("adicional");
		}
	
}
		

