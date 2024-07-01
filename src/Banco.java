import java.util.List;

public class Banco {

	// Atributo que armazena o nome do banco
	private String nome;

	// Lista que armazena todas as contas do banco
	private List<Conta> contas;

	// Método para obter o nome do banco
	public String getNome() {
		return nome;
	}

	// Método para definir o nome do banco
	public void setNome(String nome) {
		this.nome = nome;
	}

	// Método para obter a lista de contas do banco
	public List<Conta> getContas() {
		return contas;
	}

	// Método para definir a lista de contas do banco
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
}
