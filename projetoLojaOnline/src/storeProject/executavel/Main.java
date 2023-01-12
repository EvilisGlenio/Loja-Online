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
		
		int removeItem = JOptionPane.showConfirmDialog(null, "Gostaria de deletar algum dos itens?");
		
		if (removeItem == 0) {
			
			int item = Integer.valueOf(JOptionPane.showInputDialog("Qual item desejas remover?"));
			double produtoRemovido = venda.getProdutos().get(item-1).getValor();
			venda.getProdutos().remove(item -1);
			somaProdutos -= produtoRemovido;
			
		}

		venda.setDescricao("Venda para Rubens");
		venda.setValorDesconto(10.00);
		venda.setValorTotal(somaProdutos-venda.getValorDesconto());
		

		// Saída dos dados da venda
		System.out.println(venda.toString());

	}
}
