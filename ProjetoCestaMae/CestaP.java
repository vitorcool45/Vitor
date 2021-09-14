package ProjetoCestaMae;

public class CestaP extends Cesta {
	
	public CestaP() {
		super("2 arroz, 2 Feijão, 2 açucar refinado, 1 sal refinado e 2 macarrão.");
					
	}
	@Override
	public void adicional(String adicional)
	{
		System.out.println("A cesta  P receberá: 1 pacote de papel higiênico, 1 pasta de dente e 3 sabonetes.");
	}
	
}