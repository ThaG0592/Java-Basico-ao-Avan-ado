package br.com.geekuniversity.sessao14;
/*
 * Interfaces
 * 
 * O que e quando utilizar
 * 
 * Interfases s�o conhecidas como contratos 
 * exemplo: um empresa implementar um contrato com regras para definir a cria���o de um protuto ou servi�o
 * quem implementar esse contrato � obrigado a seguir as regras
 * o Jo�o decidiu implementar um produto ou servi�o baseado nesse contrato
 * a Maria tamb�m decidiu implementar um produto ou servi�o baseado no mesmo contrato
 * Contrato para confec��o de um bolo
 * Regras:
 * bolo precissa ser de chocolate
 * deve ter cobertura
 * deve ser rechado
 */
public class Programa33 {

	public static void main(String[] args) {
		Ventilador vent = new Ventilador();
		
		System.out.println("A marca do ventilador " + vent.MARCA);
		vent.desligar(); //n�o deve imprimir a mensagem
		vent.ligar();//deve imprimir a mensagem
		vent.desligar();//deve imprimir a mensagem
	}

}
