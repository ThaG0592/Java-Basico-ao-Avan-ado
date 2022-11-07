package View;

import java.util.Scanner;

import Model.Calcular;

public class Game {

	static Scanner teclado = new Scanner(System.in);
	static int pontos = 0;
	static Calcular calc;

	public static void main(String[] args) {
		Game.jogar();

	}

	public static void jogar() {
		System.out.println("Informa a dificuldade 1,2,3,4");
		int dificuldade = Game.teclado.nextInt();

		Game.calc = new Calcular(dificuldade);

		System.out.println("informe o resultado");

		if (calc.getOperacao() == 0) {
			System.out.println(calc.getValor1() + "+" + calc.getValor2());
			int resposta = Game.teclado.nextInt();
			if (calc.somar(resposta)) {
				Game.pontos += 1;
				System.out.println("Você tem " + Game.pontos + " pontos");
			}
		} else if (calc.getOperacao() == 1) {
			System.out.println(calc.getValor1() + "-" + calc.getValor2());
			int resposta = Game.teclado.nextInt();
			if (calc.diminuir(resposta)) {
				Game.pontos += 1;
				System.out.println("Você tem " + Game.pontos + " pontos");
			}
		} else if (calc.getOperacao() == 2) {
			System.out.println(calc.getValor1() + "x" + calc.getValor2());
			int resposta = Game.teclado.nextInt();
			if (calc.multiplicar(resposta)) {
				Game.pontos += 1;
				System.out.println("Você tem " + Game.pontos + " pontos");
			}
		}else {
			System.out.println("A opração não é reconhecida " + calc.getOperacao());
		}
		System.out.println("deseja continuar 1- Sim 2- não");
		
		int continuar = Game.teclado.nextInt();
		if(continuar == 1) {
			Game.jogar();
		}else {
			System.out.println("você fez " + Game.pontos);
			System.out.println("até a proxima");
			System.exit(0);
		}
	}

}
