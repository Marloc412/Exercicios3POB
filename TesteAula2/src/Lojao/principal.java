package Lojao;

import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome: ");
		String nome1 = sc.nextLine();
		System.out.println();
		System.out.println("Digite seu cep: ");
		String cep1 = sc.nextLine();
		Cliente cli = new Cliente (nome1,cep1);		
		System.out.println("Nome: " + cli.getNome());
		System.out.println("Cep: " + cli.getCep());*/

		
		// chamando usando construtor com todos os atributos
		System.out.println("Digite o id do produto: ");
		int id1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o nome do produto: ");
		String nomeP1 = sc.nextLine();
		System.out.println("Digite o setor do produto: ");
		String setorP1 = sc.nextLine();
		System.out.println("Digite o valor do produto");
		double valorp1 = sc.nextDouble();
		sc.nextLine();
		Produto produc = new Produto (id1,nomeP1,setorP1, valorp1);
		System.out.println("Id: " + produc.getId());
		System.out.println("Nome: " + produc.getNome());
		System.out.println("Setor: " + produc.getSetor());
		System.out.println("Valor: " + produc.getValor());

		// usando o segundo construtor
		System.out.println("Digite o nome do produto: ");
		String nomeP2 = sc.nextLine();
		System.out.println("Digite o setor do produto");
		String setorP2 = sc.nextLine();
		System.out.println("Digite o valor do produto");
		double valorp2 = sc.nextDouble();
		Produto produc2 = new Produto (nomeP2,setorP2, valorp2);
		System.out.println("Nome: " + produc2.getNome());
		System.out.println("Setor: " + produc2.getSetor());
		System.out.println("Valor: " + produc2.getValor());
		
	}

}
