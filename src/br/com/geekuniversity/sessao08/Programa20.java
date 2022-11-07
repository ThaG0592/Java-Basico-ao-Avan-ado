package br.com.geekuniversity.sessao08;

import java.util.Scanner;

/* Criando nossas proprias funções
 * 
 * Faça um programa, que recebe diversos nodems 
 * de frutas do ususario e no final imprimas
 * frutas em ordem contraris. O programa deve
 * solicitar eao ususario quantas frutas ele tem
 * 
 * informa quantas frutas ele quer cadastarar:
 * 2
 * 
 * informa o nome de uma fruta:
 * Manga
 * 
 * informe o nome de uma fruta>
 * goiaba
 * 
 * goiaba
 * manga
 */
public class Programa20 {
	//variaveis globais
	static String frutas[];
	static Scanner teclado = new Scanner(System.in);
	static int i;

	public static void main(String[] args) {
		
		//variavel logal
		int qtd;

		System.out.println("informe a quantidade de frutas para cadastrar: ");
		qtd = Integer.parseInt(teclado.nextLine());

		casdatrar_dados(qtd);

		mostrat_dado(qtd);

		teclado.close();

	}

	/*
	 * Uma função deve ter o seguinte: a) Tipo de retorno(tipo de dado que a função
	 * vai retornar) b) nome(corresopnde a ação que a funcao realiza) c)
	 * parametros/argumentos de entrda(opcional) d) retorno (opcional - depende do
	 * tipo de retorno)
	 * 
	 * void = vazio
	 */
	static void casdatrar_dados(int quantidade) {
		// definindo o tamanho do vetor

		frutas = new String[quantidade];

		for (i = 0; i < quantidade; i++) { // i++ i recebe i +1
			System.out.println("Informe a fruta: ");
			frutas[i] = teclado.nextLine();
		}
	}

	static void mostrat_dado(int quantidade) {

		for (i = (quantidade - 1); i >= 0; i--) { // i-- i receebe i -1
			System.out.println(frutas[i]);
		}

	}
}
