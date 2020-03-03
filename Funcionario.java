
public class Funcionario {
	// atributos ou propriedades ou variáveis de instância
	String cpf;
	String nome;
	double salario;

	// método para retornar todos os dados
	public String retornarDados() {
		String aux = "";
		aux += "CPF -> " + cpf + "\n";
		aux += "Nome -> " + nome + "\n";
		aux += "Salário -> R$ " + salario + "\n";
		return aux;
	}

	// método para aumentar o salário de acordo com uma porcentagem
	public void aumentarSalario(double porcentagem) {
		salario *= (1+porcentagem/100);
	}
}
