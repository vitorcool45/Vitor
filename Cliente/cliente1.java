package Cliente;

public class cliente1 {
	
	private String nomeCliente;
	private String Sol;
	private String Ascendente;
	private String Lua;
	
	public cliente1(String nomeCliente, String Sol, String Ascendente, String Lua)
	{
		this.nomeCliente = nomeCliente;
		this.Sol = Sol;
		this.Ascendente = Ascendente;
		this.Lua = Lua;
	}
	
	public void imprimirfn()
	{
		System.out.println("O cliente "+nomeCliente+" fez seu mapa astral para consultar seu Sol que é em:  "+Sol
				+" , com seu ascendente tambem em "+Ascendente+" e a sua lua adinha? Sim em "+Lua);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getSol() {
		return Sol;
	}

	public void setSol(String sol) {
		Sol = sol;
	}

	public String getAscendente() {
		return Ascendente;
	}

	public void setAscendente(String ascendente) {
		Ascendente = ascendente;
	}

	public String getLua() {
		return Lua;
	}

	public void setLua(String lua) {
		Lua = lua;
	}

}