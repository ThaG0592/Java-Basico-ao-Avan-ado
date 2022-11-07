package br.com.geekuniversity.sessao14;
/*
 * Interfaces
 * 
 * O que e quando utilizar
 * 
 * Interfases são conhecidas como contratos 
 * exemplo: um empresa implementar um contrato com regras para definir a criaçção de um protuto ou serviço
 * quem implementar esse contrato é obrigado a seguir as regras
 * o João decidiu implementar um produto ou serviço baseado nesse contrato
 * a Maria também decidiu implementar um produto ou serviço baseado no mesmo contrato
 * Contrato para confecção de um bolo
 * Regras:
 * bolo precissa ser de chocolate
 * deve ter cobertura
 * deve ser rechado
 */
public class Programa33 {

	public static void main(String[] args) {
		Ventilador vent = new Ventilador();
		
		System.out.println("A marca do ventilador " + vent.MARCA);
		vent.desligar(); //não deve imprimir a mensagem
		vent.ligar();//deve imprimir a mensagem
		vent.desligar();//deve imprimir a mensagem
	}

}
