package br.com.geekuniversity.sessao03;
public class Programa04 {

	public static void main(String[] args) {
		//Declarando e inincializando a variavel
		int numero = 2;
		
		/*se numero for maior que 5 rnt�o{
			escreva(numero � miaor que 5)
		}sen�o{
		escreva(n�o � maior que 5)
		}*/
		if(numero>5) {
			System.out.println("Sim, o numero � maior " + numero + " � maior que 5");
		}else if(numero == 5){
			System.out.println("N�o, o numero "  + numero + " � igual a 5");
		}else if(numero % 2 == 0) {
			System.out.println("O numro " + numero + " e par");
		}else {
			System.out.println("N�o, o numero " + numero + "n�o � maior que 5");
		}

	}

}
