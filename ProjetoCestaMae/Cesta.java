package ProjetoCestaMae;

public abstract class Cesta {
	
	
	private String alimentos;
	protected abstract void adicional(String adicional);
	
	public Cesta(String alimentos)
	{
		this.alimentos = alimentos;
	}

	public String getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(String alimentos) {
		this.alimentos = alimentos;
	}

	
	}
