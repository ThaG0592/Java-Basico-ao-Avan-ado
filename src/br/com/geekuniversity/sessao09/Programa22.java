package br.com.geekuniversity.sessao09;

/*
 * Objetos são produtos/ instancias da classe
 */
public class Programa22 {

	public static void main(String[] args) {
		int numero = 4;
		
		//Desclaração de um objeto
		Produto p0;
		
		//declaração e instaciação/iniciação do objeto
		//p1 -> é a instancia do objeto / objeto
		 Produto p1 = new Produto();// Construtor
		 p1.nome = "Notebook";
		 p1.preco = 2.367f;
		 p1.desconto = 15.0f;
		 
		 System.out.println("======Produtos=====");
		 System.out.println(p1.nome);
		 System.out.println("R$ " + p1.preco);
		 System.out.println(p1.desconto +  " %");
		 
		 p0 = new Produto();
		 p0.nome = "Caneta bic";
		 p0.preco = 2.45f;
		 p0.desconto = 5;
				
		 System.out.println("======Produtos=====");
		 System.out.println(p0.nome);
		 System.out.println("R$ " + p0.preco);
		 System.out.println(p0.desconto +  " %");
		 
		 
		 Pessoa pessoa1 = new Pessoa();
		 pessoa1.nome = "angelina Jolie";
		 pessoa1.email = "jolie@gmail.com";
		 pessoa1.ano_nascimento = 1976;
		 
		 System.out.println("======Pessoa=====");
		 System.out.println("Nome " + pessoa1.nome);
		 System.out.println("Email " + pessoa1.email);
		 System.out.println("Anos de Nascimento " + pessoa1.ano_nascimento);
		 
		 
	
		 
	}

}
