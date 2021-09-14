package ProjetoCestaMae;

public class CestaM extends Cesta {
	
	public CestaM() {
		super("4 arroz, 6 Feijão, 3 açucar refinado, 1 sal refinado, 3 macarrão e dois molhos.");
					
	}
	@Override
	public void adicional(String adicional)
	{
		System.out.println("A cesta  M receberá: 2 pacote de papel higiênico, 2 pasta de dente, 5 sabonetes, 1 shampop e 1 condicionador.");
		}
	
	}

