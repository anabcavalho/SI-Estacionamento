
public class TesteTransferencia {
	public static void main(String[] args) {
		
		Conta maria = new Conta();
		maria.saldo = 5500;
		
		Conta jao = new Conta();
		jao.saldo = 200;

		/*maria.transferir(jao, 2000);
		System.out.println("conta da maria: " + maria.retornarDados());
		System.out.println("conta do jao: " + jao.retornarDados());
		
		jao.transferir(maria, 2500);
		System.out.println("conta da maria: " + maria.retornarDados());
		System.out.println("conta do jao: " + jao.retornarDados());*/
		
		//ex extra
		Conta selmini = new Conta();
		selmini.saldo = 5600;
		
		//chamada para um método que vai receber como parâmetro os três 
		//objetos e vai retornar o objeto com o maior saldo
		Conta aux = maiorSaldo(maria, jao, selmini);
		System.out.println(aux.retornarDados());
	}
	
	public static Conta maiorSaldo(Conta maria, Conta jao, Conta selmini) {
		Conta aux = null;
		
		if(maria.saldo > jao.saldo && maria.saldo > selmini.saldo) {
			aux = maria;
		} else if (jao.saldo > selmini.saldo) {
			aux = jao;
		} else {
			aux = selmini;
		}
		
		return aux;
	}
}
