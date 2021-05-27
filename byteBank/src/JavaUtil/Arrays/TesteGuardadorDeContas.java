package JavaUtil.Arrays;

import HerencaAndConstrutores.modelo.Conta;
import HerencaAndConstrutores.modelo.ContaCorrente;

public class TesteGuardadorDeContas {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(23, 13);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQtdElementos();
		System.out.println(tamanho);
		
		/*
		Conta ref = guardador.getReferencia(0);
		System.out.println(ref);*/
		
		for(int i = 0; i < tamanho; i++) {
			Conta ref = (Conta) guardador.getReferencia(i);
			System.out.println(ref);
		}
	}

}
