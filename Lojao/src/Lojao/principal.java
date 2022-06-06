package Lojao;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do array: ");
		int tamanho = sc.nextInt();
		sc.nextLine();
		produto[] prdObj = new produto[tamanho];
		
		
		for (int i=0; i< tamanho; i++) {
			System.out.println("Digite o nome do produto: ");
			String nome = sc.nextLine();
			
			System.out.println("Digite o nome do produto: ");
			double preco = sc.nextDouble();
			sc.nextLine();
			prdObj[i] = new produto(nome, preco);
			
		}
		
		for (int i=0; i<tamanho; i++) {
			int cont = i + 1;
			System.out.println("nome do produto " + cont + ": "+ prdObj[i].getNome());
			System.out.println("Preço do produto " + cont + ": "+ prdObj[i].getPreco());
		}
	}

}
