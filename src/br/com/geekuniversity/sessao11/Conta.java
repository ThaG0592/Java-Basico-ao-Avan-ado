package br.com.geekuniversity.sessao11;

/*
 * Getter e Setter
 * 
 * Getter 
 * é um metodo publico que serve para para consultar dados
 * a nomenclatura desses metodos é get_nomedoatributo
 */
public class Conta {
	int numero;
	private float saldo;
	private float limite;
	Cliente cliente;
	
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
		
	}
	
	public void sacar(float valor) {
		if(valor <= this.saldo) {
		this.saldo = this.saldo - valor;
		} else if (valor <=this.saldo + this.limite){
			float val_ret = this.saldo - valor;
			if(val_ret <0){
				this.saldo = 0;
			}
			val_ret = this.limite + val_ret;
			this.limite = val_ret;
			System.out.println("Saldo realizado com sucesso");
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void deposito(float valor) {
		this.saldo = this.saldo + valor;
	}
	//metodos getter 
	public float getSaldo() {
		return this.saldo + this.limite;
	}
	
}
