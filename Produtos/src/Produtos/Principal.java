package Produtos;
import java.util.List;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		// Cadastrando produtos usando os dois construtores
		Produto produto1 = new Produto();
		
		Produto produto2 = new Produto(2, "123456789098","levjnsl36gn","Arroz","Arroz branco", "Alimento", 10.90, 5000.00, "Joao");
		Produto produto3 = new Produto(2, "123456789765","loijnsl90gn","feijão","feijão branco", "Alimento", 9.90, 1000.00, "Marios");
		// Criando lista de Produtos
		ArrayList<Produto> Produtos = new ArrayList<>();
		// Adcionando alunos a lista
		Produtos.add(produto1);
		Produtos.add(produto2);
		Produtos.add(produto3);
		
		// Exibindo todos os Produtos
		exibir(Produtos);
		//Remover um Produtos
		removePro(Produtos, 3);
		// Atualizar um produto
		atualizaNome(Produtos, "macarrão",2);
		atualizaCodigoBarras(Produtos, "123456789012",2);
		atualizaSku(Produtos, "mblcd42p",2);
		atualizaDescricao(Produtos,"espaguete",2);
		atualizaCategoria(Produtos, "Massa",2);
		atualizapreco(Produtos, 5.50 ,2);
		atualizapeso(Produtos, 1000.0 ,2);
		atualizafabricante(Produtos, "Jacare",2);
		// Exibir um Produto
				exibirEspc(Produtos, 2);
		
		
		}
	
	// Criando função para exibir todos os Produtos
	static void exibir(ArrayList<Produto> Produtos) {
		for (int i = 0; i < Produtos.size(); i++) {
			System.out.println(Produtos.get(i).getId());
			System.out.println(Produtos.get(i).getCodigoBarras());
			System.out.println(Produtos.get(i).getNome());
			System.out.println(Produtos.get(i).getSku());
			System.out.println(Produtos.get(i).getDescricao());
			System.out.println(Produtos.get(i).getCategoria());
			System.out.println(Produtos.get(i).getPreco());
			System.out.println(Produtos.get(i).getPeso());
			System.out.println(Produtos.get(i).getFabricante());
			System.out.println("\n");
		}
	}
	
	/// Exibindo produto especifico
		static void exibirEspc(ArrayList<Produto> Produtos, int id) {
			System.out.println(Produtos.get(id-1).getId());
			System.out.println(Produtos.get(id-1).getCodigoBarras());
			System.out.println(Produtos.get(id-1).getNome());
			System.out.println(Produtos.get(id-1).getSku());
			System.out.println(Produtos.get(id-1).getDescricao());
			System.out.println(Produtos.get(id-1).getCategoria());
			System.out.println(Produtos.get(id-1).getPreco());
			System.out.println(Produtos.get(id-1).getPeso());
			System.out.println(Produtos.get(id-1).getFabricante());
			}
		
	// criando função que remove o Produto pelo id dado e depois mostra a nova lista
		static void removePro(ArrayList<Produto> Produtos, int id) {
			Produtos.remove(id-1);
			exibir(Produtos);
		}
		
		/// Atualizando nome 
				static void atualizaNome(ArrayList<Produto> Produtos, String novoNome, int id) {
					Produtos.get(id-1).setNome(novoNome);
					exibirEspc(Produtos, id);
				}
		/// Atualiza Codigo de barras
				static void atualizaCodigoBarras(ArrayList<Produto> Produtos, String novoCodigo, int id) {
					if (novoCodigo.length() == 12) {
						Produtos.get(id-1).setCodigoBarras(novoCodigo);
						exibirEspc(Produtos, id);
					}
					else {
						System.out.println("Codigo Invalido!");
					}
				}
				
		///  Atualiza Sku
				static void atualizaSku(ArrayList<Produto> Produtos, String novoSku, int id) {
					Produtos.get(id-1).setSku(novoSku);
					exibirEspc(Produtos, id);
				}		
		///  Atualiza Descrição
				static void atualizaDescricao(ArrayList<Produto> Produtos, String novoDescricao, int id) {
					Produtos.get(id-1).setDescricao(novoDescricao);
					exibirEspc(Produtos, id);
				}
		///  Atualiza Categoria
				static void atualizaCategoria(ArrayList<Produto> Produtos, String novoCategoria, int id) {
					Produtos.get(id-1).setCategoria(novoCategoria);
					exibirEspc(Produtos, id);
				}
				///  Atualiza preco
				static void atualizapreco(ArrayList<Produto> Produtos, double novoPreco, int id) {
					Produtos.get(id-1).setPreco(novoPreco);
					exibirEspc(Produtos, id);
				}
				
				///  Atualiza peso
				static void atualizapeso(ArrayList<Produto> Produtos, double novoPeso, int id) {
					Produtos.get(id-1).setPeso(novoPeso);
					exibirEspc(Produtos, id);
				}
				///  Atualiza fabricante
				static void atualizafabricante(ArrayList<Produto> Produtos, String novofabricante, int id) {
					Produtos.get(id-1).setFabricante(novofabricante);
					exibirEspc(Produtos, id);
				}
				
			
	
	
	
	

}
