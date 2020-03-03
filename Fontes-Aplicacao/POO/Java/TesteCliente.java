import java.util.Scanner;

public class TesteCliente {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		//entrada de dados
		System.out.print("Nome -> ");
		cliente.nome = teclado.nextLine();
		System.out.print("CPF -> ");
		cliente.cpf = teclado.nextLine();
		cliente.cartao.numero = 15;
		cliente.cartao.totalFatura = 9000.00;
		
		//saída de dados
		System.out.println(cliente.retornarDados());
		
		
		teclado.close();
	}
}
