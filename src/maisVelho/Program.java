package maisVelho;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		String nome[] = new String[n];
		int idade[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "º pessoa: ");
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
		}

		int maiorIdade = idade[0];
		int posicaoMaior = 0;
		System.out.print("Pessoa mais velha: ");
		for (int i = 0; i < idade.length; i++) {
			if (idade[i] > maiorIdade ) {
				maiorIdade = idade[i];
				posicaoMaior = i;
			}
		}
		System.out.print(nome[posicaoMaior]);
		sc.close();
	}

}
