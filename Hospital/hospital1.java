package Hospital;

public class hospital1 {
	
	private String nomePaciente;
	private String tipoSanguineo;
	private int idade;
	
	
	public hospital1(String nomePaciente, String tipoSanguineo, int idade)
	{
		this.nomePaciente = nomePaciente;
		this.tipoSanguineo = tipoSanguineo;
		this.idade = idade; 
	}
	
	public void imprimirinf()
	{
		System.out.println("\nO paciente: "+nomePaciente+" possui o sangue do tipo: "+tipoSanguineo+" com a idade de: "
				+idade+ " anos");
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	

}
