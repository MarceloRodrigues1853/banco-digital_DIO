public class ContaPoupanca extends Conta {

	// Construtor que inicializa uma ContaPoupanca com o cliente fornecido
	public ContaPoupanca(Cliente cliente) {
		super(cliente);  // Chama o construtor da classe pai (Conta)
	}

	// Método sobrescrito para imprimir o extrato da ContaPoupanca
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");  // Imprime o cabeçalho do extrato
		super.imprimirInfosComuns();  // Chama o método da classe pai para imprimir as informações comuns
	}
}
