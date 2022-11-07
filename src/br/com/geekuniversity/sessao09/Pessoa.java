package br.com.geekuniversity.sessao09;
/*
 * Classes
 * 
 * Atributos
 * 
 * Metodos
 * 
 * Contrutores sempre o contrutor vazio vai ser 
 * publi nomeclasse(){}
 */

public class Pessoa {
	
	String nome;
	int ano_nascimento;
	String email;
	
	//construtor vazio
	public Pessoa() {
		
	}
	
	//construtos com parametros
	public Pessoa(String nome, String email, int ano_nascimento) {
		//this = esse objeto
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento; 
	}

	void imprimeInformacoes() {
		System.out.println("Nome " + this.nome);
		System.out.println("Email " + this.email);
		System.out.println("Anos de Nascimento " + this.ano_nascimento);
	}
}
