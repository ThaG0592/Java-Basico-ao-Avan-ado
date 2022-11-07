package br.com.geekuniversity.sessao14;
/*uma interface pode conter
 *  - constate
 *  - Metodos abstratos
 *  
 *  não pode ter metodos implementados 
 *  
 *  
 * interface que serve de contratos para produtos eletronicos
 * todo produto eletronico que implementar essa interface obrigatoriamente deve implementar os metodos abstratos
 * 
 */
public interface IEletronico {
	public String MARCA = "Geek";//Constante
	public void ligar();
	public void desligar();
}
