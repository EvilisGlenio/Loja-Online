package storeProject.executavel;

import javax.swing.JOptionPane;

import storeProject.produto.Produto;

public class Main {

	public static void main(String[] args) {

		Venda venda = new Venda();

		int qtdProdutos, i = 1;
		double somaProdutos = 0.0;

		do {
			// Cria um novo produto com nome e valor e adciona à lista Produto()
			Produto produto = new Produto();
			produto.setNome(JOptionPane.showInputDialog("Nome do "+i+"º produto: "));
			produto.setValor(Double.valueOf(JOptionPane.showInputDialog("Valor: R$ ")));
			
			venda.getProdutos().add(produto); // Adcionando produtos à lista
			
			somaProdutos += Double.valueOf(produto.getValor());
			
			qtdProdutos = JOptionPane.showConfirmDialog(null, "Ainda que adcionar produtos?");
			i++;
		} while (qtdProdutos == 0);

		venda.setDescricao("Venda para Rubens");
		venda.setValorDesconto(10.00);
		venda.setValorTotal(somaProdutos-venda.getValorDesconto());
		

		// Saída dos dados da venda
		System.out.println(venda.toString());

	}
}
