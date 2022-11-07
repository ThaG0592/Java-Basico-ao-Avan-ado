//Matriza

/*
 * vetores / arreys / matrizes multi dimencionais
 * vetor
 * int numero[3];
 * numeros[0] = 3
 * nuemros[1] = 2;
 * numeros[2] = 5;
 * 
 * matriz 
 * [linha][colunas]
 * int numeros [3][3]
 * numeros [0][0] = 1;
 * numeros [0][1] = 2;
 * numeros [0][2] = 5;
 * numeros [1][0] = 7;
 * numeros [1][1] = 4;
 * numeros [1][2] = 9;
 * numeros [2][0] = 3;
 * numeros [2][0] = 6;
 * numeros [2][0] = 32;
 */

package br.com.geekuniversity.sessao07;

public class Programa18 {

	public static void main(String[] args) {
		//Decalração
		int outros_numeros[][];
		
		//Declaração e definição de tamanho
		int numeros[][] = new int[3][3];
		
		//Declarar definir o tamanho e inicializar
		int mais_numero [][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		//Declarando uma matriz informando somente as linhas
		int matriz [][] = new int [2][];
		matriz[0] = new int[5];
		matriz[1] = new int [3];
		
		int nova_matriz [][] = {{1,2}, {4,5,6,7,8},{9,10,11}};
	}

}
