package br.com.geekuniversity.sessao01;

/*
 * Public significa publico pode ser utilizado em todo o projeto
 */
import br.com.geekuniversity.sessao11.Cliente;

public class Programa26 {

	public static void main(String[] args) {
		Cliente cil = new Cliente("Anjelina Julie", "Rua joão 13");
		System.out.println("Nome: "  + cil.nome);
		System.out.println("Endereço: " + cil.endereco);

	}

}
