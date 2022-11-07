package br.com.geekuniversity.sessao16;

import java.util.Scanner;

public class Programa37 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero para divis�o");
		int num1 = teclado.nextInt();
		
		System.out.println("Informe o segundo numero para divis�o");
		int num2 = teclado.nextInt();
		
		try {
		System.out.println("A divis�o do "+ num1 +" pelo "+ num2 +" numero � " + num1/num2 );
		}catch(ArithmeticException e) {
			System.out.println("N�o possivel dividir " + num1 + " por " + num2);
		}
		teclado.close();
	}

}
