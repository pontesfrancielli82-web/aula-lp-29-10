package aula_29_10;

public class Gerente extends Funcionario{
	private String beneficios;
	private Double premiacao;
	
	public Gerente(String nome, String cpf, Double salario, String cargo, String departamento, String beneficios,
			Double premiacao) {
		super(nome, cpf, salario, cargo, departamento);
		this.beneficios = beneficios;
		this.premiacao = premiacao;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}

	public Double getPremiacao() {
		return premiacao;
	}

	public void setPremiacao(Double premiacao) {
		this.premiacao = premiacao;
	}
	

}
