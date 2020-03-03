
public class Bloquinho {

	public static void main(String[] args) {

		int[] vi = {1, 2, 3 };
		double[] vd = {1.1, 2.2, 3.3 };
		String[] vs = {"hey", "dude", "go" };
		
		Bloquinho.imprimir(vd);
		Bloquinho.imprimir(vi);
		Bloquinho.imprimir(vs);
		
	}

	public static void imprimir(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}

	public static void imprimir(double[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}

	public static void imprimir(String[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}
}
