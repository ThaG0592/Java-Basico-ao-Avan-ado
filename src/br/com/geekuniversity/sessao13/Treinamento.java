package br.com.geekuniversity.sessao13;
//Themplate Methodo

/*
 * final � um modificador de acesso que faz com que o elemento que esteja utilizando n�o possa ser extendido ou reescrito
 */
public abstract class Treinamento {
	
	//Themplate Methodo
	public final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}
	public abstract void preparoFisico();

	public abstract void jogoTreino();
	
	public final void  treinoTatico() {
		System.out.println("Treino tatico...");
	}

}
