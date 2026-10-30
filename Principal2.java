package aula_29_10;

public class Principal2 {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario ("Paulo de Campos ", "123.456.789-10","R$ 3000.00","Assistende Financeiro","Financeiro");
		System.out.println("Funcionario");
		System.out.println("Nome" + funcionario.getNome());
		System.out.println("CPF" + funcionario.getCpf());
		

	}

}
