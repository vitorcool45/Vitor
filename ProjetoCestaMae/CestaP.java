package ProjetoCestaMae;

public class CestaP extends Cesta {
	
	public CestaP() {
		super("2 arroz, 2 Feij�o, 2 a�ucar refinado, 1 sal refinado e 2 macarr�o.");
					
	}
	@Override
	public void adicional(String adicional)
	{
		System.out.println("A cesta  P receber�: 1 pacote de papel higi�nico, 1 pasta de dente e 3 sabonetes.");
	}
	
}