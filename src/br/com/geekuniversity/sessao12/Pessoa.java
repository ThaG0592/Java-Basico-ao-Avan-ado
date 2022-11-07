package br.com.geekuniversity.sessao12;

//agora como classe abstrata
public abstract class Pessoa {
	
	private String nome;
	private int ano_nascimento;
	
	public Pessoa(String nome, int ano_nascimento) {
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return this.ano_nascimento;
	}
	public void setAnoNascimento (int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}
	//declaração de um metodo abstrato
	public abstract void outra_mensagem(String texto);
	
}
