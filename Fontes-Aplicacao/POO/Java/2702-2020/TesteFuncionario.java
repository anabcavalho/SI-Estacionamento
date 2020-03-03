import java.util.Scanner;

public class TesteFuncionario {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();

		// entrada de dados
		System.out.print("Nome -> ");
		funcionario.nome = teclado.nextLine();
		System.out.print("CPF -> ");
		funcionario.cpf = teclado.nextLine();
		System.out.print("Salário -> R$ ");
		funcionario.salario = teclado.nextDouble();		

		// saída de dados
		System.out.println(funcionario.retornarDados());
		
		System.out.println("isso é tudo pessoal!");
		teclado.close();
	}
}
