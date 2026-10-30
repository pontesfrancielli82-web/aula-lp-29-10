package aula_29_10;

public class Atendente extends Funcionario{
	private Double ajudadeCusto;

	
	public Atendente(String nome, String cpf, Double salario, String cargo, String departamento, Double ajudadeCusto) {
		super(nome, cpf, salario, cargo, departamento);
		this.ajudadeCusto = ajudadeCusto;
	}

	public Double getAjudadeCusto() {
		return ajudadeCusto;
	}

	public void setAjudadeCusto(Double ajudadeCusto) {
		this.ajudadeCusto = ajudadeCusto;
	}
	

}
