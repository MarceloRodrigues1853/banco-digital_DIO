public interface IConta {

	// Método para sacar um valor da conta
	void sacar(double valor);

	// Método para depositar um valor na conta
	void depositar(double valor);

	// Método para transferir um valor para outra conta
	void transferir(double valor, IConta contaDestino);

	// Método para imprimir o extrato da conta
	void imprimirExtrato();
}
