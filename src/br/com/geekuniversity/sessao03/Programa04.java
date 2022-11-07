package br.com.geekuniversity.sessao03;
public class Programa04 {

	public static void main(String[] args) {
		//Declarando e inincializando a variavel
		int numero = 2;
		
		/*se numero for maior que 5 rntão{
			escreva(numero é miaor que 5)
		}senão{
		escreva(não é maior que 5)
		}*/
		if(numero>5) {
			System.out.println("Sim, o numero é maior " + numero + " é maior que 5");
		}else if(numero == 5){
			System.out.println("Não, o numero "  + numero + " é igual a 5");
		}else if(numero % 2 == 0) {
			System.out.println("O numro " + numero + " e par");
		}else {
			System.out.println("Não, o numero " + numero + "não é maior que 5");
		}

	}

}
