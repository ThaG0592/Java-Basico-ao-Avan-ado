package br.com.geekuniversity.sessao13;
/*
 * template methodo
 * 
 * O padrão do template methodo define esqueleto de um algoritmo de um metodo
 * transferindo alguns de seus passos para subclasses. O template methodo permite
 * que as subclasses refinam certos passos  de um algoritmo se alterar a estrutura
 * do periodo do algoritmo
 * 
 * algoritmos são as "receitas" passo a passo para resolver algum problema
 * 
 * recebe o numero 
 * retona o numer * numero 
 */
public class Programa32 {

	public static void main(String[] args) {
		TreinamentoIniciodaTemporada tit = new TreinamentoIniciodaTemporada();
		
		tit.treinoDiario();
		
		TreinamentoFimdaTemporada tft = new TreinamentoFimdaTemporada();
		tft.treinoDiario();

	}

}
