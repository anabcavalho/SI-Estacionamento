import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int dp = 0, ds = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println("Informe um valor");
				matriz[i][j] = teclado.nextInt();
				
				if(i == j) {
					dp += matriz[i][j];
				}
				if(i+j == matriz.length-1) {
					ds += matriz[i][j];
				}
			}
		}
		System.out.println();
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.println(matriz[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Soma da diagonal principal -> " +dp);
		System.out.println("Soma da diagonal secundária -> "+ds);

		teclado.close();
	}

}
