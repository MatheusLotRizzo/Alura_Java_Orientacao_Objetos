package JavaUtil.ArrayList;

import java.util.ArrayList;

import HerencaAndConstrutores.modelo.Conta;
import HerencaAndConstrutores.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		//ArrayList lista = new ArrayList();
			
		//<> é chamado de generic
		//Falando que o ArrayLista só sabe guardar tipo Conta
		ArrayList <Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(23, 12);
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		//Conta ref = (Conta) lista.get(0);
		
		for(int i = 0; i < lista.size(); i++) {
			Conta conta = (Conta) lista.get(i);
			System.out.println(conta);
		}
		
		lista.remove(0);
		System.out.println(lista.size());
		
		Conta cc3 = new ContaCorrente(24, 13);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(25, 14);
		lista.add(cc4);
		
		/*
		for(int i = 0; i < lista.size(); i++) {
			Conta ref = (Conta) lista.get(i);
			System.out.println(ref);
		}
		*/
		
		System.out.println("------//------");
		System.out.println("Laço mais moderno:");
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
	}

}
