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
		System.out.print("Sal�rio -> R$ ");
		funcionario.salario = teclado.nextDouble();		

		// sa�da de dados
		System.out.println(funcionario.retornarDados());

		teclado.close();
	}
}
