public class ContaCorrente extends Conta {

	// Construtor que inicializa uma ContaCorrente com o cliente fornecido
	public ContaCorrente(Cliente cliente) {
		super(cliente);  // Chama o construtor da classe pai (Conta)
	}

	// Método sobrescrito para imprimir o extrato da ContaCorrente
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");  // Imprime o cabeçalho do extrato
		super.imprimirInfosComuns();  // Chama o método da classe pai para imprimir as informações comuns
	}
}
