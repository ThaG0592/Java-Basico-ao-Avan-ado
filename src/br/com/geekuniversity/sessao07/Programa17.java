//vetor parte 2
package br.com.geekuniversity.sessao07;

public class Programa17 {

	public static void main(String[] args) {
		int numeros [] = new int[10];
		
		System.out.println("Tamano do vetor: " + numeros.length);
	
		for(int i = 0; i < numeros.length; i ++) {
			numeros[i] = i + 3;
		}
		System.out.println(numeros[0]); // primeiro elemeto
		System.out.println(numeros[9]); // ultimo elemento
		
		//0..9
		//numeros [10] = 42;
		//System.out.println(numeros[10]);
		/*
		 * Os vetores / arrays possuem tamanho fixo e não
		 * podem ser aumentados / diminuidas
		 */
		 
		numeros[0] = 7;
		System.out.println(numeros[0]); // primeiro elemeto
		
		//numero[0 = 23.4f;
		/*
		 * O vetores arrays possuem tipos de dados fixos
		 * não podem ser variados
		 */
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) Math.round(Math.random() * 10);
		}
		
		System.out.println(numeros[0]); // primeiro elemeto
		System.out.println(numeros[9]); // ultimo elemento
		
		//0..1 double
		System.out.println(Math.random());
		
		System.out.println(Math.random() * 10);
		
		System.out.println(Math.round(Math.random() * 10));
		
		for (int i : numeros) {
			System.out.println(i);
		}
		 
	}

}
