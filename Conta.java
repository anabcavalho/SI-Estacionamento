
public class Conta {
	// atributos ou propriedades ou vari�veis de inst�ncia
	int numero;
	double saldo;
	double limite;

	// m�todo para sacar um valor
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	//m�todo para depositar um valor na conta
	public void depositar(double valor) {
		saldo += valor;
	}
	
	//m�todo para retornar o saldo do cliente
	public double consultarSaldo() {
		return saldo;
	}
	
	//m�todo para retornar os dados da conta
	public String retornarDados() {
		String aux = "";
		aux += "N�mero -> "+numero+"\n";
		aux += "Saldo -> R$ "+saldo+"\n";
		aux += "Limite -> R$ "+limite+"\n";
		return aux;
	}
	
	//m�todo para transferir dinheiro para outra conta
	public void transferir(Conta destino, double valor) {
		sacar(valor);
		destino.depositar(valor);
	}
}
