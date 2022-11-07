package br.com.geekuniversity.sessao09;

/*
 * Classes
 * 
 * O mes das classes sempre se inicia com a letra maiuscula
 * O nome não deve conter acentuação, caracteres especiais, espaços
 * Nas classes Java não existe a implementaçao da função main()
 * Toda classe poffui a seguinte nome
 * O nome da classe java ser o mesmo nome do arquivo java
 * 
 * public class nomedaclasse ()
 * 
 * 
 * Atributos
 * 
 * São as caracteristicas das classe /molde/modelo de dados
 * Podemos entender aributos como variaveia da classe
 * Uma outra forme de nomenclatura para os atributos são estados 
 * Atributos são nomeados em letras minusculas sem espaço sem caracteres especiais sem acentuação
 * 
 *  
 *  Metodos
 *  
 *  Podemos entender os metodos coo a ação que aé realizada por um objeto da classe
 *  Podemos entender também que os metodos são comportamentos dos objetos da classe
 *  Mesmos requesitos para funções
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
	
	//metodo para aumentar o preço em 10
	void aumentasPreco() {
		this.preco = this.preco + 10;
	}
	
	

}
