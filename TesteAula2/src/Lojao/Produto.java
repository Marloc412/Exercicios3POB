package Lojao;

public class Produto {
	private int id;
	private String nome;
	private String setor;
	private double valor;
	
	public Produto () {
	}
	
	public Produto (int id, String nome, String setor, double valor) {
		this.id = id;
		this.nome = nome;
		this.setor = setor;
		this.valor = valor;
	}
	
	public Produto (String nome, String setor, double valor) {
		this.nome = nome;
		this.setor = setor;
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
