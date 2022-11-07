package br.com.geekuniversity.sessao19;

import java.util.ArrayList;

/*
 * Listas
 * 
 * Arrays (vetores/Matrizas)
 * Arrey tem tamanho fixo, ou seja, se criar um array com5 elementos ele terá sempre no maximo 5 elementos.
 * Arrey tem um tipo de dado fixo , ou seja, se criar um array de inteiros ele só podera ter um inteiro.
 * Arrauy e dificil de buscar dados só pode ser feita pelo indice
 * 
 * 
 * Colections
 * 
 * Ja possui diversas classes/interfaces que facilitam muito o trabalho
 * se trata de coleção de dados , essas classes /interfaxes são chamadas de Collections
 * 
 * 
 * Listas
 * 
 * Aceitam repetição de valores
 * Possuem tamanha infinito
 */
public class Programa45 {

	public static void main(String[] args) {
		//ArrayList nomes = new ArrayList();
		ArrayList<String> nomes = new ArrayList();
		
		nomes.add("Meria");
		nomes.add("Felicity");
		nomes.add("Angelina");
		nomes.add("Geek");
		nomes.add("Meria");
		
		/*nomes.add(44);
		nomes.add(true);
		nomes.add(12,4);
		nomes.add("e");*/

		System.out.println(nomes.get(0));
		System.out.println(nomes.get(3));
		
		for( int i = 0; i<nomes.size(); i++){
			System.out.println(nomes.get(i));
		}
		}

}
