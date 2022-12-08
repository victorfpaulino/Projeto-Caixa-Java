package prova;

import java.util.Scanner;

public class ProdutosMain {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Produtos prod = new Produtos();
		char opcao;
		do {
			System.out.println("1. Cadastrar Produtos.\n"
					+ "2. Mostrar preço do produto.\n"
					+ "3. Aumentar ou retirar quantidade de produto do estoque.\n"
					+ "4. Alterar o preço do produto.\n"
					+ "5. Finalizar operações.");
			opcao = scan.next().charAt(0);

			switch(opcao) {
			case '1':
				cadastrarDados(prod);
				break;
			case '2':
				mostrarDado(prod);
				break;
			case '3':
				alterarQuantidade(prod);
				break;
			case '4':
				alterarPreco(prod);
				break;
			case '5':
				System.out.println("Operações finalizadas!");
				break;
			default:
				System.out.println("Opção inválida, tente novamente.");
			}		
		}while(opcao != '5');
	} // FIM DO MAIN

	static void cadastrarDados(Produtos pd) {
		System.out.println("Digite o nome do produto: ");
		pd.setNomeProduto(scan.next());
		System.out.println("Digite o código do produto: ");
		pd.setCodigoProduto(scan.nextInt());
		System.out.println("Digite o preço do produto: ");
		pd.setPrecoProduto(scan.nextDouble());
		System.out.println("Digite a quantidade do produto: ");
		pd.setQuantidadeProduto(scan.nextInt());
	}

	static void mostrarDado(Produtos pd) {
		System.out.println("O preço do unitário produto é R$"+pd.getPrecoProduto()+" e o valor do estoque desse produto é R$"+(pd.getQuantidadeProduto()*pd.getPrecoProduto()));
	}

	static void alterarQuantidade(Produtos pd) {
		String resposta;
		System.out.println("Deseja aumentar ou diminuir a quantidade do estoque?");
		resposta = scan.next();

		if (resposta.equals("aumentar") || resposta.equals("diminuir")) {
			int quantidadeAu, quantidadeDi;
			if (resposta.equals("aumentar")) {
				System.out.println("Deseja aumentar qual quantidade do produto? ");
				quantidadeAu = scan.nextInt();
				pd.setQuantidadeProduto(pd.getQuantidadeProduto()+quantidadeAu);
				System.out.println("A nova quantidade do produto em estoque é "+pd.getQuantidadeProduto());
			}
			if (resposta.equals("diminuir")) {
				System.out.println("Qual quantidade deseja retirar?? ");
				quantidadeDi = scan.nextInt();
				pd.setQuantidadeProduto(pd.getQuantidadeProduto()-quantidadeDi);
				System.out.println("A nova quantidade do produto em estoque é "+pd.getQuantidadeProduto());
			}
		}else{
			System.out.println("Opção inválida!");
		}
	}
	
	static void alterarPreco(Produtos pd) {
		double novoPreco, porcentagem;
		System.out.println("Digite o novo preço do produto: ");
		novoPreco = scan.nextDouble();
		porcentagem = ((novoPreco - pd.getPrecoProduto())/pd.getPrecoProduto())*100;
		pd.setPrecoProduto(novoPreco);
		System.out.println("O novo preço do produto é R$"+pd.getPrecoProduto()+" o aumento foi de "+porcentagem+"%");
	}



} // FIM DA CLASSE
