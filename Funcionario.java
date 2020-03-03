
public class Funcionario {
	// atributos ou propriedades ou vari�veis de inst�ncia
	String cpf;
	String nome;
	double salario;

	// m�todo para retornar todos os dados
	public String retornarDados() {
		String aux = "";
		aux += "CPF -> " + cpf + "\n";
		aux += "Nome -> " + nome + "\n";
		aux += "Sal�rio -> R$ " + salario + "\n";
		return aux;
	}

	// m�todo para aumentar o sal�rio de acordo com uma porcentagem
	public void aumentarSalario(double porcentagem) {
		salario *= (1+porcentagem/100);
	}
}
