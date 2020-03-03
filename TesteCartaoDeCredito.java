import java.util.Scanner;

public class TesteCartaoDeCredito {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		CartaoDeCredito cartao = new CartaoDeCredito();

		// entrada de dados
		System.out.print("Número -> ");
		cartao.numero = teclado.nextInt();
		System.out.print("Fatura -> R$ ");
		cartao.totalFatura = teclado.nextDouble();
		
		// saída de dados
		System.out.println(cartao.retornarDados());

		teclado.close();

	}
}
