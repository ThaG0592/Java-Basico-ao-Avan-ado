package br.com.geekuniversity.sessao16;

/*
 * Tratar excess�o com try cach
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
				System.out.println("Voc� esta tentando acessar uma posi��o do Array que n�o existe");
				
			}finally {
				System.out.println("Continua processo");
			}
		}
		

	}

}
