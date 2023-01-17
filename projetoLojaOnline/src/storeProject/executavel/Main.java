package storeProject.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import storeProject.produto.Produto;

public class Main {

	public static void main(String[] args) {
		// Instanciando uma lista de vendas
		List<Venda> vendas = new ArrayList<Venda>();
		
		int contVender = 0;
		// Faça novas vendas enquanto o usuário desejar fazer novas compras
		do {
			
			Venda venda = new Venda();

			int qtdProdutos, i = 1, cliente = 1;
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
			
			venda.setDescricao("Venda para o cliente "+cliente);
			venda.setValorDesconto(10.00);
			venda.setValorTotal(somaProdutos - venda.getValorDesconto());
			cliente++;
			
			vendas.add(venda);
			
			contVender = JOptionPane.showConfirmDialog(null, "Deseja fazer uma nova venda?");
		} while (contVender == 0);

		// Saída dos dados da venda
		for (Venda venda : vendas) {
			System.out.println(venda.toString());
		}
	}
}
