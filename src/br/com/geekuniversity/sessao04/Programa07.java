package br.com.geekuniversity.sessao04;

import java.util.Scanner;

public class Programa07 {

	public static void main(String[] args) {
		
		int idade = 1;
		String nome;
		
		//dados do usuario via teclado
		Scanner teclado  = new Scanner(System.in);
		
		while (idade > 0) {
			
		System.out.println("Informe seu nome: ");
		nome = teclado.nextLine();
		
		System.out.println("Infome sua idade: ");		
		idade = Integer.parseInt(teclado.nextLine());
		
		System.out.println(nome + " tem " + idade + " anos");
				
		}
		teclado.close();
	}

}
