package JavaUtil.ArrayList;

import java.util.ArrayList;

import HerencaAndConstrutores.modelo.Conta;
import HerencaAndConstrutores.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		ArrayList <Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(23, 12);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(23, 12);
		lista.add(cc3);
		
		for(Conta conta : lista) {
			if(conta.equals(cc3))
				System.out.println("Conta já existente: "+ conta + " = " + cc3 );
			else
				System.out.println("Conta não existente");
		}
		
		lista.remove(cc3);
		
		System.out.println("Contas:");
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
		
		
	}

}
