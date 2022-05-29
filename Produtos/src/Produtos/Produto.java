package Produtos;
import java.util.Scanner;

public class Produto {
	private int id;
	private String CodigoBarras;
	private String sku;
	private String nome; 
	private String descricao;
	private String categoria;
	private double preco;
	private double peso;
	private String fabricante;
	
	// contrutos vazio
	public Produto() {
		Scanner  sc = new  Scanner ( System.in );
		
		System.out.println("Digite o id do produto: ");
		this.id = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		System.out.println("Digite o Id do Codigo de Barras do produto: ");
		this.CodigoBarras = sc.nextLine();
		System.out.println();
		
		
		System.out.println("Digite o SKU do produto: ");
		this.sku = sc.nextLine();
		System.out.println();
		
		
		System.out.println("Digite o Nome do produto: ");
		this.nome = sc.nextLine();
		System.out.println();
		
		
		System.out.println("Digite o Descrição do produto: ");
		this.descricao = sc.nextLine();
		System.out.println();
		
		
		System.out.println("Digite o Preço do produto: ");
		this.preco = sc.nextDouble();
		sc.nextLine();
		System.out.println();
		
		System.out.println("Digite o Peso do produto: ");
		this.peso = sc.nextDouble();
		sc.nextLine();
		System.out.println();
		
		System.out.println("Digite o Fabricante  do produto: ");
		this.fabricante = sc.nextLine();
		System.out.println();
	}
	
	// contrutor passando Codigo ... Fabricante.
	public Produto(int id, String CodigoBarras, String sku, String nome, String descricao, String categoria, double preco, double peso, String fabricante) {
		this.id = id;
		this.CodigoBarras = CodigoBarras;
		this.sku = sku;
		this.nome = nome;
		this.descricao = descricao;
		this.categoria = categoria; 
		this.preco = preco;
		this.peso = peso;
		this.fabricante = fabricante; 
		
		// gets and Sets
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodigoBarras() {
		return CodigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		CodigoBarras = codigoBarras;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

}
