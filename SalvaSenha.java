import java.util.Scanner;

public class SalvaSenha {

	public static void main(String[] args) {
		PilhaChar pilha = new PilhaChar();
		pilha.init();
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite uma senha de, no máximo, 15 caracteres: ");
		
		teclado.close();
	}	
}
