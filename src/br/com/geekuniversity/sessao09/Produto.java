package br.com.geekuniversity.sessao09;

/*
 * Classes
 * 
 * O mes das classes sempre se inicia com a letra maiuscula
 * O nome n�o deve conter acentua��o, caracteres especiais, espa�os
 * Nas classes Java n�o existe a implementa�ao da fun��o main()
 * Toda classe poffui a seguinte nome
 * O nome da classe java ser o mesmo nome do arquivo java
 * 
 * public class nomedaclasse ()
 * 
 * 
 * Atributos
 * 
 * S�o as caracteristicas das classe /molde/modelo de dados
 * Podemos entender aributos como variaveia da classe
 * Uma outra forme de nomenclatura para os atributos s�o estados 
 * Atributos s�o nomeados em letras minusculas sem espa�o sem caracteres especiais sem acentua��o
 * 
 *  
 *  Metodos
 *  
 *  Podemos entender os metodos coo a a��o que a� realizada por um objeto da classe
 *  Podemos entender tamb�m que os metodos s�o comportamentos dos objetos da classe
 *  Mesmos requesitos para fun��es
 *  Uma funcao deve ter tipo de retorno, nome, parametro e argumentos, retorno
 *  
 *  
 * 	
 *  
 */

public class Produto {
	
	String nome;
	float preco;
	float desconto;
	
	//metodo para aumentar o pre�o em 10
	void aumentasPreco() {
		this.preco = this.preco + 10;
	}
	
	

}
