package application;

//import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class Programa {
	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Digite os dados do produto");
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		produto.setNome(nome);
		
		System.out.print("Preco: ");
		double preco = sc.nextDouble();
		produto.setPreco(preco);
		
		System.out.print("Quantidade em estoque: ");
		int quantidade = sc.nextInt();
		produto.setQuantidade(quantidade);
				
		
		System.out.println();
		
		System.out.println("Dados do produto: " + produto);
		System.out.println();
		
		System.out.print("Digite o numero de produtos que serao adicionados no estoque: ");
		int quantidadeAdicionados = sc.nextInt();
		produto.adicionarProdutos(quantidadeAdicionados);
		
		System.out.println();
		
		System.out.println("Dados atualizados: " + produto);
		
		System.out.println();
		
		System.out.print("Digite o numero de produtos que serao removidos do estoque: ");
		int quantidadeRemovidos = sc.nextInt();
		produto.removerProdutos(quantidadeRemovidos);
		
		System.out.println();
		
		System.out.println("Dados atualizados: " + produto);
		
		sc.close();
	}
}