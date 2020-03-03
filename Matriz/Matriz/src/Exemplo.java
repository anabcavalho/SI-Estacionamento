import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int[3][5];

		// matriz.length: total de linhas
		// nesse caso o i controla a linha e o j a coluna]
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Informe um valor");
				matriz[i][j] = teclado.nextInt();
			}
		}
		System.out.println();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}

		teclado.close();
	}

}
