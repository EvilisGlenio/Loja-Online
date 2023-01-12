package storeProject.produto;

public class Produto {
	// ATRIBUTOS
	private String nome;
	private Double valor;

	// GETTERS e SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	// TO STRING
	public String toString() {
		return "Produto [nome=" + nome + ", valor=" + valor + "]";
	}

}
