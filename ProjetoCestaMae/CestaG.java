package ProjetoCestaMae;

public class CestaG extends Cesta {
	
	public CestaG() {
		super("8 arroz, 10 Feijão, 4 açucar refinado, 1 sal refinado, 4 macarrão, 2 molho e 2 oleo");
					
	}
	@Override
	public void adicional(String adicional)
	{
		System.out.println("A cesta  M receberá: 3 pacote de papel higiênico, 3 pasta de dente, 6 sabonetes, 2 shampop, 2 condicionador e 1 álcool.");
		}

}
