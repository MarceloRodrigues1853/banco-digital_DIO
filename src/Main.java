public class Main {

	public static void main(String[] args) {
		// Cria um novo cliente chamado Marcelo
		Cliente marcelo = new Cliente();
		marcelo.setNome("Marcelo");

		// Cria uma conta corrente para o cliente Marcelo
		Conta cc = new ContaCorrente(marcelo);

		// Cria uma conta poupança para o cliente Marcelo
		Conta poupanca = new ContaPoupanca(marcelo);

		// Deposita 100 na conta corrente
		cc.depositar(100);

		// Transfere 100 da conta corrente para a conta poupança
		cc.transferir(100, poupanca);

		// Imprime o extrato da conta corrente
		cc.imprimirExtrato();

		// Imprime o extrato da conta poupança
		poupanca.imprimirExtrato();
	}
}
