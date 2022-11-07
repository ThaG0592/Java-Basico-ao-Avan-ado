package br.com.geekuniversity.sessao16;

/*
 * Tratar excessão com try cach
 * utilizamos o try para tentar realizar algo, geral mente aquilo que pode gerar um problema 
 * e o catch para capturar o erro e trazendo para o usuario uma mensagem corrreta para o usuario
 */
public class Programa36 {

	public static void main(String[] args) {
		int numeros [] = new int[5];
		
		for(int i = 0; i < numeros.length; i++ ) {
			numeros[i] = i + 3 * 2;
		}
		for(int i = 0; i <= numeros.length; i++ ) {
			try {//tente fazer isso
			System.out.println(numeros[i]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Você esta tentando acessar uma posição do Array que não existe");
				
			}finally {
				System.out.println("Continua processo");
			}
		}
		

	}

}
