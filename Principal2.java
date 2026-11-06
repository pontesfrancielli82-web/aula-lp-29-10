package aula_29_10;

public class Principal2 {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario ("Paulo de Campos ", "123.456.789-10", 3000.00,"Assistente Financeiro","Financeiro");
		System.out.println("Funcionario:");
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("CPF: " + funcionario.getCpf());
		System.out.println("Salários: " + funcionario.getSalario());
		System.out.println("Cargo: " + funcionario.getCargo());
		System.out.println("Departamento: " + funcionario.getDepartamento());
		
		Atendente atendente = new Atendente ("Ana do Santos", "32165498710", 2000.00,"Vendas", "Vendedor",100.00);
		System.out.println("\nAtendente:");
		System.out.println("Nome: " + atendente.getNome());
		System.out.println("CPF:  " + atendente.getCpf());
		System.out.println("Salários: " + atendente.getSalario());
		System.out.println("Cargo: " + atendente.getCargo());
		System.out.println("Departamento: " + atendente.getDepartamento());
		System.out.println("Ajuda de Custo: " + atendente.getAjudadeCusto());
		
		Gerente gerente = new Gerente ("Maria Clara"," 01020304050", 4000.00, "Gerente", "Gerente de Departamento","Meta Batida", 500.00);
		System.out.println("\nGerente:");
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("CPF: " + gerente.getCpf());
		System.out.println("Salários: " + gerente.getSalario());
		System.out.println("Cargo: " + gerente.getCargo());
		System.out.println("Departamento: " + gerente.getDepartamento());
		System.out.println("Beneficios: " + gerente.getBeneficios());
		System.out.println("Premiação: "+ gerente.getPremiacao());
		
		
		

	}

}
