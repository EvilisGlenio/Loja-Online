package storeProject.executavel;

import java.util.ArrayList;
import java.util.List;

import storeProject.produto.Produto;

public class Venda {

	// ATRIBUTOS
	private String descricao;
	private Double valorTotal;
	private Double valorDesconto;

	// LISTA
	private List<Produto> produtos = new ArrayList<Produto>();

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// GETTERS e SETTERS
	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Double getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(Double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	

	// ...
	public String toString() {
		return "Venda [descricao=" + descricao + ", valorTotal=" + valorTotal + ", valorDesconto=" + valorDesconto
				+ ", produtos=" + produtos + "]";
	}

}
