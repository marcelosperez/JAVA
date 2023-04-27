package entities;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;

    public void setNome(String nome) // Os nomes dos metodos em Java comecam com minusculas e camelCase
    {
    this.nome = nome;
    }

	public String getNome()
	{
		return nome;
	}
	
	public void setPreco(double preco)
	{
	   this.preco = preco;
	}

	public double getPreco()
	{
	   return preco;
	}


    public void setQuantidade(int quantidade)
    {
       this.quantidade = quantidade;
    }

    public int getQuantidade()
    {
      return quantidade;
    }

	
	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}

	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome 
				+ ", $ " 
				+ String.format("%.2f", preco) 
				+ ", " 
				+ quantidade 
				+ " unidades, Total: $ "
				+ String.format("%.2f", valorTotalEmEstoque());
	}
}