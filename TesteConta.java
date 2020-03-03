import java.util.Scanner;

public class TesteConta {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Conta conta = new Conta();
		
		//entrada de dados
		System.out.print("Número -> ");
		conta.numero = teclado.nextInt();
		System.out.print("Saldo inicial -> R$ ");
		conta.saldo = teclado.nextDouble();
		System.out.print("Limite -> R$ ");
		conta.limite = teclado.nextDouble();
				
		//saída de dados
		System.out.println(conta.retornarDados());
		
		teclado.close();
	}
}
