
public class Cliente {
	//atributos ou propriedades ou vari�veis de inst�ncia
	String nome;
	String cpf;
	CartaoDeCredito cartao = new CartaoDeCredito();
	Conta conta = new Conta();
	
	//m�todo para retornar todos os dados
	public String retornarDados() {
		String aux = "";
		aux += "Nome -> "+nome+"\n";
		aux += "CPF -> "+cpf+"\n";
		aux += cartao.retornarDados();
		aux += conta.retornarDados();
		return aux;
	}
}
