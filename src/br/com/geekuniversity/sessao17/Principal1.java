package br.com.geekuniversity.sessao17;

import java.util.Scanner;

import br.com.geekuniversity.sessao11.Cliente;
import br.com.geekuniversity.sessao11.Conta;

/*
 * Gerando executavel jar
 * 
 * Jar - Archive
 * 
 * arquivo compactado do java
 */
public class Principal1 {

	static Cliente cliente = new Cliente("Angelina Jolie", "Rua da Paz 45");
	static Conta conta = new Conta (1,200,300, cliente);
	static Scanner teclado = new Scanner(System.in);
	
	public static void depositar() {
		System.out.println(" ============Deposito============");
		System.out.println("Informe o valor do deposito");
		float valor =  teclado.nextFloat();
		
		if(valor > 0) {
			conta.deposito(valor);
			System.out.println("Deposito efetuado com sucesso");
		}else {
			System.out.println("O Valor precisa ser positivo");
		}
	}
	
	public static void sacar() {
		System.out.println(" ============Saque============");
		System.out.println("Informe o valor do saque");
		float valor =  teclado.nextFloat();
		
		if(valor > 0) {
			conta.deposito(valor);
		}else {
			System.out.println("O Valor precisa ser positivo");
		}
	}
	public static void consulta() {
		System.out.println("Seu saldo é " + conta.getSaldo());
	}
	
	public static void main(String[] args) {

		int opcao = 0;
		
		System.out.println("Bem vindo ao banco Geek");
		
		do {
			
			System.out.println("Selecione as opções abaixo");
			System.out.println("1 - Sacar");
			System.out.println("2 - Depositar");
			System.out.println("3 - Consulta Saldo");
			System.out.println("0 - Sair");
			
			opcao = teclado.nextInt();
			
			switch (opcao) {
			case 1:
				sacar();
				break;
			case 2:
				depositar();
				break;
			case 3:
				consulta();
				break;
			case 0:
				
				break;
			default:
				System.out.println("Opção invalida");
				break;
			}
		}while(opcao > 0);
			teclado.close();		
		

	}

}
