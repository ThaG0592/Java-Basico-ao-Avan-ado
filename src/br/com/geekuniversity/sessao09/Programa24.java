package br.com.geekuniversity.sessao09;
/*
 * Contrutor
 * O contrutor de uma classe sempre tem o mesmo nome de uma classe 
 * Podemos ter mais de uim construtor na classe
 * por padrao a jvm cria em tempo de exceução um construtor padrão chamado de vazio
 */

public class Programa24 {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Felicity Jones";
		pessoa1.email = "felicity@gmail.com";
		pessoa1.ano_nascimento = 1986;
		
		System.out.println("Nome " + pessoa1.nome);
		System.out.println("Email " + pessoa1.email);
		System.out.println("Anos de Nascimento " + pessoa1.ano_nascimento);
		
		Pessoa pessoa2 = new Pessoa("Angelina Jolie", "angelia@gmail.com", 1972);
		
		System.out.println("Nome " + pessoa2.nome);
		System.out.println("Email " + pessoa2.email);
		System.out.println("Anos de Nascimento " + pessoa2.ano_nascimento);
		
		Pessoa pessoa3 = new Pessoa("Angelina Jolie", "angelia@gmail.com", 1972);
		pessoa3.imprimeInformacoes();

	}

}
