package br.com.geekuniversity.sessao11;

/*
 * Encapsulamento
 * Capsula
 */
public class Programa25 {

	public static void main(String[] args) {
		Cliente joao = new Cliente("João da Silva", "Rua da Paz 45");
		Cliente maria = new Cliente("Maria da Silva", "Rua da Paz 45");
		
		Conta contaJoao = new Conta(1, 100.0f ,200.0f, joao);
		Conta contaMaria = new Conta(2, 300.0f ,500.0f, maria);
		
		System.out.println("Saldo do João antes da movimentação: " + contaJoao.getSaldo());
		System.out.println("Saldo do Maria antes da movimentação: " + contaMaria.getSaldo());
		
		
		contaJoao.sacar(150);
		
		System.out.println("Saldo do João depois da movimentação: " + contaJoao.getSaldo());
		

	}

}
