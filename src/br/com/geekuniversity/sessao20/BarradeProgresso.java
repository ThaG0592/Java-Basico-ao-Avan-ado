package br.com.geekuniversity.sessao20;
/*
 * Para executar methodos em parlelslo nossa classe implementar a 
 * interface runnable e a o methodo que precisar ser executado em paralelo que precisar ser esecutado entro do melhotod runnerble
 */
public class BarradeProgresso implements Runnable {
	@Override
	public void run() {
		for(int i  = 0; i< 1000; i++) {
			System.out.println(i + "Barra de progresso....aguarde");
		}
		
	}
}
