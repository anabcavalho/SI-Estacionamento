
public class Conta {
	// atributos ou propriedades ou variáveis de instância
	int numero;
	double saldo;
	double limite;

	// método para sacar um valor
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	//método para depositar um valor na conta
	public void depositar(double valor) {
		saldo += valor;
	}
	
	//método para retornar o saldo do cliente
	public double consultarSaldo() {
		return saldo;
	}
	
	//método para retornar os dados da conta
	public String retornarDados() {
		String aux = "";
		aux += "Número -> "+numero+"\n";
		aux += "Saldo -> R$ "+saldo+"\n";
		aux += "Limite -> R$ "+limite+"\n";
		return aux;
	}
	
	//método para transferir dinheiro para outra conta
	public void transferir(Conta destino, double valor) {
		sacar(valor);
		destino.depositar(valor);
	}
}
