import java.util.Scanner;

public class TesteCartaoDeCredito {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		CartaoDeCredito cartao = new CartaoDeCredito();

		// entrada de dados
		System.out.print("N�mero -> ");
		cartao.numero = teclado.nextInt();
		System.out.print("Fatura -> R$ ");
		cartao.totalFatura = teclado.nextDouble();
		
		// sa�da de dados
		System.out.println(cartao.retornarDados());

		teclado.close();

	}
}
